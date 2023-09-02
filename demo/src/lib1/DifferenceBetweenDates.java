package lib1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DifferenceBetweenDates {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter start date [yyyy-mm-dd] :");
		String startDate = s.nextLine();
		System.out.print("Enter end date   [yyyy-mm-dd] :");
		String endDate = s.nextLine();

		LocalDate sd = LocalDate.parse(startDate);
		LocalDate ed = LocalDate.parse(endDate);

		Period p = Period.between(sd, ed);

		System.out.printf("Years %d, Months %d, Days %d", p.getYears(), p.getMonths(), p.getDays());

	}

}
