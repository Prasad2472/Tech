/**
 * 
 */
package com.core.generics;

/**
 * @author Prasad
 *
 */
public class Dog extends Animal {

	private String barking;

	public Dog(String name, String barking) {
		super(name);
		this.barking = barking;
	}

	public String getBarking() {
		return barking;
	}

	public void setBarking(String barking) {
		this.barking = barking;
	}

	@Override
	public String toString() {
		return "Dog [barking=" + barking + ", getName()=" + getName() + "]";
	}
}
