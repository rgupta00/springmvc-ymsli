package com.bankapp.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{

	@Override
	public void sendMessage(String email, String message) {
		System.out.println("confirmation mail is send to "+ email+ " message "+ message);
	}

}
