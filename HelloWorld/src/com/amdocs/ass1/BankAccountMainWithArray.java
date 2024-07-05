package com.amdocs.ass1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BankAccountMainWithArray {
	
	public static void main(String args[])
	{
		int counter=0;
		int transactionCounter=0;
		Scanner sc=new Scanner(System.in);
		BankAccount accounts[]=new BankAccount[BankInterface.MAX_ACCCOUNT];
		Transaction transactions[]=new Transaction[BankInterface.MAX_ACCCOUNT*100];
		BankAccount bankAccount=null;
		Transaction transaction=null;
		
		do
		{
			System.out.println("1:Create Account");
			System.out.println("2:Display All Accounts");
			System.out.println("3:Find Accounts By Id");
			System.out.println("4:Perform Withdraw");
			System.out.println("5:Perform Deposit");
			System.out.println("6:Display All Transactions");
			System.out.println("7:Branch Wise Balance Summery");
			System.out.println("8:Transaction Status Summery");
			System.out.println("9:Exit");
			System.out.println("Enter Your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				//Accounts to be created
				bankAccount =new BankAccount();
				bankAccount.createAccount();
				accounts[counter]=bankAccount;
				counter++;
				//transactions neeeed to maintain for each operations
				transaction=new Transaction(bankAccount.getId(),"",Status.CREATED, LocalDateTime.now());
				transactions[transactionCounter++]=transaction;
				break;
			case 2:
				
				Arrays.asList(accounts).forEach(account->System.out.println(account));
				break;
			
			case 3:
				System.out.println("Enter Account id to search");
				int id=sc.nextInt();
				boolean flagToFind=false;
				/*for(int i=0;i<counter;i++) {
					if(accounts[i].getId()==id) {
						System.out.println(accounts[i]);
						flagToFind=true;
					}
					if(!flagToFind)
						System.out.println(id +" Account Not Exist");
				}*/
				Arrays.asList(accounts).stream().filter(account->account.getId()==id)
					.forEach(account->System.out.println(account));
				break;
				
			case 4:
				System.out.println("Enter Account id to search For Windraw");
				int idForWindraw=sc.nextInt();
				
				Optional<BankAccount> optionalAccount=Arrays.asList(accounts).stream()
						.filter(account->account.getId()==idForWindraw).findFirst();
				if(optionalAccount.isPresent()) {
					BankAccount account=optionalAccount.get();
					System.out.println("Before "+account);
					System.out.println("Enter Amount to Withdraw");
					float amontForWindraw=sc.nextFloat();
					account.withdraw(amontForWindraw);
					transaction=new Transaction(account.getId(),"",Status.WITHDRAW, LocalDateTime.now());
					transactions[transactionCounter]=transaction;
					transactionCounter++;
				}
				else
					System.out.println(idForWindraw +" Account Not Exist");
				
			break;
				
				
			case 6:
				/*for(int i=0;i<transactionCounter;i++) {
					System.out.println(transactions[i]);				
				}*/
				Arrays.asList(transactions).forEach(trans->System.out.println(trans));
				break;	
			case 7:				
				 Map<String, Double> branchBalanceSum = Arrays.asList(accounts).stream()
		            .collect(Collectors.groupingBy(BankAccount::getBranch, 
		                                           Collectors.summingDouble(BankAccount::getBal)));
		        branchBalanceSum.forEach((branch, totalBalance) -> 
		            System.out.println("Branch: " + branch + ", Total Balance: " + totalBalance));		        
		        
		     
		        break;
			case 8:
				  Map<Status, Long> statusCount =Arrays.asList(transactions).stream().collect(Collectors.groupingBy(Transaction::getStatus,Collectors.counting()));
				  statusCount.forEach((status, count) -> 
		            System.out.println("Status: " + status + ", Count: " + count));
				break;
			case 9:
				System.exit(0);
				
			}
			
			
		}
		while(true);
		
	}
	
	

}
