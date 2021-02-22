package com.bankapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.service.aspects.Loggable;

@Service(value = "as")
@Transactional
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	private EmailService emailService;

	@Autowired
	public AccountServiceImpl(AccountDao accountDao, EmailService emailService) {
		this.accountDao = accountDao;
		this.emailService = emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.getAllAccounts();
	}

	@Override
	public Account getById(int id) {
		try {
			Account account = accountDao.getById(id);
			return account;
		} catch (Exception ex) {
			throw new AccountNotFoundException("account with id " + id + " is not found");
		}
	}

	@Loggable
	@Override
	public void transfer(int fromId, int toId, double amount) {

		Account fromAcc = accountDao.getById(fromId);
		Account toAcc = accountDao.getById(toId);

		fromAcc.setBalance(fromAcc.getBalance() - amount);
		toAcc.setBalance(toAcc.getBalance() + amount);

		accountDao.update(fromAcc);
		/*
		 * if(1==1) throw new RuntimeException();
		 */
		accountDao.update(toAcc);
		
		System.out.println("amount is transferred successfully");
		if (emailService != null) {
			emailService.sendMessage(fromAcc.getEmail(), "money is transferd from your acc");
			emailService.sendMessage(toAcc.getEmail(), "money is transferd to your acc");
		}
	}

	@Override
	public void deposit(int accId, double amount) {
		Account toDep = accountDao.getById(accId);
		toDep.setBalance(toDep.getBalance() + amount);
		accountDao.update(toDep);
	}

	@Override
	public void withdraw(int accId, double amount) {
		Account toWithdraw = accountDao.getById(accId);
		toWithdraw.setBalance(toWithdraw.getBalance() - amount);
		accountDao.update(toWithdraw);
	}

	@Override
	public void delete(int id) {
		accountDao.delete(id);
	}

	@Loggable
	@Override
	public void insert(Account account) {
		accountDao.insert(account);
	}

	@Override
	public void updateCustomerDetails(int id, String address, String phone, String email) {
		Account accountToUpdate= getById(id);
		accountToUpdate.setAddress(address);
		accountToUpdate.setPhone(phone);
		accountToUpdate.setEmail(email);
		
		accountDao.update(accountToUpdate);
	}

}
