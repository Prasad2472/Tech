/**
 * 
 */
package com.core.jvm.crash;

/**
 * @author Prasad
 *
 */
public class Crash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Object[] o = null;

		while (true) {
			o = new Object[] { o };
		}

		/**
		 * Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit
		 * exceeded at com.core.jvm.crash.Crash.main(Crash.java:20)
		 * 
		 */
	}

}
