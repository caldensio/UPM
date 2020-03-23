//Luis Dominguez Romero z170298 y Jaime Diez-Hochleitner Suarez z170198


package aed.caminos;

import java.util.Iterator;


import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;

import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;


public class Transportistas {
  private DirectedGraph<Point,Integer> graph;
  private HashTableMap<Point,Vertex<Point>> mapaVertices;

  
  public Transportistas(Integer[][] map) {
	  graph=new DirectedAdjacencyListGraph<Point,Integer>();
	  mapaVertices=new HashTableMap<Point,Vertex<Point>>();
	  Point p;
	  for(int x=0; x<map.length;x++) {
		  for(int y=0; y<map[x].length;y++) {
			  if(map[x][y]!=null) {
				  p=new Point(x,y);
				  Vertex<Point> v=graph.insertVertex(p);
				  mapaVertices.put(p, v);
			  }
		  }
	  }
	  
	  PositionList<Entry<Point,Vertex<Point>>>listaNodos=(PositionList<Entry<Point, Vertex<Point>>>) mapaVertices.entries();
	  Position <Entry<Point,Vertex<Point>>> cursor=listaNodos.first();
	  Position <Entry<Point,Vertex<Point>>> aux=listaNodos.first();
	  Entry<Point,Vertex<Point>> punto;
	  Entry<Point,Vertex<Point>> puntoCercano;
	  while(cursor!=null) {
		  while(aux!=null) {
			  punto=cursor.element();
			  puntoCercano=aux.element();
			  if(!(punto.equals(puntoCercano)) && (Math.abs(punto.getKey().getX()-puntoCercano.getKey().getX())<=1 && Math.abs(punto.getKey().getY()-puntoCercano.getKey().getY())==0 || Math.abs(punto.getKey().getX()-puntoCercano.getKey().getX())==0 && Math.abs(punto.getKey().getY()-puntoCercano.getKey().getY())<=1)) {
				  Integer coste=Math.max(map[puntoCercano.getKey().getX()][puntoCercano.getKey().getY()]-map[punto.getKey().getX()][punto.getKey().getY()], 0);
				  graph.insertDirectedEdge(punto.getValue(), puntoCercano.getValue(), coste+1);
			  } 
			  aux=listaNodos.next(aux);
		  }
		  cursor=listaNodos.next(cursor);
		  aux=listaNodos.first();
	  }
  }
  
 
  
 
  
 
  
  

  public PositionList<Point> pathFromTo(Point fromPoint, Point toPoint) {
	  
	  PositionList<Point> camino=new NodePositionList<Point>();
	  Vertex<Point> fromVertex=mapaVertices.get(fromPoint);
	  Vertex<Point> toVertex=mapaVertices.get(toPoint);
	  return findOnePath(camino,fromVertex, toVertex);
  }
  
  
  private PositionList<Point> findOnePath(PositionList<Point> camino,Vertex<Point> vFrom, Vertex<Point> vTo){
	  
	  if(vFrom.equals(vTo)) {
		  camino.addLast(vFrom.element());
		  System.out.println(camino);
		  return camino;
	  }
	  
	  Iterator<Edge<Integer>> it=graph.outgoingEdges(vFrom).iterator();
	  
	  PositionList<Point> resultado=null;
	  while(it.hasNext() && resultado==null) {
		  Edge<Integer> arista=it.next();
		  Vertex<Point> verticeActual=graph.startVertex(arista);
		  Vertex<Point> verticeSiguiente=graph.endVertex(arista);
		  if(!verticeSiguiente.equals(verticeActual) && !pathContainsVertex(camino, verticeSiguiente)) {
			  camino.addLast(verticeActual.element());
			  resultado=findOnePath(camino, verticeSiguiente, vTo);
			  
			  if(resultado==null) {
				  camino.remove(camino.last());
			  }
		  }
	  }
	return resultado;
  }


private boolean pathContainsVertex(PositionList<Point> camino, Vertex<Point> vTo) {
	for(Point p: camino) {
		if(vTo.equals(mapaVertices.get(p))) {
			return true;
		}
	}
	return false;
}









public PositionList<Point> bestPathFromTo(Point fromPoint,Point toPoint) {
    return null;
  }
}
