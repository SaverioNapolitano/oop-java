package com.snapolitano.exercises.threads;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ProducerConsumerUnsafe {
	public static void main(String[] args) {
		final Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		Thread producer = new Thread(() -> {
			while (!Thread.interrupted()) {
				queue.add(1);
			}
		});
		Thread consumer = new Thread(() -> {
			int consumed = 0;
			while (!Thread.interrupted()) {
				if (queue.poll() != null) {
					consumed++;
				} else {
					Thread.yield();
				}
			}
			System.out.println("Total number of consumed elements: " + consumed);
		});

		producer.start();
		consumer.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		producer.interrupt();
		consumer.interrupt();

		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
