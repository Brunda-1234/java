package com.te.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String[] args) {
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		
		for(int i = 0;i<10;i++) {
			final int taskId= i;
			service.submit(()->{
				System.out.println(taskId + "--" +Thread.currentThread().getName());
			});
		}
		
		service.shutdown();
	}

}
