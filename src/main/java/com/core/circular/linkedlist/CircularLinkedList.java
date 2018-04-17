/**
 * 
 */
package com.core.circular.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author Prasad
 *
 */
public class CircularLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		// linkedList.add(3);
		linkedList.add(5);
		linkedList.add(3);
		// linkedList.add(4);
		// linkedList.add(3);

		isCircularLinkedList(linkedList);

	}

	private static boolean isCircularLinkedList(LinkedList<Integer> linkedList) {
		boolean isCircular = Boolean.FALSE;
		Set<Integer> circular = new HashSet<>();
		for (Integer integer : linkedList) {
			if (circular.contains(integer)) {
				System.out.println("Circular Linked List: " + integer);
				isCircular = Boolean.TRUE;
				break;
			} else {
				circular.add(integer);
			}
		}
		return isCircular;
	}

}
