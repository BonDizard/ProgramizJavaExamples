package IISC;

import java.util.Scanner;

public class Add_Two_Interers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter thhe first number:");
		int num = scan.nextInt();
		System.out.println("Enter thhe Second number:");
		int num_2 = scan.nextInt();
		System.out.println("The sum of the two numbers are:"+ add(num,num_2));
	}
	public static int add(int x, int y) {
		return x + y;
	}
}
