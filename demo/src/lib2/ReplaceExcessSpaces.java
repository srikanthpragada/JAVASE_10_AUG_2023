package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceExcessSpaces {

	public static void main(String[] args) throws IOException {
		var path = Path.of("d:\\classroom\\aug10\\test.txt");
		var contents = Files.readString(path);
		
		Pattern p = Pattern.compile(" +");
		Matcher m = p.matcher(contents);
		String newContents = m.replaceAll(" ");
		System.out.println(newContents);

	}

}
