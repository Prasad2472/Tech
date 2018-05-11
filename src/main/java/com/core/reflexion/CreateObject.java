/**
 * 
 */
package com.core.reflexion;

import com.core.singleton.Singleton;

/**
 * @author Prasad
 *
 */
public class CreateObject {

	
	public static void main(String[] args) {
		
		try {
	Singleton singleton=		(Singleton) Class.forName("com.core.singleton.Singleton").newInstance();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
