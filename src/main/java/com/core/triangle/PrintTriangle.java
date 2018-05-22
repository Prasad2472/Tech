/**
 * 
 */
package com.core.triangle;

/**
 * @author Prasad
 *
 */
public class PrintTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 10;
		int k = number;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < k; j++) {

				System.out.print("$");
				System.out.print("$");
			}
			for (int z = 0; z <= i; z++) {
				System.out.print("* ");
			}
			for (int j =i+ number / 2; j < number; j++) {

				System.out.print(" ");
			}
			k--;
			System.out.println("");
		}
	}

	// Function to demonstrate printing pattern
	public static void printTriagle(int n) {
		// number of spaces
		int k = 2 * n - 2;
		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < n; i++) {
			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = 0; j < k; j++) {
				// printing spaces
				System.out.print(" ");
			}
			// decrementing k after each loop
			k = k - 1;
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
	}
}
