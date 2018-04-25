package com.core.threads;

public class Task implements Runnable {
	 int id;

	public Task(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("started Execution for Stak Id.." + this.id);
		try {
			System.out.println("Sleeping...1000000 ms");
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed Execution For task id.." + this.id);
	}

	@Override
	public String toString() {
		return "Task [id=" + id + "]";
	}
}