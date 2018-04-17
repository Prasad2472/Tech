package com.core.inner;

/**
 * 
 * @author pboini
 *
 */
public class PublicStaticInnerDemo {

	private String name;
	private static String age="25";

	public void helloStaticOuter() {
		System.out.println("Hello....helloStaticOuter>");
	}

	public static class InnerStatic {

		public void helloStaticInner() {
			// Cannot access Outer instance methods and variables..
			System.out.println("Hello....helloStaticInner>");
			System.out.println("Hello....helloStaticInner> Age;;"+age);
			
		}
	}

	public static void main(String[] args) {

		PublicStaticInnerDemo.InnerStatic innerStatic=new PublicStaticInnerDemo.InnerStatic();
		
		innerStatic.helloStaticInner();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
