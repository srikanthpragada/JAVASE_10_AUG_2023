package basics;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter radius :");
		double radius = s.nextDouble();

		double area = Math.PI * radius * radius;

		System.out.printf("Area = %.2f", area);

	}
}
