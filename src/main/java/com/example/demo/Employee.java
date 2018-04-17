/**
 * 
 */
package com.example.demo;

/**
 * @author Prasad
 *
 */
public class Employee {

	
	private static String name;
	
	public Employee(String nm) {
		name=nm;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee=new Employee("Prasad");
		Employee employee2=new Employee("Boini");
		System.out.println("Name-->"+employee.getName());
		
		
	}
	
	public String getName() {
		return name;
	}

}
