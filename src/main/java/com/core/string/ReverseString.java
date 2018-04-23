/**
 * 
 */
package com.core.string;

/**
 * @author Prasad
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "Dogs hates cats";
		System.out.println("String Builder reverse..>" + new StringBuilder(string).reverse());
		// char[] c=new char[string.length()];
		char[] c = string.toCharArray();
		char temp;
		for (int i = 0; i < c.length / 2; i++) {
			temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		System.out.println("Reverse String String...>" + new String(c));
	}
}
