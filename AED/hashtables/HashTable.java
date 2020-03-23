

//Hecho por Jaime Diez-Hochleitner Suarez z170198 y Luis Dominguez Romero z170298

package aed.hashtables;

import es.upm.aedlib.Position;

import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.Map;


/**
 * Implements the Map interface using a hashtable with separate chaining.
 */
public class HashTable<K,V> implements Map<K,V> {
    private NodePositionList<Entry<K,V>>[] table;
    private int size;

    /**
     * Creates a hash table with the (not modifiable) 
     * number of buckets specified by the <code>tableSize</code> parameter.
     */
    @SuppressWarnings("unchecked")
    public HashTable(int tableSize) {
	NodePositionList<Entry<K,V>>[] table =(NodePositionList<Entry<K,V>>[]) new NodePositionList<?>[tableSize];
	for (int i=0; i<tableSize; i++)
	    table[i] = new NodePositionList<Entry<K,V>>();
	this.table = table;
    }

    private int index(Object key) {
	return Math.abs(key.hashCode() % this.table.length);
    }
    
    private Position<Entry<K,V>> cursorPosicionado(Object key) {
  	  Position <Entry<K,V>> cursor=this.table[index(key)].first();
  	  boolean found=false;	  
  	  while(cursor!=null && !found) {
  		  if(!cursor.element().getKey().equals(key)) {  			  
  			cursor=this.table[index(key)].next(cursor); 
  		  }
  		  else {
  			found=true;
  		  }
  		   
  	  }
  	  return cursor;
    }

    /**
     * Is the table empty?
     */
    public boolean isEmpty() {
    	return size()==0;
    }
    

    /**
     * Returns the size (the number of entries) of the table.
     */
    public int size() {	
    	int tamano=0;
    	for(int i=0; i<this.table.length; i++) {
    		tamano+=this.table[i].size();
    	}
    	return tamano;
    }

    /**
     * Checks if the map contains an entry with key.
     * Returns true if the map contains an entry with key, and
     * false otherwise.
     */
  public boolean containsKey(Object key) {
	  Position <Entry<K,V>> cursor=this.table[index(key)].first();
	  boolean found=false;	  
	  while(cursor!=null && !found) {
		  if(!cursor.element().getKey().equals(key)) {
			  cursor=this.table[index(key)].next(cursor);
		  }
		  else {
			  found=true;
		  }
	  }
	  return found;
  }

    /**
     * Stores a key-value entry.
     * Returns the value of the previous entry with the specified key,
     * or null if no such entry existed.
     */
  public V put(K key, V value) {
	  if(!containsKey(key)) {
		  this.table[index(key)].addLast(new HashEntry<K,V>(key, value));
		  return null;
	  }
	  else {
		  Position<Entry<K,V>> p=cursorPosicionado(key);
		  V valor=p.element().getValue();
		  this.table[index(key)].set(p, new HashEntry<K,V>(key, value));
		  return valor;
	  }
  }

    /**
     * Returns the value associated with the specified key,
     * or null if there is no entry with the key in the map.
     */
    public V get(K key) {
	if(!containsKey(key))
		return null;
	else
		return cursorPosicionado(key).element().getValue();
    }

    /**
     * Removes the key-value entry with the specified key.
     * Returns the value of the removed entry, or null if no such entry
     * existed.
     */
    public V remove(K key) {
    	if(!containsKey(key))
    		return null;
    	else {
    		Position<Entry<K,V>>p=cursorPosicionado(key);
    		V valor=p.element().getValue();
    		this.table[index(key)].remove(p);
    		return valor;    	    
    	}        
    }

    /**
     * Returns an iterable object containing all the keys in entries in
     * the map.
     */
    public Iterable<K> keys() {
	PositionList<K> kys=new NodePositionList<K>();	
	for(int i=0; i<this.table.length; i++) {
		Position<Entry<K,V>> cursor=this.table[i].first();
		while(cursor!=null) {
			kys.addLast(cursor.element().getKey());
			cursor=this.table[i].next(cursor);
		}		
	}
	return kys;
    }

    /**
     * Returns an iterable object containing all the entries in
     * the map.
     */
     public Iterable<Entry<K,V>> entries() {
    	 PositionList<Entry<K,V>> tries=new NodePositionList<Entry<K,V>>();	
    		for(int i=0; i<this.table.length; i++) {
    			Position<Entry<K,V>> cursor=this.table[i].first();
    			while(cursor!=null) {
    				tries.addLast(cursor.element());
    				cursor=this.table[i].next(cursor);
    			}		
    		}
    		return tries;
    }

	@Override
	public Iterator<Entry<K, V>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
