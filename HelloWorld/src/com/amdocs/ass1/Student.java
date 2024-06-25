package com.amdocs.ass1;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String dept;
	public Student() {
		id=0;
		name="unknown";
		age=0;
		dept="default";
	}
	public Student(int id, String name, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
	

}
