package lib1;

import java.time.LocalDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDateTime sdt = LocalDateTime.of(2023, 1, 1, 10, 20);
		System.out.println(sdt);
	}
}
