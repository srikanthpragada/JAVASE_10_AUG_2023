package oop1;

public class TestCounter {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.inc();
		c1.inc();
		System.out.println(c1.getValue());

		Counter c2 = new Counter();
		System.out.println(c2.getValue());

		Counter c3 = new Counter();

		System.out.println(Counter.getCount());

	}

}
