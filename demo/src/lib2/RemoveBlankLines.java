package lib2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RemoveBlankLines {

	public static void main(String[] args) throws IOException {
		 var filename  = "d:\\classroom\\aug10\\names.txt";
		 
		 var path = Path.of(filename);
		 var lines = Files.readAllLines(path);
		 
		 var fw = new FileWriter(filename);
		 for (var line : lines) {
			 if (line.strip().length() > 0)
				  fw.write(line + "\n");
		 }
		 
		 fw.close();
	}

}
