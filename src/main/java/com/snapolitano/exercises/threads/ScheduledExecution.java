package com.snapolitano.exercises.threads;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecution {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutorService.scheduleAtFixedRate(() ->
				System.out.println(LocalTime.now() + ": Hello!"), 0, 1, TimeUnit.SECONDS);
	}
}
