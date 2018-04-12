package com.core.singleton;

public class ClonedSingletonTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singleton = Singleton.getInstance();

		System.out.println("singleton: " + singleton);

		Singleton cloned = singleton.clone();

		System.out.println("cloned: " + cloned);
	}

}
