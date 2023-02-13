package IISC;

import java.util.Scanner;

public class Quotient_and_Remainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter thhe first number:");
		int num = scan.nextInt();
		System.out.println("Enter thhe Second number:");
		int num_2 = scan.nextInt();
		System.out.println("The Quotient of the two numbers are: " + quotient(num,num_2));
		System.out.println("The Remainder of the two numbers are: " + remainder(num,num_2));

	}
	public static int quotient(int x , int y) {
		return x/y;
	}
	
	public static int remainder(int x , int y) {
		return x%y;
	}
}

