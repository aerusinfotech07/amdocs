package com.amdocs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.amdocs.ass1.Employee;

public class ArrayListExampleUsingObject {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(102, "Ram", 20000, "Mumbai"));
		list.add(new Employee(104, "Laxman", 150000, "Pune"));
		list.add(new Employee(103, "Sita", 22000, "Nagpur"));
		list.add(new Employee(101, "Ravan", 10000, "Mumbai"));
		
		list.forEach(emp->System.out.println(emp));
		
		//System.out.println(list);Syso
		Collections.sort(list);
		
		System.out.println(list);
		
		
		

	}

}
