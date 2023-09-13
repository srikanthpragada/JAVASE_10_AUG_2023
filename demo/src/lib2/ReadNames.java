package lib2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadNames {

	public static void main(String[] args) throws Exception {

		try (var fr = new FileReader("d:\\classroom\\aug10\\names.txt")) {
			var br = new BufferedReader(fr);
			while (true) {
				var line = br.readLine();
				if (line == null) // EOF
					break;
				System.out.println(line);
			}
		}
	}

}
