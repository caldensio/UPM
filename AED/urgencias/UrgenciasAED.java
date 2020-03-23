//Luis Dominguez Romero z170298 y Jaime Diez-Hochleitner Suarez z170198



package aed.urgencias;

import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;

public class UrgenciasAED implements Urgencias{

	private HeapPriorityQueue<Paciente, Integer> cola=new HeapPriorityQueue<Paciente,Integer>(new PrioridadComparator());
	private Map<String,Entry<Paciente,Integer>> map=new HashTableMap<String,Entry<Paciente,Integer>>();

	public void admitirPaciente(String DNI, int prioridad) {
		Paciente p=new Paciente(DNI, prioridad);	
		Entry<Paciente,Integer> entry= cola.enqueue(p,prioridad);
		map.put(DNI,entry);
	}


	public void salirPaciente(String DNI) throws NoHayPacienteExc {
		if(cola.isEmpty() || !map.containsKey(DNI)) {
			throw new NoHayPacienteExc();
		}

		else {
			Entry<Paciente,Integer> entry=map.get(DNI);
			cola.remove(entry);
			map.remove(DNI);
		}

	}


	public void cambiarPrioridad(String DNI, int nuevaPrioridad) throws NoHayPacienteExc {
		if(!map.containsKey(DNI)) {
			throw new NoHayPacienteExc();
		}
		else {

			Entry<Paciente,Integer> entry=map.get(DNI);

			if(entry.getKey().getPrioridad()!=nuevaPrioridad) {
				cola.remove(entry);
				map.remove(DNI);
				admitirPaciente(DNI, nuevaPrioridad);

			}
		}

	}


	public Paciente getProximoPaciente() throws NoHayPacienteExc {
		if(cola.isEmpty()) 
			throw new NoHayPacienteExc();		
		else 

			return cola.first().getKey();		
	}


	public Paciente atenderPaciente() throws NoHayPacienteExc {
		if(cola.isEmpty()) 
			throw new NoHayPacienteExc();		
		else 

			return cola.dequeue().getKey();
	}


	public void aumentaPrioridad(long maxTiempoEspera) {
		Iterator<Entry<Paciente, Integer>> it=cola.iterator();
		Paciente p;

		while(it.hasNext()) {
			p=it.next().getKey();				
			if(Time.currentTimeMillis()-p.getHoraLlegadaUrgencias()>=maxTiempoEspera){
				if(p.getPrioridad()>0)
					p.setPrioridad((p.getPrioridad())-1);
			}
		}


	}

	
	public Iterable<Paciente> getPacientesPorOrdenDeLlegada() {
		
		Iterator<Entry<Paciente,Integer>> it=cola.iterator();
		PositionList<Paciente> lista=new NodePositionList<Paciente>();
		PositionList<Paciente> aux=new NodePositionList<Paciente>();
		
		while(it.hasNext()) {
			Paciente p=it.next().getKey();
			aux.addLast(p);
		}
		
		for(int i=0; i<cola.size(); i++) {
			lista.addLast(getMenorTiempo(aux));
		}
		
		
		return lista;
	}
	
	private Paciente getMenorTiempo(PositionList<Paciente> lista) {
		Position<Paciente>cursor=lista.first();
		Position<Paciente>borrador=null;
		Paciente p=null;
		while(cursor!=null) {
			if(p==null || cursor.element().getHoraLlegadaUrgencias()<p.getHoraLlegadaUrgencias()) {
				p=cursor.element();
				borrador=cursor;
			}
			cursor=lista.next(cursor);
		}
		lista.remove(borrador);
		
		return p;
	}
}