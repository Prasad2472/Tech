/**
 * 
 */
package com.core.list.performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Prasad
 *
 */
public class ListPerformance {

	public static void main(String[] args) {
		List<Emp> employees = new ArrayList<>();
		addEmployee(employees);
		List<Address> addresses = new ArrayList<>();
		addAddress(addresses);

		List<String> asListStrings = Arrays.asList(new String[] { "Hello", "world" });
		asListStrings.add("Changed");
		System.out.println("asListStrings:"+asListStrings);

		// for (Emp employee : employees) {
		// Address address= addresses.get(employee.getEmpId());
		// }
	}

	private static void addAddress(List<Address> addresses) {
		Address address = new Address("61192", "Kukatpally", "500072", "Telangana", "India");
		Address address2 = new Address("61194", "Manikonda", "500082", "Telangana", "India");
		addresses.add(address);
		addresses.add(address2);
	}

	private static void addEmployee(List<Emp> employees) {
		Emp emp = new Emp("61192", "Prasad", "Boini");
		Emp emp2 = new Emp("61194", "Mohan", "Dodda");
		employees.add(emp);
		employees.add(emp2);
	}
}
