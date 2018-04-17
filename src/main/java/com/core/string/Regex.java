package com.core.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	private static String REGEX = ".b";
	private static String INPUT = "aabfooaabfooabfoob";
	private static String REPLACE = "-";

	public static void main(String[] args) {

		Pattern p = Pattern.compile(REGEX);

		// get a matcher object
		Matcher matcher = p.matcher(INPUT);

		if (matcher.find()) {
			System.out.println("found");
		} else {
			System.out.println("Not");

		}
	}
}
