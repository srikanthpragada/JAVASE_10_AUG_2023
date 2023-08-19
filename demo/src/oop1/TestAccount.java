package oop1;

public class TestAccount {

	public static void main(String[] args) {
		Account a1; // Object reference

		a1 = new Account(1, "James Gosling");
		a1.deposit(10000);
		a1.deposit(20000);
		a1.withdraw(5000);
		a1.print();
		//System.out.println(a1.balance);
	}

}
