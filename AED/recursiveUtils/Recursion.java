package aed.recursiveUtils;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

//Luis Dominguez Romero z170298	y Jaime Diez-Hochleitner Suarez z170198
public class Recursion {

  /**
   * Returns the position found by advancing n steps forwards in l,
   * starting at pos, if n is positive, and if negative,
   * returns the position found by retracting n steps.
   * @return the position found.
   */
  public static <E> Position<E> getPosition(PositionList<E> l, Position<E> pos, int n) {
	  if(l==null || l.isEmpty()) {
		  return null;
	  }
	  else {
		  return getPositionRec(l,pos,n);
	  }	  
  }
  
  private static <E> Position<E> getPositionRec(PositionList<E> l, Position<E> pos, int n) {

	  if(n==0) {
		  return pos;
	  }
	  else if(n>0) {
		  return getPositionRec(l, l.next(pos), n-1);
	  }
	  else {
		  return getPositionRec(l, l.prev(pos), n+1);
	  }
  }

  /**
   * Returns a new positionlist filled with characters resulting
   * from using the encodedText to navigate the alphabet positionlist,
   * using the navigation discipline explained in the getPosition method.
   * @return a new positionlist.
   */
  public static PositionList<Character> decrypt(PositionList<Character> alphabet, PositionList<Integer> encodedText) {
    if(encodedText==null || encodedText.isEmpty()) {
    	return null;
    }
    else {
    	PositionList<Character> l=new NodePositionList<Character>();
    	return decryptRec(alphabet, encodedText, alphabet.first(), encodedText.first(), l);
    }
  }
  
  private static PositionList<Character> decryptRec(PositionList<Character> alphabet, PositionList<Integer> encodedText, Position<Character> cursorCHAR, Position<Integer>cursorINT, PositionList<Character> nuevaLista) {
	    if(cursorINT==null) {
	    	return nuevaLista;
	    }
	    else {
	    	cursorCHAR=getPosition(alphabet ,cursorCHAR, cursorINT.element().intValue());
	    	nuevaLista.addLast(cursorCHAR.element());
	    	return decryptRec(alphabet, encodedText, cursorCHAR, encodedText.next(cursorINT), nuevaLista);
	    }
	  }

  /**
   * Checks if the string is balanced, i.e., 
   * if the open symbols '{', '[' and '(' are closed
   * correctly with closing symbols '}', ']' and ')'.
   * @return true if the parameters string is balanced, and
   * false if it is not.
   */
  public static boolean isBalanced(String s) {
	  if(s==null || s.isEmpty()) {
		  return true;
	  }
	  else {
		  boolean correctos=true;
		  return isBalancedRec(s, 0,1,correctos);
	  }
  }

  private static boolean isBalancedRec(String s, int i, int j, boolean correctos) {
	return false;
  }

  private static boolean opens(char c) {
	  if(c=='(' || c=='{' || c=='[') {
		  return true;
	  }
	  else {
		  return false;
	  }
  }

  private static boolean closes(char c) {
	  if(c==')' || c=='}' || c==']') {
		  return true;
	  }
	  else {
		  return false;
	  }
  }

  private static boolean matches(char c1, char c2) {
	  if(c1=='(' && c2==')' || c1=='{' && c2=='}' || c1=='[' && c2==']') {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
