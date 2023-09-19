package lib2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortedWords {

	public static void main(String[] args) throws Exception {
		 
		var path = Path.of("d:\\classroom\\aug10\\test.txt");
		var lines = Files.readAllLines(path);
		
		var words = new TreeSet<String>();
		for(var line : lines)
		{
			var parts = line.split("\\s+");
			for (var p : parts)
				words.add(p);
		}
		
		for(var word : words)
			System.out.println(word);
	}

}
