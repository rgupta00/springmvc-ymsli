package com.bankapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.config.AppConfig;
import com.bankapp.config.AppConfig2;
import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bank.xml");
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig2.class);
		
		AccountService accountService=applicationContext.getBean("as", AccountService.class);
		
		List<Account> accounts=accountService.getAllAccounts();
		accounts.forEach(a-> System.out.println(a));
		
		//accountService.transfer(1, 2, 400);
		//System.out.println("-----transfered------");
		
		
//		List<Account> accounts=accountService.getAllAccounts();
//		accounts.forEach(a-> System.out.println(a));
		
		/*
		 * Account account=accountService.getById(3); System.out.println(account);
		 */
		
		//Account account=new Account("indu", 2000, "delhi", "450045545", "indu@gmail.com");
		
		//accountService.insert(account);
		//System.out.println("---------");
		
		//accountService.delete(12);
		//System.out.println("---------");
		
		//(int id, String address, String phone, String email)
//		accountService.updateCustomerDetails(11, "bang", "54545545", "leena1@gmail.com");
//		System.out.println("%%%%%%%%%%%%%%%%");
		
//		Account account=new Account("sunita", 2000, "delhi", "450045545", "sunita@gmail.com");
//		//Account account2=new Account("suman", 2000, "delhi", "454545545", "suman@gmail.com");
//		
//		accountService.insert(account);
		//accountService.insert(account);
		
//		accountService.transfer(1, 2, 100);
//		
//		System.out.println(accountService.getById(1));
//		System.out.println(accountService.getById(2));
		
	}
}
