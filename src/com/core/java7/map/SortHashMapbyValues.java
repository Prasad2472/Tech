/**
 * 
 */
package com.core.java7.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author pboini
 *
 */
public class SortHashMapbyValues {

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

		List<Entry<String, Integer>> entries = new ArrayList<>(unsortedMap.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Unsorted Map-->" + unsortedMap);
		System.out.println("Sorted map-->" + sortedMap);

	}

}
