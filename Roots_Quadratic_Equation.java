package IISC;

import java.util.Scanner;

public class Roots_Quadratic_Equation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float a = scan.nextFloat();
		System.out.println("Enter the second number: ");
		float b = scan.nextFloat();
		System.out.println("Enter the third number: ");
		float c = scan.nextFloat();
		double root1, root2;
		double determinant = b * b - 4 * a * c;
		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		}else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}
}
