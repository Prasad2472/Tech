/**
 * 
 */
package com.core.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

/**
 * @author Prasad
 *
 */
public class IterableHashMapExample {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		hashMap();
	}

	public static void identityHashMap() {
		IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
		Integer key1 = new Integer(10);
		Integer key2 = new Integer(10);
		Integer key3 = new Integer(10);
		identityHashMap.put(key1, "Ten");
		identityHashMap.put(key2, "Ten Ten");
		identityHashMap.put(key3, "Ten Ten Ten");
		System.out.println(identityHashMap);

		key1 = null;
		key2 = null;
		key3 = null;
		System.out.println("After nullifying Keys, The identityMap is:" + identityHashMap);
	}

	public static void weakHashMap() throws InterruptedException {
		WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
		Integer key1 = new Integer(10);
		Integer key2 = new Integer(20);
		Integer key3 = new Integer(30);
		weakHashMap.put(key1, "Ten");
		weakHashMap.put(key2, "Ten Ten");
		weakHashMap.put(key3, "Ten Ten Ten");
		System.out.println(weakHashMap);
		key1 = null;
		key2 = null;
		key3 = null;
		System.gc();
		System.out.println("Waiting...");
		System.out.println("After nullifying Keys, The weakHashMap is:" + weakHashMap);
	}
	
	public static void hashMap()  {
		HashMap<Integer, String> hashMap = new HashMap<>();
		Integer key1 = new Integer(10);
		Integer key2 = new Integer(20);
		Integer key3 = new Integer(30);
		hashMap.put(key1, "Ten");
		hashMap.put(key2, "Ten Ten");
		hashMap.put(key3, "Ten Ten Ten");
		System.out.println(hashMap);
		key1 = null;
		key2 = null;
		key3 = null;
		System.gc();
		System.out.println("Waiting...");
		System.out.println("After nullifying Keys, The HashMap is:" + hashMap);
	}
}
