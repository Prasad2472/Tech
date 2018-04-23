/**
 * 
 */
package com.core.inhiritence;

/**
 * @author Prasad
 *
 */
public class Child extends Parent{

	
	@Override
	public Integer getBalance() {
		System.out.println("Child");
		return 100;
	}
}
