package lib2;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class LambdaDemo {
	public static int compareStrings(String s1, String s2) {
		return s1.length() - s2.length();
	}

	public static void main(String[] args) {
		String names[] = { "Joe", "Andy", "Jack", "Larry", "Scott", "Xi" };

		// Normal class
		Arrays.sort(names, new LengthCompare()); // T array[], Comparator

		// Anonymous inner class
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		// Lambda Expression
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		// Lambda Block
		Arrays.sort(names, (s1, s2) -> {
			return s1.length() - s2.length();
		});

		// Method Reference
		Arrays.sort(names, LambdaDemo::compareStrings);
		
		for (var n : names)
			System.out.println(n);
	}
}
