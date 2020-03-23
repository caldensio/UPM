//Luis Dominguez Romero z170298 Jaime Diez-Hochleitner Suarez

package aed.treesearch;


import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.set.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;


public class TreeSearch {

public	static Set<Position<String>> search (Tree<String> t, PositionList<String> searchExpr){
	if(t==null || searchExpr==null || t.isEmpty() || searchExpr.isEmpty())
		return null;
	
	else {
		System.out.println(t);
		Set<Position<String>> set=new PositionListSet<Position<String>>();
		searchRec(t, searchExpr, searchExpr.first(), t.root(), set);
		return set;
	}
		
}

private static void searchRec (Tree<String> t,PositionList<String> searchExpr, Position<String> posExpr, Position<String> posTree, Set<Position<String>> set){
	
	String o1=posExpr.element();
	String o2=posTree.element();
	posExpr=searchExpr.next(posExpr);

	if(o1.equals(o2) || o1.equals("*")) {
		if(posExpr==null) {
			set.add(posTree);
		}
		else {
			for(Position<String> w: t.children(posTree)) {
				searchRec(t, searchExpr, posExpr, w, set);
			}
		}
	}
}

public static Tree<String> constructDeterministicTree(PositionListSet<PositionList<String>> paths) {
	
	if(paths==null || paths.isEmpty())
		return null;
	
	LinkedGeneralTree<String> dTree = new LinkedGeneralTree<String>();
	Iterator <PositionList<String>> it = paths.iterator();
	PositionList<String> list =it.next();
	dTree.addRoot(list.first().element());
	while(it.hasNext()) {
		list =it.next();
		//crearCaminos(list, dTree, dTree.root(), list.first());
	}
	return dTree;
}

//private static void crearCaminos(PositionList<String> list, Tree<String> dTree, Position<String> posTree, Position<String> posList) {
//		Position<String> aux=null;
//		
//		while()
//	}
}