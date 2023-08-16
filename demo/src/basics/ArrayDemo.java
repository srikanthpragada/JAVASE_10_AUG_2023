package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		 int a[] = new int[10];
		 
		 
		 for(int i = 0; i < 10; i ++)
		 {
			 a[i] = i * i;
			 System.out.printf("%3d", a[i]);
		 }

	}

}
