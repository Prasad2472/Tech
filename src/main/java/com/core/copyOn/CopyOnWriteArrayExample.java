/**
 * 
 */
package com.core.copyOn;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Prasad
 *
 */
public class CopyOnWriteArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
		copyOnWriteArraySet.add("Prasad");
		copyOnWriteArraySet.add("Prasad");
		copyOnWriteArraySet.add("Boini");

		copyOnWriteArraySet.add("boini");
		System.out.println(copyOnWriteArraySet);

		System.out.println(copyOnWriteArraySet);
		/**
		 * -Xms512m -Xmx1152m -XX:MaxPermSize=256m -XX:MaxNewSize=256m
		 * 
		 * In Java 8, Permenent Generation memory was removed and introduced Metaspace.
		 * The advantage is, it cannot through outofMemory Error.
		 */
		
		/**
		 * [Prasad, Boini, boini] [Prasad, Boini, boini] Java HotSpot(TM) 64-Bit Server
		 * VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
		 * 
		 */
		

	}
}
