package com.amdocs.ass1;

public class InsufficientBalanceException extends RuntimeException{
	
	private String message;
	
	public InsufficientBalanceException(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return "InsufficientBalanceException [message=" + message + "]";
	}
	
	
	

}
