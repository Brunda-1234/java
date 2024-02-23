package com.te.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i =0;i<20;i++) {
			final int g =1 ;
			service.submit(()->{
				System.out.println(g  + "" +Thread.currentThread().getName());
			});
		}
		service.shutdown();
	}

}
