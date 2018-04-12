package com.java8.examples;

public class Person {
	private String firstName;
	private String lastname;
	private int age;

	public Person() {

	}

	public Person(final String firstName, final String lastname, final int age) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + "]";
	}
}
