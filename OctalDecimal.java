package IISC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class OctalDecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the \n1:for octal decimal\n2: for decimat to octal");
		int x = scan.nextInt();
		System.out.println("Enter the number: ");
		int a = scan.nextInt();
		if (x == 1) {
			OctalToDecimal(a);
		} else {
			DecimalToOctal(a);
		}
	}

	private static void DecimalToOctal(int a) {
		int temp = 0, num = a;
		ArrayList<Integer> fire = ArmStrong(num);
		System.out.print("The Number is : ");
		for (int i : fire) {
			System.out.print(i);
		}
	}

	private static void OctalToDecimal(int a) {
		ArrayList<Integer> fire = new ArrayList<Integer>();
		int temp = 0, num = a;
		ArrayList<Integer> water = Digits(num);
		for (int j = water.size() - 1, i = 0; j >= 0; j--, i++) {
			int sum = water.get(i) * ((int) Math.pow(8, j));
			fire.add(sum);
		}
		for (int j : fire) {
			temp += j;
		}
		System.out.println("The number is :" + temp);
	}

	private static ArrayList<Integer> Digits(int num) {
		ArrayList<Integer> fire = new ArrayList<Integer>();
		String qwe = Integer.toString(num);
		char[] ch = qwe.toCharArray();
		for (char c : ch) {
			fire.add(Character.getNumericValue(c));
		}

		return fire;
	}

	private static ArrayList<Integer> ArmStrong(int num) {
		int temp;
		ArrayList<Integer> fire = new ArrayList<Integer>();
		while (num != 0) {
			temp = num % 8;
			num /= 8;
			fire.add(temp);
			Collections.reverse(fire);
		}
		return fire;
	}
}

