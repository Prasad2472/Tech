/**
 * 
 */
package com.array.balance.indexes;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Prasad
 *
 */
public class FindBalancedIndexesInArray {

	public static void main(final String[] args) {
		System.out.println(getIndexes(new int[] { 1, 2, 1, 3 }));
		System.out.println(getIndexes(new int[] { 1, 2, 1 }));
	}

	private static Set<Integer> getIndexes(final int[] arr) {
		final Set<Integer> indexes = new HashSet<>();
		int leftElementsSum = 0;
		if (arr == null || arr.length == 0 || arr.length == 2) {
			// return Empty set
			return indexes;
		}
		if (arr.length == 1) {
			// If it is Only One Element, previous and next are equal..
			indexes.add(0);
			return indexes;
		}
		/**
		 * If the Array doesn't have zero, elements, then Time Complexity is O(n).
		 */

		int product = arr[0];
		/**
		 * Calculate Product of the array elements
		 */
		for (int i = 1; i < arr.length; i++) {
			product *= arr[i];
		}
		/**
		 * Time Complexity O(n)
		 */
		for (int i = 1; i < arr.length; i++) {
			// Calculate Previous Elements sum
			leftElementsSum += arr[i - 1];
			// calculate Product
			product = product / arr[i];
			// Check Previous Sum and Next Multiplication is Equal..
			if (leftElementsSum == product) {
				indexes.add(i);
			}
		}
		/**
		 * For the last element in the array, if the SUM of 0 to N-2 Elements are ZERO,
		 * then include last Element Index.
		 */
		if (leftElementsSum == 0) {
			indexes.add(arr.length - 1);
		}
		return indexes;
	}
}
