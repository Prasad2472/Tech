/**
 * 
 */
package com.core.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prasad
 *
 */
public class GenericsExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List<String> animals = new ArrayList<>();
//		animals.add("rawtype");
//		addGenericAnimal(animals);
//		
//		List<Animal>lions=new ArrayList<>();
//		lions.add(new Animal("Lion"));
//		addAnimal(lions);
		
//		List<Dog>dogs=new ArrayList<>();
//		dogs.add(new Dog("Dog", "barking"));
//		addAnimal(dogs);
		

		Dog dog=new Dog("Dog", "barking");
		Cat cat=new Cat("cat", "meowF");
		Animal animal=new Animal("Lion");
		
//		List<? extends Animal>cats=new ArrayList<Cat>();
//		List<? extends Animal>dogs=new ArrayList<Dog>();
//		List<? extends Animal>animals=new ArrayList<Animal>();
		
//		cats.add(cat);
//		cats.add(dog);
//		cats.add(animal);
//		
//		dogs.add(cat);
//		dogs.add(dog);
//		dogs.add(animal);
//		
//		animals.add(cat);
//		animals.add(dog);
//		animals.add(animal);
		
		List<? super Dog>cats=new ArrayList<Animal>();
		List<? super Animal>dogs=new ArrayList<Animal>();
		List<? super Cat>animals=new ArrayList<Animal>();
		
		
		List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number

		
		
		List<? super Integer> foo6 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo37 = new ArrayList<Number>();   // Number is a superclass of Integer
		List<? super Integer> foo38 = new ArrayList<Object>();   // Object is a superclass of Integer
//		
//		cats.add(cat);
//		cats.add(dog);
//		cats.add(animal);
//		
//		dogs.add(cat);
//		dogs.add(dog);
//		dogs.add(animal);
//		
//		animals.add(cat);
//		animals.add(dog);
//		animals.add(animal);
		
//		addAnimal(cats);
		
		
	}
	
	 // generic method printArray
	   public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }

	public static void addAnimal(List<? extends Animal> animal) {

		System.out.println(animal);
	}
	
	public static void addMoreAnimal(List<? super Animal> animal) {

		System.out.println("More .."+animal);
	}
	
	public static void addGenericAnimal(List<?> animal) {

		System.out.println("More .."+animal);
	}
	
	public static void addDogAnimal(List<Dog> animal) {

		System.out.println("addDogAnimal:"+animal);
	}
	public static void addCatAnimal(List<Cat> animal) {

		System.out.println("addCatAnimal: "+animal);
	}
	public static void addGenerlAnimal(List<Animal> animal) {

		System.out.println("addGenerlAnimal: "+animal);
	}
}
