package IISC;

import java.util.Scanner;

public class Higest_of_Three_num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float x = scan.nextFloat();
		System.out.println("Enter the second number: ");
		float y = scan.nextFloat();
		System.out.println("Enter the third number: ");
		float z = scan.nextFloat();
		if(x>y&&x>z) {
			System.out.println("x greater");
		}else if(y>x&&y>z) {
			System.out.println("y is greater");
		}else{
			System.out.println("z is greater");
		}

	}

}

