/**
 * 
 */
package com.core.generics;

/**
 * @author Prasad
 *
 */
public class Cat extends Animal {

	private static final String youcantCheetMe;
	static {
		youcantCheetMe="i can..";
	}
	private final String meow;
	public Cat(String name, String meow) {
		super(name);
		// OMG Final variable are intilized in Constructor...
		 this.meow = meow;
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		//this.meow = meow;
	}

	@Override
	public String toString() {
		return "Cat [meow=" + meow + "]";
	}
	public static void main(String[] args) {
	
	}
}
