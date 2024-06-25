package com.amdocs.ass1;

import java.util.Scanner;

public class GreadeExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int per;
		int noOfSubPassed=0;
		per=sc.nextInt();
		noOfSubPassed=sc.nextInt();
		if(per>=75 && noOfSubPassed==4) {
				System.out.println("Dist");				
		}
		else if(per>=60 && noOfSubPassed==4)
			System.out.println("First");
		else if(per>=45 && noOfSubPassed==4)
			System.out.println("Second");
		else if(per>=35 && noOfSubPassed==4)
			System.out.println("Pass");
		else 
			System.out.println("Failed");
		
		
		
	}

}
