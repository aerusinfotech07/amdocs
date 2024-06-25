package com.amdocs.ass1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BankAccountMain {
	
	public static void main(String args[])
	{
		int counter=0;
		int transactionCounter=0;
		Scanner sc=new Scanner(System.in);
		BankAccount accounts[]=new BankAccount[BankInterface.MAX_ACCCOUNT];
		Transaction transactions[]=new Transaction[BankInterface.MAX_ACCCOUNT*100];
		
		do
		{
			System.out.println("1:Create Account");
			System.out.println("2:Display All Accounts");
			System.out.println("3:Find Accounts By Id");
			System.out.println("4:Perform Withdraw");
			System.out.println("5:Perform Deposit");
			System.out.println("6:Display All Transactions");
			System.out.println("9:Exit");
			System.out.println("Enter Your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				accounts[counter]=new BankAccount();
				accounts[counter].createAccount();
				
				transactions[transactionCounter]=new Transaction(accounts[counter].getId(),"",Status.CREATED, LocalDateTime.now());
				transactionCounter++;
				counter++;
				break;
			case 2:
				for(int i=0;i<counter;i++) {
					System.out.println(accounts[i]);				
				}
				break;
			
			case 3:
				System.out.println("Enter Account id to search");
				int id=sc.nextInt();
				boolean flagToFind=false;
				for(int i=0;i<counter;i++) {
					if(accounts[i].getId()==id) {
						System.out.println(accounts[i]);
						flagToFind=true;
					}
					if(!flagToFind)
						System.out.println(id +" Account Not Exist");
				}
				break;
			case 4:
				System.out.println("Enter Account id to search For Windraw");
				int idForWindraw=sc.nextInt();
				boolean flagToFind4Withdraw=false;
				for(int i=0;i<counter;i++) {
					if(accounts[i].getId()==idForWindraw) {
						System.out.println("Before "+accounts[i]);
						float amontForWindraw=sc.nextFloat();
						try {
						accounts[i].withdraw(amontForWindraw);
						}
						catch(InsufficientBalanceException ex)
						{
							System.out.println(ex);
						}
						catch(NullPointerException ex)
						{
							System.out.println(ex);
						}
						finally
						{
							System.out.println("Finally Block");
						}
						System.out.println("After "+accounts[i]);
						flagToFind4Withdraw=true;
						transactions[transactionCounter]=new Transaction(accounts[i].getId(),"",Status.WITHDRAW, LocalDateTime.now());
						transactionCounter++;
					}
					if(!flagToFind4Withdraw)
						System.out.println(idForWindraw +" Account Not Exist");
				}
				break;
			case 6:
				for(int i=0;i<transactionCounter;i++) {
					System.out.println(transactions[i]);				
				}
				break;	
			case 9:
				System.exit(0);
				
			}
			
			
		}
		while(true);
		
	}
	
	

}
