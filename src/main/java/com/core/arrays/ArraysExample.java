package com.core.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Prasad", "boini");
		//names.add("Srihith");
		/**
		 * 
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.util.AbstractList.add(AbstractList.java:148) at
		 * java.util.AbstractList.add(AbstractList.java:108) at
		 * com.core.arrays.ArraysExample.main(ArraysExample.java:11)
		 * 
		 */
		System.out.println(names);
		
		
		

	}

}
