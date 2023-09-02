package lib1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Add30Days {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter date [dd-mm-yyyy] :");
		 
		 String input = s.nextLine();
		 
		 DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		 LocalDate date = LocalDate.parse(input, format);
		 LocalDate newDate = date.plusDays(30);
		 
		 System.out.println(newDate.toString());
		 
		 
	}

}
