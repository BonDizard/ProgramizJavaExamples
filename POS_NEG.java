package IISC;

import java.util.Scanner;

public class POS_NEG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the num");
		int x = scan.nextInt();
		if(x>=0) {
			System.out.println("pos");
		}else {
			System.out.println("NEG");
		}
	}
}
