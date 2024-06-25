package com.amdocs.ass1;

public  class Employee implements Comparable<Employee>{
	
	private int id; //instance Variable //Heap(memory)
	private String name;
	private float sal;
	private String branch;
	private static String companyName="Axis"; //class variable //static context(Memory)
	public Employee() {
		this(0,"unknowm",0.0f,"Mumbai");
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, float sal, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.branch = branch;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public float getSal() {
		return sal;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", branch=" + branch + ", companyName=" + companyName + "]";
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
	
	
	

}
