package IISC;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPrimeNumber {
	public static void Prime(int x, int y) {
		ArrayList<Integer> noob = new ArrayList<Integer>();
		while (y > x) {
			boolean flag = false;
			for (int j = 2; j <= x / 2; ++j) {
				if (x % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag && x != 0 && x != 1) {
				noob.add(x);
			}
			x++;
		}
		for (int i = 0; i < noob.size() - 1; i++) {
			for (int j = 0; j < noob.size() - 1; j++) {
				if (noob.get(i) + noob.get(j) == y) {
					System.out.printf("%d+%d=%d ", noob.get(i), noob.get(j), y);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int high = scan.nextInt();
		Prime(0, high);
	}
}
