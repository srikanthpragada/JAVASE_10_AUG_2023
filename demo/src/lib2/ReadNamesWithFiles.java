package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadNamesWithFiles {

	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\aug10\\names.txt");
		String contents = Files.readString(p);
		System.out.println(contents);
	}

}
