/**
 * 
 */
package com.core.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Prasad
 *
 */
public class RejectTasks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		
		RejectedExecutionHandler handler=new RejectedExecutionHandlerImpl();
		executorService.setRejectedExecutionHandler(handler);
		
		System.out.println("Test Started");
		for (Integer i = 0; i < 10000; i++) {
			executorService.execute(new Task(i));
			if (i == 8)
				executorService.shutdown();
		}
		executorService.shutdown();
		
//		ThreadGroup threadGroup=Thread.currentThread().getThreadGroup();
//		threadGroup.getParent().
		
		System.out.println("Test Ended");
		while(!executorService.isTerminated()){
			//Waiting for the termination of executor
		}
	}

}
