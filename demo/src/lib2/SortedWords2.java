package lib2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;

public class SortedWords2 {

	public static void main(String[] args) throws Exception {
		 
		var path = Path.of("d:\\classroom\\aug10\\test.txt");
		var contents = Files.readString(path);
		
		var sortedWords = new TreeSet<String>();
		var words = contents.split("\\s+");
				
		sortedWords.addAll(Arrays.asList(words));		
		
		for(var word : sortedWords)
			System.out.println(word);
	}

}
