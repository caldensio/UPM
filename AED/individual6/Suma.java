//Luis Dominguez Romero

package aed.individual6;

import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;
import es.upm.aedlib.map.HashTableMap;


public class Suma {
	public static <E> Map<Vertex<Integer>,Integer> sumVertices(DirectedGraph<Integer,E> g) {
		
		Map<Vertex<Integer>,Integer> m = new HashTableMap<Vertex<Integer>,Integer>();

		for (Vertex<Integer> v : g.vertices()) {
			Set<Vertex<Integer>> setVisitados = new HashTableMapSet<Vertex<Integer>>();
			m.put(v,sumaConexiones(g,v,setVisitados, 0));
		}

		return m;
	}

	private static <E> int sumaConexiones(DirectedGraph<Integer,E> g, Vertex<Integer> v, Set<Vertex<Integer>> s, int total) {
		
		s.add(v);
		total += v.element();
		
		for (Edge<E> e : g.outgoingEdges(v)) {
			Vertex<Integer> endVertex = g.endVertex(e);
			
			if (!s.contains(endVertex)) {
				total += sumaConexiones(g, endVertex, s, 0);
			}
		}
		return total;
	}
}
  

