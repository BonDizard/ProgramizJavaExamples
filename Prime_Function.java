package IISC;

import java.util.Scanner;

public class Prime_Function {

	public static void Prime(int x, int y) {
		while (y > x) {
			boolean flag = false;
			for (int j = 2; j <= x / 2; ++j) {
				if (x % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && x != 0 && x != 1) {
				System.out.println(x);
			}
			x++;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int low = scan.nextInt();
		System.out.println("Enter the second number:");
		int high = scan.nextInt();
		Prime(low, high);

	}

}
