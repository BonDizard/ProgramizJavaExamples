package IISC;

import java.util.Scanner;

public class Recurrsion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println(Fact(num));
	}

	public static int Fact(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return x;
		} else {
			return x * Fact(x - 1);
		}
	}
}

