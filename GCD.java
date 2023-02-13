package IISC;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int x = scan.nextInt();
		System.out.println("Enter the second number");
		int y = scan.nextInt();
		int gcd = 1;
		for (int i = 1; i <= x && i <= y; ++i) {
			if (x % i == 0 && y % i == 0)
				gcd = i;
		}
		System.out.println("GCD of " + x + " and " + y + " is " + gcd);
	}
}
