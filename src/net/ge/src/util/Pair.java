package net.ge.src.util;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public K getKey(){
		return key;
	}
	public V getValue() {
		return value;
	}
	public K setKey(K _key){
		key = _key;
		return key;
	}
	public V setValue(V _value) {
		value = _value;
		return value;
	}
	
}
