package com.bankapp.dao;
import java.util.*;
public interface AccountDao {
	public List<Account> getAllAccounts();
	public Account getById(int id);
	public void update(Account account);
	public void delete(int id);
	public void insert(Account account);
	
}
