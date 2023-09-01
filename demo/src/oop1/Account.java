package oop1;

import java.util.Objects;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// Constructor
	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	// Methods
	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", ahname=" + ahname + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return this.acno;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Account other = (Account) obj;
		return acno == other.acno;
	}
	
	
	
	
}
