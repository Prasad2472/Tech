/**
 * 
 */
package com.core.singleton;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author pboini
 *
 */
public class Singleton implements Cloneable {

	private static Singleton instance = null;
	// Fair Lock
	private static final ReentrantLock lock = new ReentrantLock(true);

	private Singleton() {
		// prevent instantiation from outside
	}

	public static Singleton getInstance() {

		if (instance == null) {
			// Lock--if it it require, use try and catch block
			lock.tryLock();
			if (instance == null) {
				instance = new Singleton();
			}
			// unlock
			lock.unlock();
		}
		return instance;
	}

	@Override
	protected Singleton clone() throws CloneNotSupportedException {
		System.out.println("Cloned..");
		return getInstance();
	}

	public void readResolve() {
		System.out.println(instance);
	}
}
