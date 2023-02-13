package IISC;

import java.util.Scanner;

public class StandardDeviation {
	public static void main(String[] args) {
		double N = 0, sum = 0, bond = 0;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i : a) {
			N++;
			sum += i;
		}
		double u = sum / N;
		for (int j : a) {

			bond += Math.pow((j - u), 2);
		}
		double SD = Math.sqrt(bond / N);
		System.out.println(SD);
	}
}
