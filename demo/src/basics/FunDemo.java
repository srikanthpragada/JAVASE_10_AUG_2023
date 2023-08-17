package basics;

public class FunDemo {

	public static int add(int a, int b) {
		return a + b;
	}

	public static void wish(String ... names) {
		for(String n : names)
		  System.out.println("Hello " + n);
	}
	
	public static void main(String[] args) {

		System.out.println(add(10, 20));
		wish("Bill", "Joe", "Scott");
		wish("Jack", "Mark");
	}

}
