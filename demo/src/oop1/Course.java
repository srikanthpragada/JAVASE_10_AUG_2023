package oop1;


public class Course {
	// Instance variable
	private String title;
	private int fee, duration;
	// Class variable 
	private static int taxrate = 15;
	
	public static int getTaxRate() {
		return taxrate;
	}
	
	public Course(String title, int fee, int duration) {
		this.title = title;
		this.fee = fee;
		this.duration = duration;
	}
	
	public void print() {
		System.out.println(this.title);
		System.out.println(this.fee);
		System.out.println(this.duration);
	}

	public int getFee() {
		return this.fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getNetFee() {
		return  this.fee + (this.fee * Course.taxrate / 100);
	}

}
