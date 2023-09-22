package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamFromFile {

	public static void main(String[] args) throws IOException {
		 
		Path p = Path.of("d:\\classroom\\aug10\\names.txt");
		Files.lines(p)
		     .map( v -> v.toUpperCase())     // Function -> R apply(T)
		     .distinct()
		     .filter( s -> s.contains("A"))
		     .sorted()
		     .forEach(System.out::println);
	}

}
