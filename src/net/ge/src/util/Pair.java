package net.ge.src.util;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K i, V j) {
		key = i;
		value = j;
	}
	public K getKey(){
		return key;
	}
	public V getValue() {
		return value;
	}
    public K setKey(K k){
        this.key = k;
        return key;
    }
    public V setValue(V v){
        this.value = v;
        return value;
    }

}
