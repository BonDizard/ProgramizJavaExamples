package IISC;

import java.util.Scanner;

public class MUl_float {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter thhe first number:");
	float num = scan.nextInt();
	System.out.println("Enter thhe Second number:");
	float num_2 = scan.nextInt();
	System.out.println("The product of the two numbers are : " + mul(num,num_2));
}
public static float mul(float x , float y) {
	return x*y;
}
}
