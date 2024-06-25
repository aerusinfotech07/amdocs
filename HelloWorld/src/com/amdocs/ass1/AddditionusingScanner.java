package com.amdocs.ass1;

import java.util.Scanner;

public class AddditionusingScanner {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value of x");
		int x=sc.nextInt();
		System.out.println("Please enter value of y");
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("Sum of "+x+" and "+y+" is "+z);
		
		
		
		
	}

}
