package com.amdocs.ass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter value of x");
		int x=Integer.parseInt(br.readLine());
		System.out.println("Please enter value of y");
		int y=Integer.parseInt(br.readLine());;
		int z=x+y;
		System.out.println("Sum of "+x+" and "+y+" is "+z);

	}

}
