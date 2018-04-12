package com.java8.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapExample {

	public static void main(String[] args) {
		Person person = new Person("Prasad", "Boini", 29);
		Person person2 = new Person("Mohan", "Dodda", 30);
		Person person3 = new Person("Ravi", "Soda", 32);
		Person person4 = new Person("John", "D", 39);
		Person person5 = new Person("Tom", "D", 57);
		Person person6 = new Person("Ram", "S", 45);

		Map<String, Person> personsMap = new HashMap<>();
		personsMap.put("HYD", person);

		Function<Person, String> firstName = p -> p.getFirstName();

		System.out.println("First Name: " + firstName.apply(person6));

	}
}
