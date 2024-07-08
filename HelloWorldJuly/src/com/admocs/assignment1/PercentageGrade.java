package com.admocs.assignment1;

import java.util.Scanner;

public class PercentageGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Add \n 2:Subs \n3:Mul");
		System.out.println("Enter Option");
		int choice=sc.nextInt();
		System.out.println("Please enter value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		switch (choice) {
		case 1:
			c=a+b;
			System.out.println("Sum of a and b is "+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Sub of a and b is "+c);
			break;
			

		default:
			break;
		}

	}

}
