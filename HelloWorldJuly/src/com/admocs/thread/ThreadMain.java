package com.admocs.thread;

public class ThreadMain {

	public static void main(String[] args) {
		/*MyThread t1=new MyThread();
		t1.setName("Ram");
		t1.start();
		
		MyThread t2=new MyThread();
		t2.setName("Sita");
		t2.start();
		
		MyThread t3=new MyThread();
		t3.setName("Ravan");
		t3.start();*/
		
		MyFrame frame=new MyFrame();
		Thread t1=new Thread(frame);
		t1.start();
		
		Thread t2=new Thread(frame);
		t2.start();

	}

}
