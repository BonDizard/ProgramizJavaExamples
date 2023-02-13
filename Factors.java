package IISC;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		for(int i = 1; i<= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
