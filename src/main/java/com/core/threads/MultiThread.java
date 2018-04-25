/**
 * 
 */
package com.core.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Prasad
 *
 */
public class MultiThread {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello..");
			}
		});
	}
}
