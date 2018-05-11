package com.core.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
	private ConcurrentHashMap<Integer, Object> map = new ConcurrentHashMap<>();

	public static void main(String[] args) throws Exception {
		new ConcurrentMapExample().concurrent();
	}

	private void concurrent() {

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					map.put(i, "guarded by one lock" + i);
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}

			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 10; i < 19; i++) {
					map.put(i, "guarded by another lock" + i);
//					try {
//						System.out.println("Sleepin....");
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 10; i < 19; i++) {
					map.put(i, "guarded by another lock" + (i + 3));
//					try {
//						System.out.println("Sleeping....");
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 19; i++) {

					System.out.println("Reading From Map...get." + i + "" + map.get(i));
				}
			}
		}).start();
	}
}
