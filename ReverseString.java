package IISC;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string ");
		String str = scan.nextLine();
		rev(str);
	}
	public static void rev(String str) {
		for (int i = str.length() - 1; i >= 0 ; i--) {
			System.out.print(str.charAt(i)); 
		}
	}
}
