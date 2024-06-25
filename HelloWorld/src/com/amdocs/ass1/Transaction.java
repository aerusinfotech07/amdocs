package com.amdocs.ass1;

import java.time.LocalDateTime;

public class Transaction {
	
	private long id;
	private int accountId;
	private String message;
	private Status status;
	private LocalDateTime dateTime = LocalDateTime.now();
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int accountId, String message, Status status, LocalDateTime dateTime) {
		super();
		this.id = System.currentTimeMillis();
		this.accountId = accountId;
		this.message = message;
		this.status = status;
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", accountId=" + accountId + ", message=" + message + ", status=" + status
				+ ", dateTime=" + dateTime + "]";
	}
	
	
	
	
	
	

}
