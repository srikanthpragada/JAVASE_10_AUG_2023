package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PassedMarks {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\aug10\\marks.txt");
		
		double avg = 
		     Files.lines(p)
		     .mapToInt(line -> Integer.parseInt(line))
		     .average()
		     .getAsDouble();
		
		System.out.println("Avgerage = " + avg);
		
		Files.lines(p)
		     .mapToInt(line -> Integer.parseInt(line))
		     .filter( v -> v >= avg)
		     .forEach(System.out::println);
		
		     
		     
		

	}

}
