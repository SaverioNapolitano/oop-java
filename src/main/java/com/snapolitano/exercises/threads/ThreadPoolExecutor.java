package com.snapolitano.exercises.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ThreadPoolExecutor {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(4);

		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			threads.add(new TaskThread(i));
		}

		try {
			executorService.invokeAll(threads.stream().map(Executors::callable).collect(Collectors.toList()));
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		executorService.shutdown();

		try {
			boolean termination = executorService.awaitTermination(1, TimeUnit.SECONDS);
			if (!termination) {
				throw new RuntimeException("Something is wrong.");
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
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
