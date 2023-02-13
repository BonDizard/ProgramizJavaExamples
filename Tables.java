package IISC;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int x = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			int y = x * i;
			System.out.println(x + "*" + i + "=" + y);
		}
	}
}
