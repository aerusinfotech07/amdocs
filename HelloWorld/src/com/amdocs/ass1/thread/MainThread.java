package com.amdocs.ass1.thread;

 class MyThread implements Runnable{
    public void run() {
    	
    	for(int i=0;i<5;i++) {
    	
    		System.out.println(Thread.currentThread().getName());
    		
    	if(Thread.currentThread().getName().equals("Ram"))
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    	
    			System.out.println(i);
    	}
        System.out.println("Thread running by extending Thread class" +Thread.currentThread());
    }
}

public class MainThread {
    public static void main(String[] args) {
    	System.out.println(System.currentTimeMillis());
    	Thread thread1 = new Thread(new MyThread());
    	thread1.setName("Ram");
    	thread1.setPriority(4);
        thread1.start();
        
        
        
        System.out.println(System.currentTimeMillis());
    }
}
