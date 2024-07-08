package com.amdocs.ass1;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee(101, "Ram", 20000, "DC1");
		System.out.println(emp1);
		
		Employee emp2=new Employee(101, "Shyam", 20000, "DC1");
		System.out.println(emp2);
		
		Employee emp3=new Employee(103, "Ravan", 24000, "DC3");
		emp3.setName("Sameer");
		System.out.println(emp3);
		emp3.setCompanyName("ICICI");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		Manager m1=new Manager(104,"Rakesh",30000,"DC3",2000);
		System.out.println(m1);
		
		if(emp1.equals(emp2))
			System.out.println("Both are equals");
		else
			System.out.println("Both are Not equals");
	}

}
