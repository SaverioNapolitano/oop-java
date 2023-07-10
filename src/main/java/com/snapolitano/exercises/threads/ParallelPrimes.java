package com.snapolitano.exercises.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		List<PrimeEngine> primeEngines = new ArrayList<>();
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
			primeEngines.add(new PrimeEngine(1000 * i, 1000 * (i + 1)));
		}
		List<Future<List<Integer>>> futures;
		try {
			futures = executorService.invokeAll(primeEngines);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		for (Future<List<Integer>> future : futures) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				throw new RuntimeException(e);
			}
		}

		executorService.shutdown();

		try {
			boolean termination = executorService.awaitTermination(1, TimeUnit.SECONDS);
			if (!termination) {
				throw new RuntimeException("Something's wrong");
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static class PrimeEngine implements Callable<List<Integer>> {
		int start;
		int end;

		public PrimeEngine(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public List<Integer> call() {
			List<Integer> result = new ArrayList<>();
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					result.add(i);
				}
			}
			return result;
		}

		public boolean isPrime(int number) {
			if (number <= 1) {
				return false;
			}
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
