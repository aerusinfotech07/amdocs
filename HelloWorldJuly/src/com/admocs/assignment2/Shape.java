package com.admocs.assignment2;

public abstract class Shape {
	
	private int factor;
	public Shape()
	{}
	
	public Shape(int factor)
	{
		this.factor=factor;
	}
	
	public void display()
	{
		
	}
	
	public abstract void draw();

}
