package IISC;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String num = scan.next();
		String y = "";
		for (int i = num.length()-1; i >= 0; i--) {
			y = y + num.charAt(i);
		}
		if(num.toLowerCase().equals(y)) {
			System.out.println("Palindrome");
			System.out.println(y);

		}else {
			System.out.println("Not palindrome");
			System.out.println(y);
		}
	}
}

