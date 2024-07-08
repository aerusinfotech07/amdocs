package com.admocs.exceptions;

public class InsufficientBalanceException extends RuntimeException{

	private String msg;
	public InsufficientBalanceException()
	{}
	public InsufficientBalanceException(String msg)
	{
		this.msg=msg;
	}
	public String getMesg()
	{
		return msg;
	}
	
}
