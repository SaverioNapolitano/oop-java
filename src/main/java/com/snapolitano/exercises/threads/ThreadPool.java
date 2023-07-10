package com.snapolitano.exercises.threads;

import java.util.Random;

public class ThreadPool {

	public static void main(String[] args) {

		Thread[] threads = new Thread[8];
		for (int i = 0; i < 8; i++) {
			threads[i] = new TaskThread(i);
			threads[i].start();
		}

		for (int i = 0; i < 8; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	static class TaskThread extends Thread {
		int taskNumber;

		public TaskThread(int taskNumber) {
			this.taskNumber = taskNumber;
		}

		@Override
		public void run() {
			long start = System.currentTimeMillis();
			System.out.println("START thread=" + Thread.currentThread().getName() + " started task=" + taskNumber);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("STOP thread=" + Thread.currentThread().getName() + " task=" + taskNumber + " t=" + (System.currentTimeMillis() - start) + " ms");
		}
	}
}
