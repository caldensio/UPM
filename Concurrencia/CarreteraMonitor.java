// N// Nunca cambia la declaracion del package!
package cc.carretera;

import es.upm.aedlib.Entry;
import es.upm.aedlib.fifo.FIFOList;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.babel.cclib.Monitor;

/**
 * Implementación del recurso compartido Carretera con Monitores
 */
public class CarreteraMonitor implements Carretera {
  // TODO: añadir atributos para representar el estado del recurso y
  // la gestión de la concurrencia (monitor y conditions)
	
	private Monitor mutex;
	private Monitor.Cond cond_entrar;
	private Monitor.Cond cond_avanzar [];
	private Monitor.Cond cond_circulando;
	private Monitor.Cond cond_salir;
	private int segmentos;                             
	private int carriles;
	private Map<Pos,Veloid> carretera;
	
	
	private FIFOList<Pos> entradas_Disponibles;
	private FIFOList<Pos> avanzar_Disponibles;
	private FIFOList<PeticionCircular> esperanCircular = new FIFOList<PeticionCircular>();
	
	
	static private class PeticionCircular {
		private String coche;
		private Monitor.Cond condition;

		public PeticionCircular(String coche, Monitor.Cond condition) {
			this.coche = coche;
			this.condition = condition;
		}

		public String getCoche() {
			return this.coche;
		}

		public Monitor.Cond getCondition() {
			return this.condition;
		}

	}
	

  public CarreteraMonitor(int segmentos, int carriles) {
    // TODO: inicializar estado, monitor y conditions
	  this.segmentos=segmentos;
	  this.carriles=carriles;
	  carretera=new HashTableMap<Pos,Veloid>();
	  entradas_Disponibles=new FIFOList <Pos>();
	  mutex= new Monitor();
	  avanzar_Disponibles=new FIFOList <Pos>();
	 
	  
	  cond_entrar = mutex.newCond();
	  cond_avanzar = new Monitor.Cond[segmentos];  
	  for (int i=0; i<segmentos;i++) {
		 cond_avanzar[i]=mutex.newCond();
	  }
	  cond_circulando = mutex.newCond();	
	  Pos posicion=null;
	  for(int i=0; i<this.carriles; i++){
		  for(int j=0; j<this.segmentos; j++) {
			  posicion= new Pos(j+1,i+1);
		      carretera.put(posicion, null);
		  }
	  }
  }

  public Pos entrar(String id, int tks) {
	  mutex.enter();
	  boolean hayCarril=false;
      Pos posicion=null;
      
      for(int i=1; i<=this.carriles && !hayCarril ; i++) {
             posicion= new Pos(1,i);
          if(carretera.get(posicion)==null) {
            hayCarril=true;
          }
          }
      if(hayCarril==false) {
          cond_entrar.await();
      }

          carretera.put(posicion, new Veloid(tks,id));
          desbloqueo_simple();
          mutex.leave();                                        //mutex.leave obligatorio
          return posicion;
  }
  


	 // if(pos_Actual!=null && carretera.get(pos_Actual).getTks()==0 ) {
		//  cond_circulando.signal();
	  //}
	  

	  
	  
  
  public Pos avanzar(String id, int tks) {
	  mutex.enter();
	  Pos posicionActual =getPos(id);
	  int segmento=0;
	  Pos pos = null;
	  if(posicionActual!=null) {
		   segmento = posicionActual.getSegmento()+1;
		  
		  for(int i=1; i<=carriles; i++) {
			  if(carretera.get(new Pos(segmento ,i))==null) {
				  pos = new Pos(segmento,i);
			  }
		  }
		  
		  if(pos==null) {
			cond_avanzar[posicionActual.getSegmento()-1].await();
		  }
		  carretera.put(pos, new Veloid (tks,id));
	  
	  }
	  desbloqueo_simple();
	  mutex.leave();
	  return pos;
	  

  }
  

  public void circulando(String id) {
    // TODO: implementar circulando
	  mutex.enter();
	  Pos posicionActual = getPos(id);
	  if(posicionActual==null || carretera.get(posicionActual).getTks()!=0 ) {
		  Monitor.Cond condCliente = mutex.newCond();
			esperanCircular.enqueue(new PeticionCircular(id, condCliente));
			condCliente.await();
	  }
	  
	  desbloqueo_simple();
	  mutex.leave();
  }
  
  
  public void desbloqueo_simple() {
	  
	
	  boolean signal = false;
	  if(!esperanCircular.isEmpty()){
	  PeticionCircular pet =esperanCircular.dequeue();
	  for(int i=1; i<=segmentos; i++) {
		  
		  //aqui falta el if de que si hay 
		  Monitor.Cond cond= cond_avanzar[i];
	  }
	  
	  String id= pet.getCoche();
	  Pos posicionActual = getPos(id);
	  
	  if(posicionActual!=null && carretera.get(posicionActual).getTks()==0 && cond_circulando.waiting()>0) {
		  signal=true;
		  cond_circulando.signal();
		   
	  }
	  }
	  boolean hayCarril=false;
      Pos posicion=null;
      
      for(int i=1; i<=this.carriles && !hayCarril ; i++) {
             posicion= new Pos(1,i);
          if(carretera.get(posicion)==null) {
            hayCarril=true;
          }
          }
      if(hayCarril!=false) {
          cond_entrar.signal();
      }
     
	
	
	  }

  public void salir(String id) {
    // TODO: implementar salir
	  mutex.enter();
	  Pos posicion_Actual=getPos(id);
	  int tks=carretera.get(posicion_Actual).getTks();
	  if(!(posicion_Actual.getSegmento()==segmentos &&  tks==0)) {
		  cond_salir.await();
	  }
	  carretera.put(posicion_Actual, null);
	  mutex.leave();
  }

  public void tick() {
    // TODO: implementar tick 
	  mutex.enter();
	  for(Entry<Pos, Veloid> e: carretera.entries()) {
		  if(e.getValue()!=null) {
			  e.getValue().setTks(Math.max(0, e.getValue().getTks()-1));
		  }
	  }
	  mutex.leave(); 
  }
  
  class Veloid{
		 private int velocidad;
		 private String id;
		 private int tks;
		 
		 public Veloid(int velocidad,String id) {
			 this.id=id;
			 this.velocidad=velocidad;
			 this.tks=velocidad;
		 }
		 
		 public int getTks() {
			 return this.tks;
		 }
		 
		 public String getId() {
			 return this.id;
		 }
		 public int getVelocidad() {
			 return this.velocidad;
		 }
		 
		 public void setTks(int newTks) {
			 this.tks=newTks;
		 }
	 }
  

  
  private Pos getPos(String id) {
	  Pos pos_Actual=null;
	  for(Entry<Pos, Veloid> e: carretera.entries()) {
	    	if(e.getValue()!=null && id==e.getValue().getId()) {
	    		pos_Actual=e.getKey();
	    	}
	    }
	 
	  
	  return pos_Actual;
  }
  
  
}

