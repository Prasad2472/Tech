/**
 * 
 */
package com.java8.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author pboini
 *
 */
public class ComparatorExample {

	public static void main(String[] args) {

		List<Person> persons = Arrays
				.asList(new Person[] { new Person("Prasad", "Boini", 29), new Person("Mohan", "Dodda", 30) });
		/**
		 * Java 7
		 */
		
		
		
		Comparator<Person> personComparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		};

		Collections.sort(persons, personComparator);
		System.out.println("Sorted Collection.." + persons);

		List<Person> java8Persons = Arrays
				.asList(new Person[] { new Person("Prasad", "Boini", 29), new Person("Mohan", "Dodda", 30) });
		/**
		 * Java 8
		 */
		Comparator<Person> java8PersonComparator = (o1, o2) -> {
			return o1.getFirstName().compareTo(o2.getFirstName());
		};

		java8Persons.sort(java8PersonComparator.reversed());
		
		Collections.sort(java8Persons, java8PersonComparator);
		System.out.println("Java 8 Sorted Collection.." + persons);

	}
}
