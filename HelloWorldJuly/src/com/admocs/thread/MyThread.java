package com.admocs.thread;

public class MyThread extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().getName().equalsIgnoreCase("Ram"))
			System.out.println("Thread Started and Running "+Thread.currentThread());
		
	}

}
