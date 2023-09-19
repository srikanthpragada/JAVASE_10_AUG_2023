package lib2;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		 // Raw-type
		 var al = new ArrayList();
		 al.add("Abc");
		 al.add(LocalDate.now());
		 al.add(10); // 10 to Integer (AutoBoxing)

		 // Type-safe 
		 var names = new ArrayList<String>();
		 names.add("Larry");
		 var s = names.get(0);
	}
}
