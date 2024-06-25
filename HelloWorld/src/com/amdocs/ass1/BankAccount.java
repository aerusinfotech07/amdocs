package com.amdocs.ass1;

import java.util.Scanner;

public class BankAccount implements BankInterface{
	Scanner sc=new Scanner(System.in);
	private int id; //instance Variable //Heap(memory)
	private String name;
	private float bal;
	private String branch;
	private static String bankName="Axis"; //class variable //static context(Memory)
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int id, String name, float bal, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.bal = bal;
		this.branch = branch;
	}
	
	public void createAccount() {
		System.out.println("enter id");
		this.id = sc.nextInt();
		System.out.println("enter name");
		this.name = sc.next();
		System.out.println("enter bal");
		this.bal = sc.nextFloat();
		System.out.println("enter branch");
		this.branch = sc.next();
	}
	@Override
	public String toString() {
		int x;
		return "BankAccount [id=" + id + ", name=" + name + ", bal=" + bal + ", branch=" + branch + "]";
	}
	
	@Override
	public void withdraw(float amount)
	{
			if(bal>=amount+200)
				bal=bal-amount;
			else
			throw new InsufficientBalanceException("Amount Should be multiple of 200");
		
	}
	
	@Override
	public void deposit(float amount)
	{
		bal=bal+amount;
	}
	
	@Override
	public void transfer(BankAccount account,float amount)
	{
		if(amount%100==0)
			account.deposit(amount);
		else
			System.out.println("Amount Should be multiple of 100");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	

}
