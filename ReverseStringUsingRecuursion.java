package IISC;

import java.util.Scanner;

public class ReverseStringUsingRecuursion {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String reversed = reverse(sentence);
		System.out.println("The reversed sentence is: " + reversed);
	}

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;
		else {
			return reverse(sentence.substring(1)) + sentence.charAt(0);
		}
	}
}

