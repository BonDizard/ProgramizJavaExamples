package IISC;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		char x = scan.next().charAt(0);
		char[] y = { 'a', 'e', 'i', 'o', 'u' };

		if (x == y[1]) {
			System.out.println("The character is a vowel");
		} else if (x == y[2]) {
			System.out.println("The character is a vowel");
		} else if (x == y[3]) {
			System.out.println("The character is a vowel");
		} else if (x == y[4]) {
			System.out.println("The character is a vowel");
		} else {
			System.out.println("consonant");
		}
	}

}
