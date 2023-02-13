package IISC;

import java.util.Scanner;

public class CalculatorSwitch {
	public static double add(double x, double y) {
		return x + y;
	}

	public static double sub(double x, double y) {
		return x - y;
	}

	public static double mul(double x, double y) {
		return x * y;
	}

	public static double div(double x, double y) {
		return x / y;
	}

	public static double mod(double x, double y) {
		return x % y;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator\n" + "Enter 1 : Addition\n" + "Enter 2 : Subtraction\n"
				+ "Enter 3 : Multipliaction\n" + "Enter 4 : Divisison\n" + "Enter 5 : Modulus\n");
		int x = scan.nextInt();
		System.out.println("Enter the first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();

		switch (x) {
		case 1:
			System.out.println("Addition:" + add(num1, num2));
			break;
		case 2:
			System.out.println("Subtraction:" + sub(num1, num2));
			break;
		case 3:
			System.out.println("Multiplication:" + mul(num1, num2));
			break;
		case 4:
			System.out.println("Divivsion:" + div(num1, num2));
			break;
		case 5:
			System.out.println("Modulus:" + mod(num1, num2));
			break;
		default:
			System.out.println("Please Enter the proper option");
		}
	}
}
