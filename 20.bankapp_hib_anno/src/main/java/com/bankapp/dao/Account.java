package com.bankapp.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account2")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double balance;
	private String address;
	private String phone;
	private String email;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public Account(String name, double balance, String address, String phone, String email) {
		super();
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public Account(int id, String name, double balance, String address, String phone, String email) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public Account() {}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
