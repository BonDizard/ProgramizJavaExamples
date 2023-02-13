package IISC;

import java.util.Scanner;

public class Fab {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		int x = scan.nextInt();
		int i = 0;
		while(i<=x) {
			System.out.println(n1);
			int temp  = n1 + n2;			
			n1 = n2;
			n2 = temp;
			i++;
		}
	}
}

