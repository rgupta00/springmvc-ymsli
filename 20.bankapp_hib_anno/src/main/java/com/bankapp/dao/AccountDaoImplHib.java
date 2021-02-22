package com.bankapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class AccountDaoImplHib implements AccountDao{

	private SessionFactory sessionFactory;

	@Autowired
	public AccountDaoImplHib(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Account> getAllAccounts() {
		return getSession().createQuery("select a from Account a").getResultList();
	}

	@Override
	public Account getById(int id) {
		return getSession().get(Account.class, id);
	}

	@Override
	public void update(Account account) {
		getSession().merge(account);
	}

	@Override
	public void delete(int id) {
		Account accountToDelete=getById(id);
		getSession().delete(accountToDelete);
	}

	@Override
	public void insert(Account account) {
		getSession().save(account);
	}

}
