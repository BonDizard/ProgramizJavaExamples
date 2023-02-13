package IISC;

import java.util.Scanner;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a = scan.nextLine();
		System.out.println("Enter the char u need to count: ");
		char b = scan.next().charAt(0);

		for(int i = 0; i<a.length();i++) {
			if (a.charAt(i) == b) {
				count += 1;
			}
		}
		System.out.printf("%c have apperaed in %s %d times ", b, a, count);
	}
}

