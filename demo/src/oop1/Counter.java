package oop1;

public class Counter {
	private int value;
	private static int count = 0;

	public Counter() {
		Counter.count++;
	}

	public void inc() {
		this.value++;
	}

	public void dec() {
		this.value--;
	}

	public int getValue() {
		return this.value;
	}

	public static int getCount() {
		return Counter.count;
	}
}
