/**
 * 
 */
package com.core.java7.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author pboini
 *
 */
public class SortHashMapbyValuesJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Hello", 1);
		unsortedMap.put("Prasad", 4);
		unsortedMap.put("Srihith", 3);
		unsortedMap.put("world", 2);
		unsortedMap.put("Mohan", 8);
		// Sorting HashMap by values

		Map<String, Integer> sortedMap = unsortedMap.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Unsorted Map-->" + unsortedMap);
		System.out.println("Sorted map-->" + sortedMap);

	}

}
