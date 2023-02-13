package IISC;

import java.util.Scanner;

public class Odd_Eveen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = scan.nextInt();
		if(x%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}

}
