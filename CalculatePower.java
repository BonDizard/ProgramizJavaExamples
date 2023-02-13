package IISC;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the base value: ");
		int a = scan.nextInt();
		System.out.println("Enter the exponent value:   ");
		int b = scan.nextInt();
		System.out.println(Power(a,b));
		
	}

	private static int Power(int a, int b) {
		if (b==0) {
			return 1;
		}else {
			return a*Power(a, b-1);	
		}
	}
}
