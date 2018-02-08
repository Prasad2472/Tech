/**
 * 
 */
package in.core.guid;

import java.util.UUID;

/**
 * @author Prasad Boini
 *
 */
public class GuidExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		UUID randomUuid = UUID.randomUUID();
		System.out.println("randomUuid 11:" + randomUuid);

		randomUuid = UUID.randomUUID();
		System.out.println("randomUuid 22:" + randomUuid);

		UUID fromString = UUID.fromString("0ff16142-9aab-4143-8a93-48fe11adaaa0");
		System.out.println("fromString:--->" + fromString+"<---");

		fromString = UUID.fromString("0ff16142-9aab-4143-8a93-48fe11adaaa0");
		System.out.println("fromString 22--->" + fromString+"<---");

	}

}
