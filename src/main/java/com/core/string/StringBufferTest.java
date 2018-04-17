package com.core.string;

public class StringBufferTest {

	public static void main(String[] args) {
		/**
		 * String Buffer Default capacity is 16, after that newcapacity=
		 * currentcapacity*2 +2 Returns the current capacity increased by the same
		 * amount + 2 if
		 */
	/*	StringBuffer buffer = new StringBuffer();

		System.out.println("Default-->" + buffer.capacity());
		buffer.append("Hey");

		System.out.println("Hey-->" + buffer.capacity());
		buffer.append("Hello");
		System.out.println("Hello-->" + buffer.capacity());

		buffer.append("World");
		System.out.println("World-->" + buffer.capacity());

		buffer.append("Welcome");
		System.out.println("Welcome-->" + buffer.capacity());

		buffer.append("123456789321652");
		System.out.println("12345678932165-->" + buffer.capacity());
		buffer.append("12345678932165123456789321652123456789321652123456789321652123456789321652");
		System.out.println("12345678932165-->" + buffer.capacity());
*/
		StringBuilder builder = new StringBuilder();

		System.out.println("builder: Default--?" + builder.capacity());

		builder.append("123456789321652");

		System.out.println("builder: 123456789321652--?" + builder.capacity());
		builder.append("1234567893216522312345678932165212345678932165223");

		System.out.println("builder: 123456789321652--?" + builder.capacity());
		
		builder.append("1234567893216512345678932165123456789321651234567893216523232");

		System.out.println("builder: 123456789321652--?" + builder.capacity());
	}

}
