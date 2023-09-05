package oop2;

interface MathOperations {
	int add(int a, int b);
}

class MyOperations implements MathOperations {
	@Override
	public int add(int a, int b) {
		 return a + b;
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		 MathOperations op = new MyOperations();
		 System.out.println(op.add(10,20));
		 
		 op = new MathOperations() {
			 public int add(int a, int b) {
				 return a + b;
			 }
		 };
		 
		 System.out.println(op.getClass());
		 System.out.println(op.add(10,20));
		 
	}

}
