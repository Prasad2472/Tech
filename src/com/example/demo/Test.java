/**
 * 
 */
package com.example.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prasad
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getSomething());
		
		Map<String, String>map=new HashMap<>();
		map.put(null, "Hello World");
		
		System.out.println("Null Key value is:"+map.get(null));
	}

	public static int getSomething() {

		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}

	}

}
