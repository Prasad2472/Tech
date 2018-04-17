/**
 * 
 */
package com.core.inner;

/**
 * @author pboini
 *
 */
public class PrivateInnerClass {
	private String name;
	Inner inner = new Inner();
	public void sayOuter() {
		System.out.println("Hello");
		
		inner.sayPrivateInner();
	}

	private class Inner {
		public void sayPrivateInner() {
			System.out.println("sayPrivateInner() -->");
			System.out.println("Accessing Outer name-->"+getName());
		}
	}

	public static void main(String[] args) {
		PrivateInnerClass innerClass = new PrivateInnerClass();
		innerClass.setName("Prasad");
		innerClass.sayOuter();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
