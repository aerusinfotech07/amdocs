package com.amdocs.ass1;

public class Manager  extends Employee implements Cloneable,Printable{
	
	private float comm;
	
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getSal() {
		return super.getSal()+comm;
	}

	public Manager(int id, String name, float sal, String branch,float comm) {
		super(id,name,sal,branch);
		this.comm = comm;
	}


	@Override
	public String toString() {
		return "Manager [comm=" + comm + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void print() {
		System.out.println("Manager details Can be printed");
		
	}

	@Override
	public void printable() {
		System.out.println("Manager details Can be printable");
		
	}
	
	
	
	
	
	

}
