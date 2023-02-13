package IISC;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		boolean hat = false;
		if ((year % 4 == 0)) {
			if (year % 100 == 0) {
				hat = true;
				if (year % 400 == 0) {
					hat = true;
				}else {
					hat = false;
				}
			}else {
				hat = true;
			}
		} else {
			hat = false;
		}
		if(hat) {
			System.out.println("leap");
		}else {
			System.out.println("not leap");
		}
		scan.close();
	}
}
