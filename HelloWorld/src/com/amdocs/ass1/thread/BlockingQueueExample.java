package com.amdocs.ass1.thread;

//Java Program to demonstrate usage of BlockingQueue

import java.util.concurrent.*;
import java.util.*;

public class BlockingQueueExample {

	public static void main(String[] args)
		throws InterruptedException
	{

		// define capacity of ArrayBlockingQueue
		int capacity = 5;

		// create object of ArrayBlockingQueue
		BlockingQueue<String> queue
			= new ArrayBlockingQueue<String>(capacity);

		// Add elements to ArrayBlockingQueue using put
		// method
		queue.put("StarWars");
		System.out.println(queue);
		queue.put("SuperMan");
		System.out.println(queue);
		queue.put("Flash");
		System.out.println(queue);
		queue.put("BatMan");
		System.out.println(queue);
		queue.put("Avengers");
		System.out.println(queue);
		//queue.remove();
		//System.out.println("Remove");
		queue.put("dfdsf");
		System.out.println(queue);

		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
		System.out.println("Remove");
		queue.remove();
		queue.remove();

		// Add elements to ArrayBlockingQueue
		// using put method
		queue.put("CaptainAmerica");
		queue.put("Thor");

		System.out.println("queue contains " + queue);
	}
}
