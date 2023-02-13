package IISC;

import java.util.Scanner;

public class Find_ASCII {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char c = scan.next().charAt(0);
		int ch = (int)c;
		System.out.println("The ASCII value of"+c+" is: " + ch);
	}
}

