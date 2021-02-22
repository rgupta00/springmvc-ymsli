package com.bankapp.service;

import java.util.List;

import com.bankapp.dao.Account;

public interface AccountService {
	public List<Account> getAllAccounts();
	public Account getById(int id);
	public void transfer(int fromId, int toId, double amount);
	public void deposit(int accId, double amount);
	public void withdraw(int accId, double amount);

	public void updateCustomerDetails(int id, String address, String phone, String email );
	public void delete(int id);
	public void insert(Account account);
}
