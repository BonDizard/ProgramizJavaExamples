package IISC;

import java.util.Scanner;

public class ArmstrongFunction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int low = scan.nextInt();
		System.out.println("Enter the first number");
		int high = scan.nextInt();

		ArmStrong(low, high);
	}

	private static void ArmStrong(int low, int high) {
		for (int number = low + 1; number < high; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;
			digits = Power(digits, originalNumber);
			originalNumber = number;
			result = Result(digits, result, originalNumber);
			
			if (result == number) {
				System.out.print(number + " ");
			}
		}
	}

	private static int Result(int digits, int result, int originalNumber) {
		while (originalNumber != 0) {
			int remainder = originalNumber % 10;
			result += Math.pow(remainder, digits);
			originalNumber /= 10;
		}
		return result;
	}

	private static int Power(int digits, int originalNumber) {
		while (originalNumber != 0) {
			originalNumber /= 10;
			++digits;
		}
		return digits;
	}
}
