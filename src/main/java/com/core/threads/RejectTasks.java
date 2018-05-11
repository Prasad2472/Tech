/**
 * 
 */
package com.core.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Prasad
 *
 */
public class RejectTasks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
//		ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		
		RejectedExecutionHandler handler=new RejectedExecutionHandlerImpl();
//		executorService.setRejectedExecutionHandler(handler);
		
//		 ThreadPoolExecutor executor= new ThreadPoolExecutor(1,1,60,
//                 TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1),new ThreadPoolExecutor.DiscardPolicy());

		 ThreadPoolExecutor executor= new ThreadPoolExecutor(1,1,60,
                 TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1),handler);

		System.out.println("Test Started");
		for (Integer i = 0; i < 10; i++) {
			executor.execute(new Task(i));
//			if (i == 8)
//				executorService.shutdown();
		}
		executor.shutdown();
		
//		ThreadGroup threadGroup=Thread.currentThread().getThreadGroup();
//		threadGroup.getParent().
		
		System.out.println("Test Ended");
		while(!executor.isTerminated()){
			//Waiting for the termination of executor
		}
	}

}
