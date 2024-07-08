package com.admocs.assignment1;

import java.util.Date;

import com.admocs.assignment2.Printable;
import com.admocs.assignment2.Shape;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1=new Employee(101, "Ramesh", "Sharma", new Date(2024,3,1));
		System.out.println(emp1.toString());
		
		Employee emp2=new Employee();
		System.out.println(emp2);
		
		Printable print=new Employee();
		print.print();
		
		print=emp1;
		
		Student s1=new Student();
		
		
		if(s1 instanceof Printable)
			System.out.println("s1 a Printable Type");
		
		if(emp2 instanceof Printable)
			System.out.println("emp2 a Printable Type");
	
	}

}
