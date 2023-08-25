package oop1;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
}

class Player extends Person {
	protected String game;
	public Player(String name, String email, String game) {
		super(name, email); // Must call superclass's constructor 
		this.game = game;
	}
	
	public void setGame(String game) {
		this.game = game;
	}
	
	@Override 
	public void print() {
		super.print(); 
		System.out.println(this.game);
	}
}

public class TestPerson {

	public static void main(String[] args) {
	    Player p = new Player("Dhoni", "dhoni@gmail.com", "Football");
	    p.setEmail("dhoni@bcci.com");
	    p.setGame("Cricket");
	    
	    p.print();
	    
	    // Upcasting 
	    Person per = new Player("Ronaldo","ronaldo@gmail.com", "Football");
	    
	    // Downcasting 
	    Player p1 = (Player) per;
	}

}
