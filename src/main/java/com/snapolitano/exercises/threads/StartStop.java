package com.snapolitano.exercises.threads;

public class StartStop {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			long start = System.currentTimeMillis();
			System.out.println(Thread.currentThread().getName() + " started");
			while (!Thread.interrupted()) {
				System.out.println(Thread.currentThread().getName() + " running since " + (System.currentTimeMillis() - start) +
						" ms");
			}
			System.out.println(Thread.currentThread().getName() + " terminated");
		};

		Thread t1 = new Thread(runnable, "T1");
		Thread t2 = new Thread(runnable, "T2");

		t1.start();
		t2.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		t1.interrupt();
		t2.interrupt();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
