package com.java8.examples;

public class RunnableExample {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("JDK 7..");
			}
		};
		new Thread(runnable).start();
		/**
		 * Java 8
		 */
		Runnable java8Runnable = () -> {
			System.out.println("JDK 8..");
		};
		new Thread(java8Runnable).start();
	}
}
