package IISC;

import java.util.Scanner;

public class Fact {
	public static int factorial(int x) {

		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return x;
		} else {

			return x = x * factorial(x - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int x = scan.nextInt();
		System.out.println("THe fact is " + factorial(x));
	}
}

