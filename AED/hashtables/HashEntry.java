package aed.hashtables;

import es.upm.aedlib.Entry;


class HashEntry<K,V> implements Entry<K,V> {
    protected K key;
    protected V value;
    public HashEntry(K k, V v) { key = k; value = v; }
    public V getValue() { return value; }
    public K getKey() { return key; }
    public V setValue(V val) {
	V oldValue = value;
	value = val;
	return oldValue;
    }
    
    public boolean equals(Object o) {
	if (o instanceof HashEntry<?,?>) {
	    HashEntry<?,?> ent = (HashEntry<?,?>) o;
	    return (ent.getKey().equals(key)) && (ent.getValue().equals(value));
	} else return false;
    }

    public int hashCode() {
      return
        (key==null ? 0 : key.hashCode())
        + (value==null ? 0 : value.hashCode());
    }
    
    /** Entry visualization. */
    public String toString() {
	return "(" + key + "," + value + ")";
    }
}


