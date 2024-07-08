package com.admocs.thread;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements Runnable{

	@Override
	public void run() {
		System.out.println("Bouncing Ball started/Running");
		
	}

}
