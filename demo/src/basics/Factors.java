package basics;

public class Factors {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // convert str to int

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}
}
