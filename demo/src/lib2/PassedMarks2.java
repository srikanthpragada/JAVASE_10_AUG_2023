package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PassedMarks2 {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\aug10\\marks.txt");
		var lines = Files.readAllLines(p); 
		
		double avg = 
		     lines.stream()
		     .mapToInt(line -> Integer.parseInt(line))
		     .average()
		     .getAsDouble();
		
		System.out.println("Avgerage = " + avg);
		
        lines.stream() 
		     .mapToInt(line -> Integer.parseInt(line))
		     .filter( v -> v >= avg)
		     .forEach(System.out::println);
		
		     
		     
		

	}

}
