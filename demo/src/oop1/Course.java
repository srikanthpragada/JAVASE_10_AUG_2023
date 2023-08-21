package oop1;

public class Course {
	private String title;
	private int fee, duration;
	
	public Course(String t, int f, int d) {
		title = t;
		fee = f;
		duration = d;
	}
	
	public void print() {
		System.out.println(this.title);
		System.out.println(this.fee);
		System.out.println(this.duration);
	}

	public int getFee() {
		return fee;
	}
	
	public void setFee(int f) {
		fee = f;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int d) {
		duration = d;
	}
	
	public int getNetFee() {
		return  fee + (fee * 15 / 100);
	}

}
