package IISC;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int ref = num;
		int temp = 0, sum = 0;
		while (num != 0) {
			temp = num % 10;
			sum += temp * temp * temp;
			num /= 10;
		}
		if (sum == ref) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
	}
}

