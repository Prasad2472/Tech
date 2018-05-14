/**
 * 
 */
package com.core.autobox;

/**
 * @author Prasad
 *
 */
public class AutoBoxingFail {

	public static void main(String[] args) {
		/**
		 * AutoBoxing will fail while assigning int[] to Integer[] or from Integer[] to
		 * int[]
		 */
		// Integer[] array=new int[10];
		// int[] array=new Integer[10];
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		Integer c = new Integer(128);
		Integer d = new Integer(128);
		System.out.println(a == b);// false
		System.out.println(c == d);// false
		
		
		
	}

}
