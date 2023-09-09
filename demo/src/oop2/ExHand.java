package oop2;

public class ExHand {

	public static void main(String[] args) {
		String s = "0";

		try {
			int a = Integer.parseInt(s);
			System.out.println(100 / a);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("The End");
	}
}
