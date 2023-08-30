package lib1;

public class TotalMarks {

	public static void main(String[] args) {

       String data = "80,45,56,89,75,93";
       
       int total = 0;
       
       for (String m : data.split(",")){
    	   total += Integer.parseInt(m);
       }
       
       System.out.println(total);
	}

}
