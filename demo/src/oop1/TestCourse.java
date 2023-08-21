package oop1;

public class TestCourse {

	public static void main(String[] args) {
		Course c1 = new Course("Python", 5000,36);
		c1.setFee(6000);
		c1.print();
		System.out.println(c1.getNetFee());
		
		Course c2 = new Course("FSWD", 6000, 42);
		c2.print(); 

	}

}
