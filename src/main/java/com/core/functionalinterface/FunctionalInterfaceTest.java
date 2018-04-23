/**
 * 
 */
package com.core.functionalinterface;

/**
 * @author Prasad
 *
 */
//@FunctionalInterface
public interface FunctionalInterfaceTest {
	void test();

	default void sayGreetingMsg() {
		System.out.println("Hello Good Mor");
	}

	public static void sayHello() {
		System.out.println("Test..F");
	}
}
