package com.core.list.performance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntoUpper {

	public static void main(String[] args) {

		List<String> asListStrings = Arrays.asList(new String[] { "Hello", "world" });

		List<String> upper = asListStrings.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		upper.forEach(name -> System.out.println(name));

		List<String> upped = asListStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
		upped.forEach(name -> System.out.println(name));
		
	}
}
