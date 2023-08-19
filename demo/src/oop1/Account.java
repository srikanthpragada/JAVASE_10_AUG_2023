package oop1;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// Constructor
	public Account(int no, String name) {
		acno = no;
		ahname = name;
		balance = 0;
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
}
