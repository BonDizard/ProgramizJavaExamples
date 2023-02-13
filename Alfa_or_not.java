package IISC;

import java.util.Scanner;

public class Alfa_or_not {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char c = scan.next().charAt(0);
		int ch = (int) c;

		if (ch >= 67) {

			System.out.println("is character");
		} else {
			System.out.println("not");
		}

	}
}

