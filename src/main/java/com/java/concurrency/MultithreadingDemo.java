package com.java.concurrency;

public class MultithreadingDemo extends Thread {

	public void run() {
		try {
			// Displaying the thread that is running 
			System.out.println("Thread "+Thread.currentThread().getId()+" is running.");
			
		} catch(Exception e) {
			// throwing an exception
			System.out.println("Exception occurred!!");
		}
	}
	
}
