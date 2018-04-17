/**
 * 
 */
package in.core.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Prasad Boini
 *
 */
public class DeserializationTest {

	/**
	 * 1. If a variable declared as transient, it will not participated in
	 * serialization process. <br>
	 * 2. If Parent class not implemented serializable interface and child
	 * implements, then parent fields are not serialized <br>
	 * 3. If Parent class implemented serializable interface and child not
	 * implemented, then parent fields and child fields are serialized <br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Child deserilazedChild = null;
		try (FileInputStream fileInputStream = new FileInputStream(
				"Directory.ser");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {

			deserilazedChild = (Child) objectInputStream.readObject();
			System.out.println("deserilazedChild id-->" + deserilazedChild.getChildId() + ", Parent id-->"
					+ deserilazedChild.getParentId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
