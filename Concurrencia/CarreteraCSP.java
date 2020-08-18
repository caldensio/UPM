package cc.carretera;

import java.util.LinkedList;
import java.util.Queue;

//import java.util.Queue;

import org.jcsp.lang.*;


import es.upm.aedlib.Entry;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;
//import java.lang.Object net.datastructures.NodeQueue<E>;
import es.upm.babel.cclib.Monitor;

//Alumnos:
//z170298: Luis Dominguez Romero
//z170198: Jaime Diez-Hochleitner Suarez

public class CarreteraCSP implements Carretera, CSProcess {

	class Veloid{                                                    //creamos la clase auxiliar Veloid
		private int velocidad;                                    //tiene como parametros la velocidad y el id
		private String id;
		private int tks;

		public Veloid(int velocidad,String id) {
			this.id=id;
			this.velocidad=velocidad;
			this.tks=velocidad;
		}

		public int getTks() {                                    //para obtener los tks del coche
			return this.tks;
		}

		public String getId() {                                //para obtener el id del coche
			return this.id;
		}
		public int getVelocidad() {
			return this.velocidad;
		}

		public void setTks(int newTks) {                        //para establecer los tks de un coche
			this.tks=newTks;
		}
	}

	static class Peticion_Entrar{							//creamos una clase estatica para las peticiones de entrar 
		private One2OneChannel cPetEnt;						//le pasamos como un atributo de la clase un canal 
		private String id;									//le pasamos como un atributo de la clase un string que es un paramtero de entrada del metodo entrar
		private int tks;
	}
	static class Peticion_Avanzar{							//creamos una clase estatica para las peticiones de avanzar
		private One2OneChannel cPetAvanzar;					//le pasamos como un atributo de la clase un canal 
		private String id;									//le pasamos como un atributo de la clase un string que es un paramtero de entrada del metodo avanzar
		private int tks;									//le pasamos como un atributo de la clase un entero que es un paramtero de entrada del metodo avanzar
	}
	static class Peticion_Circulando{						//creamos una clase estatica para las peticiones de circulando
		private One2OneChannel cPetCirculando;				//le pasamos como un atributo de la clase un canal 
		private String id;									//le pasamos como un atributo de la clase un entero que es un paramtero de entrada del metodo circulando

	}
	static class Peticion_Salir{							//creamos una clase estatica para las peticiones de salir
		private One2OneChannel cPetSalir;					//le pasamos como un atributo de la clase un canal 
		private String id;									//le pasamos como un atributo de la clase un entero que es un paramtero de entrada del metodo salir
	}

	static class Peticion_Tick{								//creamos una clase estatica para las peticiones de tick
		private One2OneChannel cPetTick;					//le pasamos como un atributo de la clase un canal 
	}


	// TODO: Declaraci�n de canales
	private final Any2OneChannel chEntrar; 		//un canal para el metodo entra
	private final Any2OneChannel chAvanzar; 	//un canal para el metodo avanzar
	private final Any2OneChannel chSalir; 		// un canal para el metodo salir
	private final Any2OneChannel chCirculando; 	//un canal para el metodo circulando
	private final Any2OneChannel chTick; 		//un canal para los ticks
			

	// Configuraci�n de la carretera
	private Map<Pos, Veloid> carretera;			//la carretera sera un mapa compuesto de dos argumentos(key,value) 
												//siendo el key la posicion en la que esta el coche y el value ser� la clase Veloid que es una clase compuesta por la velocidad y el id del coche
	private final int segmentos;				
	private final int carriles;

	public CarreteraCSP(int segmentos, int carriles) {
		this.segmentos = segmentos;
		this.carriles = carriles;

		// TODO: Creaci�n de canales para comunicaci�n con el servidor
		
		chEntrar = Channel.any2one();			//hacemos que todos los canales sean any2one porque hay muchos procesos ,coche, que son los hilos haciendo el mismo metodo
		chAvanzar = Channel.any2one();
		chSalir = Channel.any2one();
		chCirculando = Channel.any2one();
		chTick = Channel.any2one();

		carretera=new HashTableMap<Pos, Veloid>();

		// Puesta en marcha del servidor: alternativa sucia (desde el
		// punto de vista de CSP) a Parallel que nos ofrece JCSP para
		// poner en marcha un CSProcess
		new ProcessManager(this).start();
	}

	public Pos entrar(String car, int tks) {
		// TODO: c�digo que ejecuta el cliente para enviar/recibir un
		// mensaje al server para que ejecute entrar
		Peticion_Entrar pet = new Peticion_Entrar();		//creamos una peticion de entrar y le sacamos sus argumentos que hemos declarado en su clase
		pet.cPetEnt = Channel.one2one();					//sacamos el canal one2one
		pet.id= car;										//su id ya que tiene como argumento de entrada el coche 
		pet.tks=tks;										//su tks ya que tiene como  argumento de entrada el tks del coche
		chEntrar.out().write(pet);							//en el canal por el que entran las peticiones para entrar metemos una peticion de entrar , pet
		return (Pos) pet.cPetEnt.in().read();					//devolvemos la posicion de entrada del canal de cPetEnt
	}

	public Pos avanzar(String car, int tks) {
		// TODO: c�digo que ejecuta el cliente para enviar/recibir un
		// mensaje al server para que ejecute avanzar
		Peticion_Avanzar pet = new Peticion_Avanzar();		//creamos una peticion de avanzar y le sacamos sus argumentos que hemos declarado en su clase
		pet.cPetAvanzar = Channel.one2one();				//sacamos el canal one2one
		pet.id= car;										//su id ya que tiene como argumento de entrada el coche 
		pet.tks=tks;										//su tks ya que tiene como  argumento de entrada el tks del coche
		chEntrar.out().write(pet);							//en el canal por el que entran las peticiones para avanzar metemos una peticion de avanzar , pet
		return (Pos) chAvanzar.in().read();					//devolvemos la posicion de entrada del canal de cPetAvanzar


	}

	public void salir(String car) {
		// TODO: c�digo que ejecuta el cliente para enviar un mensaje al
		// server para que ejecute salir
		Peticion_Salir pet = new Peticion_Salir();			//creamos una peticion de salir y le sacamos sus argumentos que hemos declarado en su clase
		pet.cPetSalir = Channel.one2one();					//sacamos el canal one2one
		pet.id= car;										//su id ya que tiene como argumento de entrada el coche 
		chSalir.out().write(pet);							//en el canal por el que entran las peticiones para salir metemos una peticion de salir , pet
		pet.cPetSalir.in().read();		

	}

	public void circulando(String car) {
		// TODO: c�digo que ejecuta el cliente para enviar un mensaje al
		// server para que ejecute circulando
		Peticion_Circulando pet = new Peticion_Circulando();//creamos una peticion de circulando y le sacamos sus argumentos que hemos declarado en su clase
		pet.cPetCirculando = Channel.one2one();				//sacamos el canal one2one
		pet.id= car;										//su id ya que tiene como argumento de entrada el coche 
		chCirculando.out().write(pet);						//en el canal por el que entran las peticiones para circulando metemos una peticion de salir , pet
		pet.cPetCirculando.in().read();
	}

	public void tick() {
		// TODO: c�digo que ejecuta el cliente para enviar un mensaje al
		// server para que ejecute tick

		Peticion_Tick pet = new Peticion_Tick();			//creamos una peticion de tick y le sacamos sus argumentos que hemos declarado en su clase
		pet.cPetTick = Channel.one2one();					//sacamos el canal one2one
		chTick.out().write(pet);							//en el canal por el que entran las peticiones para tick metemos una peticion de salir , pet
		pet.cPetTick.in().read();
	}



	// C�digo del servidor
	public void run() {




		// TODO: declaraci�n e inicializaci�n del estado del recurso
		
		Pos  pos = null;
		for(int i=0; i<this.carriles; i++){
			for(int j=0; j<this.segmentos; j++) { //metemos en todas las posiciones null
				pos= new Pos(j+1,i+1);
				carretera.put(pos, null);
			}
		}


		// TODO: declaraci�n e inicializaci�n de estructuras de datos para
		// almacenar peticiones de los clientes


		//vamos a crear aqui los diferentes cases para el swtich de almacenaje en el array de peticiones, para ello los inicializaremos y llamaremos de forma que se relacione a lo que se refiere
		final int ENTRAR=0;						//esto sera el case para entrar
		final int AVANZAR=1;					//esto sera el case para avanzar
		final int SALIR=2;						//esto sera el case para salir
		final int CIRCULANDO=3;					//esto sera el case para circulando
		final int TICK=4;						//esto sera el case para tick

		Queue<Peticion_Entrar> esperanEntrar = new LinkedList<>();			//creamos tantas colas como metodos con parametros de entrada tengamos ,en este caso 3
		Queue<Peticion_Avanzar> esperanAvanzar = new LinkedList<>();
		Queue<Peticion_Circulando> esperanCircular = new LinkedList<>();


		// TODO: declaraci�n e inicializaci�n de arrays necesarios para
		// poder hacer la recepci�n no determinista (Alternative)

		Guard[] entradas = {chEntrar.in(),chAvanzar.in(),chSalir.in(),chCirculando.in(),chTick.in()}; //array de canales creado, es importante el orden

		// TODO: cambiar null por el array de canales

		Alternative servicios = new Alternative(entradas);

		// Bucle principal del servicio

		while(true){

			// TODO: declaraci�n de variables auxiliares

			int servicio;


			// TODO: c�lculo de las guardas



			// TODO: cambiar null por el array de guardas
			servicio = servicios.fairSelect();

			// TODO: ejecutar la operaci�n solicitada por el cliente
			switch (servicio){
			
			case ENTRAR: 	//si servicio es 0

				Peticion_Entrar petEnt = (Peticion_Entrar) chEntrar.in().read();
				esperanEntrar.add(petEnt);


				// TODO: ejecutar operaci�n 0 o almacenar la petici�n y
				// responder al cliente si es posible

				break;
			case AVANZAR:	//si servicio es 1

				Peticion_Avanzar petAvanzar = (Peticion_Avanzar) chAvanzar.in().read();
				esperanAvanzar.add(petAvanzar);

				break;
			case SALIR:		//si servicio es 2

				Peticion_Salir petSalir = (Peticion_Salir) chSalir.in().read();
				String ident = petSalir.id;
				Pos posicion_Actual=getPos(ident);							//obtenemos la posicionActual 
				carretera.put(posicion_Actual, null);
				petSalir.cPetSalir.out().write(null);

				// TODO: ejecutar operaci�n 0 o almacenar la petici�n y
				// responder al cliente si es posible

				break;
			case CIRCULANDO://si servicio es 3

				Peticion_Circulando petCirculando = (Peticion_Circulando) chCirculando.in().read();
				esperanCircular.add(petCirculando);
				

				// TODO: ejecutar operaci�n 0 o almacenar la petici�n y
				// responder al cliente si es posible

				break;
				
			case TICK:		//si servicio es 4
				Peticion_Tick petTick = (Peticion_Tick) chTick.in().read();
				for(Entry<Pos, Veloid> e: carretera.entries()) {						//recorremos el mapa 
					if(e.getValue()!=null) {											//si hay algo 
						e.getValue().setTks(Math.max(0, e.getValue().getTks()-1)); 		//restamos los ticks de esa entry
					}
				}
				petTick.cPetTick.out().write(null);
			    
				break;

				// TODO: ejecutar operaci�n 0 o almacenar la petici�n y
				// responder al cliente si es posible


			}
			// TODO: atender peticiones pendientes que puedan ser atendidas
			
			//atender circular
			for(int i=0; i<esperanCircular.size(); i++) {			//recorremos el list de las peticiones de circulae
				Peticion_Circulando pet= esperanCircular.poll();	//metemos en pet una peticion de esperanCircular
				String ident= pet.id;								//sacamos el id de la peticion
				Pos posicionActual = getPos(ident);				//obtenemos la posicion con nuestro metodo auxiliar getPos con el parametro ident , obtenido antes
			
				if(carretera.get(posicionActual).getTks()!=0) {	//comprobamos la condicion, si los ticks no son 0 la bloqueamos
					esperanCircular.add(pet);						//encolamos de nuevo esa peticion
					}
			  else{
				  pet.cPetCirculando.out().write(null);
				  i=-1;	
				  }
			  }

			  	//atender avanzar
			
			  														
				  int segmento=0;										//inicializamos la variable segmento a 0 que se usara mas tarde para situarse en el segmento siguiente										//inicializamos una posicion auxiliar 
				  for(int i=0; i<esperanAvanzar.size(); i++) {
					  Peticion_Avanzar pet= esperanAvanzar.poll();
					  String ident= pet.id;
					  int velo= pet.tks;
					  Pos posicionActual = getPos(ident);				//obtenemos la posicionActual del id que nos dan con nuestro metodo getPos que recibe un id y devolvemos la posicion en la que esta ese coche
				  		if(posicionActual!=null) {							//si tenemos un coche en esa posicion
					   		segmento = posicionActual.getSegmento()+1;		//a segmento le damos el valor del segmento siguiente al del coche en el que  estamos
					  
					  	for(int j=1; j<=carriles; j++) {					//comprobamos si alguna posicion del siguiente segmento esta libre, si lo esta le damos a pos el valor de dicha posicion
						  if(carretera.get(new Pos(segmento ,j))==null) {//hacemos que se recorra el siguiente segmento
							  pos = new Pos(segmento,j);
						  }
					  
					  
					  carretera.put(posicionActual, null);				//eliminamos la posicion en la que estabamos porque hemos avanzado
					  carretera.put(pos, new Veloid (velo,ident));			//ponemos en la posicion libre el coche
					  pet.cPetAvanzar.out().write(pos);					//usamos el write para desbloquear el proceso
					  i=-1;	
					}				
				  }
				  else {
						esperanAvanzar.add(pet);						//encolamos de nuevo esa peticion
					}
				  }

			//atender entrar
			boolean hayCarril=false;
			Pos posicion= null;
			for(int i=0; i<esperanEntrar.size(); i++) {
				 hayCarril = false;
				Peticion_Entrar pet= esperanEntrar.poll();				//desencolamos la peticion
				String ident = pet.id;
				int velo=pet.tks;
				for(int j=1; j<=carriles && !hayCarril; j++) {
					posicion= new Pos(1,j);								//esta posicion va a recorrer todo el primer segmento
					if(carretera.get(posicion)==null) {					//comprueba si hay posicion
						hayCarril=true;									//si hay --> hayCarril=true
						carretera.put(posicion, new Veloid(velo,ident));		//metemos en la carretera la posicion con los parametros que hemos obtenido antes
						pet.cPetEnt.out().write(posicion);						//usamos el write para desbloquear el proceso
						i=-1;
				}
					
				}
				if(hayCarril==false){
					esperanEntrar.add(pet);							//si no encolamos de nuevo la peticion	
				}
				
			}

		
			  
			  
			  
			}








	}
	private Pos getPos(String id) {								//metodo auxiliar para obtner la posicion de un coche segun su id
		Pos pos_Actual=null;										//inicializacmos una posicion auxiliar
		for(Entry<Pos, Veloid> e: carretera.entries()) {			//recorremos las entries del map
			if(e.getValue()!=null && id==e.getValue().getId()) {//si hay algo en la entry y el id es igual al id de la entry 
				pos_Actual=e.getKey();							//le damos a pos_Actual el valor de la key de esa entry
			}
		}


		return pos_Actual;										//devolvemos la pos_Actual
	}
}




