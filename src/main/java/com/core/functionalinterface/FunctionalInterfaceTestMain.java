/**
 * 
 */
package com.core.functionalinterface;

/**
 * @author Prasad
 *
 */
public class FunctionalInterfaceTestMain implements FunctionalInterfaceTest, InterfaceTwo {

	@Override
	public void sayHai() {
	System.out.println("hai");	
	}

	@Override
	public void test() {
	System.out.println("testF");	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main...");
		
		
	}

}
