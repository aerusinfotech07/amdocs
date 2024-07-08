package com.admocs.assignment1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value of a");
		int a=sc.nextInt();
		System.out.println("Please enter value of a");
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is "+c);

	}

}
