package IISC;

import java.util.Scanner;

public class Interval_Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int low = scan.nextInt();
		System.out.println("Enter the first number");
		int high = scan.nextInt();

		for (int number = low + 1; number < high; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;

			while (originalNumber != 0) {
				originalNumber /= 10;
				++digits;
			}

			originalNumber = number;

			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}

			if (result == number) {
				System.out.print(number + " ");
			}
		}
	}
}
