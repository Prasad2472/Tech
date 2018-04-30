/**
 * 
 */
package com.core.method.overload;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Prasad
 *
 */
public class MethodOverLoad {

	public void processData(Collection<String> names) {

		System.out.println("Collection of names:" + names);

	}

	public void processData(List<String> names) {

		System.out.println("List of names:" + names);

	}

	public void processData(String name) {

		System.out.println("Name:" + name);

	}

	/**
	 * Return type is not as part of Method overloading
	 */
	/*
	 * public int processData(String name) {
	 * 
	 * System.out.println("Name:" + name); return 0;
	 * 
	 * }
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MethodOverLoad load = new MethodOverLoad();

		List<String> names = Arrays.asList("prasad", "Boini", "Tmd");
		load.processData(names);
		/**
		 * he method processData(Collection<String>) is ambiguous for the type
		 * MethodOverLoad
		 */
		// load.processData(null);

	}

}
