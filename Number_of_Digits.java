package IISC;

import java.util.Scanner;

public class Number_of_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int count = 0;

		for (; num != 0; num /= 10, ++count) {
		}

		System.out.println("Number of digits: " + count);
	}
}
