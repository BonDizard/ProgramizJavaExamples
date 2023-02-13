package IISC;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageUsingArrays {
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> bond = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the valuse: ");
		String x = scan.nextLine();

		for (int i = 0; i <= x.length() - 1; i++) {
			char y = x.charAt(i);
			if (y == ' ') {
				continue;
			}
			int num = y - '0';
			bond.add(num);
		}
		for (int i : bond) {
			sum += i;
		}
		System.out.println(sum/2);
	}
}

