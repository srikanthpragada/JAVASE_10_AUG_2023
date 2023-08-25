package oop1;

class Shape {
	private int x, y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
}

class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.radius);
	}

	public double getArea() {
		return  Math.PI * this.radius * this.radius;
	}
}

class Rect extends Shape {
	private int length,width;

	public Rect(int x, int y, int length, int width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.length);
		System.out.println(this.width);
	}

	public double getArea() {
		return  this.length * this.width;
	}
}


public class TestShape {

	public static void main(String[] args) {
		 Circle c = new Circle(5,5,10);
		 System.out.println(c.getArea());
		 
		 
		 
	}

}
