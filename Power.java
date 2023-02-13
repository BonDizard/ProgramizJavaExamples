package IISC;
import java.math.*;
import java.util.Scanner;
public class Power {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the base:");
	double x = scan.nextInt();
	System.out.println("enter the base");
	double y = scan.nextInt();
	double z = Math.pow(x, y);
	System.out.println("The power is " + z);
}
}

