package lib2;

import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		int a[] = { 10, 20, 3, 4, 5, 8, 12, 9, 3, 88 };
		
		Arrays.stream(a)
		      .filter(v -> v % 2 != 0)  // IntPredicate -> boolean test(int)
		      .sorted()
		      //.forEach(v -> System.out.println(v)); // IntConsumer -> void accept(int)
		      .forEach(System.out::println);
	}

}
