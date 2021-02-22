package com.bankapp.service;

public class AccountNotFoundException extends RuntimeException{
	public AccountNotFoundException(String message) {
		super(message);
	}
}
