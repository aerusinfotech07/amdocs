package com.admocs.exceptions;

import java.util.Scanner;

public class ExeptionsDivideByZero {

	public static void main(String[] args) {
		System.out.println("Programme Start");
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Please Enter Value of a");
			arr[0]=sc.nextInt();
			System.out.println("Please Enter Value of b");
			arr[1]=sc.nextInt();
			arr[2]=arr[0]/arr[1];
			System.out.println("Divsion of a and b is "+arr[3]);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Please don't enter zero value for b");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Please cloorect your logic to access Array");
		}
		catch(RuntimeException ex)
		{
			System.out.println("Please leave it i will manage");
		}
		System.out.println("Programme End");
		
		
		if(true)
		{
			throw new InsufficientBalanceException("You Must have suffient balance");
		}

	}

}
