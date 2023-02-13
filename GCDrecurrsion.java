package IISC;

import java.util.Scanner;

public class GCDrecurrsion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int n1 = scan.nextInt();
		System.out.println("Enter the second number");
		int n2 = scan.nextInt();
		int hcf = hcf(n1, n2);
		System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
	}

	public static int hcf(int n1, int n2) {
		if (n2 != 0)
			return hcf(n2, n1 % n2);
		else
			return n1;
	}
}
