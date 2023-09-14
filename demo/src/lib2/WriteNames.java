package lib2;

import java.io.FileWriter;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		String[] names = { "Jack", "James", "Andy", "Scott", "Larry" };

		try (var fw = new FileWriter("d:\\classroom\\aug10\\names.txt", true)) {
			for (var name : names) {
				fw.write(name + "\n");
			}
		}
	}

}
