package com.amdocs.ass1;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month=0;
		System.out.println("Enter Month");
		month=sc.nextInt();
		switch(month)
		{
		case 1:case 3:case 5:case 7:case 9:case 12:
			System.out.println("This months has 31 days");
			break;
		case 4:case 6:case 8:case 10:
			System.out.println("This months has 30 days");
			break;
		case 2:
			System.out.println("This months has either 28 or 29 days");
			break;
		default:
			System.out.println("Invalid Month");
			
		}

	}

}
