package oop2;

public class ExHand {

	public static void main(String[] args) {
		String s = "1A";

		try {
			int a = Integer.parseInt(s);
			System.out.println(a);
		} catch (NumberFormatException ex) {
            System.out.println("Invalid Number!");
		}
		
		System.out.println("The End");

	}

}
