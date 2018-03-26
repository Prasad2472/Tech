/**
 * 
 */
package in.core.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Prasad
 *
 */
public class SerializationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Child child = new Child(20, 10);

		try (FileOutputStream fileOutputStream = new FileOutputStream("parent.ser");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
			objectOutputStream.writeObject(child);
			System.out.println("Object is Serialized....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
