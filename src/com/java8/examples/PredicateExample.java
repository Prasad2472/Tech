package com.java8.examples;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> maxLenth = s -> s.length() < 20;
		Predicate<String> minLenth = s -> s.length() > 5;
		System.out.println("Predicate test: " + maxLenth.test("Prasad"));
		Predicate<String> namePredicate = minLenth.and(maxLenth);
/**
 * or() and EqualTo()
 */
		System.out.println("Predicate test: name Is between 5 and 20 Chars.. " + namePredicate.test("Prasad"));

	}
}
