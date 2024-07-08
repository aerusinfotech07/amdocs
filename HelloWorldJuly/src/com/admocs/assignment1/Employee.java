package com.admocs.assignment1;

import java.util.Date;

import com.admocs.assignment2.Printable;

public  class Employee implements Printable {
	
	private int id; //Instance Variable
	private String firstName;
	private String lastName;
	private Date doj;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String firstName, String lastName, Date doj) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.doj = doj;
	}
	
	public final void rules()
	{
		System.out.println("Rules will be the same for all employee types");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", doj=" + doj + "]";
	}

	@Override
	public void print() {
		System.out.println("I can print details through printer  or else in PDF format");
		
	}
	
	
	
	
	
	
}
