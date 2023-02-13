package IISC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OctalToBinary {
	private static ArrayList<Integer> Digits(int num) {
		ArrayList<Integer> fire = new ArrayList<Integer>();
		String qwe = Integer.toString(num);
		char[] ch = qwe.toCharArray();
		for (char c : ch) {
			fire.add(Character.getNumericValue(c));
		}
		return fire;
	}

	private static void DecimalToOctal(int a) {
		int temp = 0, num = a;
		ArrayList<Integer> fire = ArmStrongs(num);
		System.out.print("The Number is : ");
		for (int i : fire) {
			System.out.print(i);
		}
	}

	private static ArrayList<Integer> ArmStrongs(int num) {
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

	private static ArrayList<Integer> ArmStrong(int num) {
		int temp;
		ArrayList<Integer> water = new ArrayList<Integer>();
		int[] fire = { 0, 0, 0 };
		for (int i = 0; i <= 2; i++) {
			temp = num % 2;
			num /= 2;
			fire[i] = temp;
		}
		for (int i = fire.length - 1; i >= 0; i--) {
			water.add(fire[i]);
		}
		return water;
	}

	private static void binaryToDecimal(int num) {
		int qwe = 0;
		ArrayList<Integer> water = new ArrayList<>();
		ArrayList<Integer> fire = new ArrayList<>();
		ArrayList<Integer> bond = new ArrayList<>();
		String h = Integer.toString(num);
		for (int i = 0; i < h.length(); i++) {
			String hi = Character.toString(h.charAt(i));
			int j = Integer.parseInt(hi);
			water.add((int) Math.pow(2, i));
			fire.add(j);
		}
		for (int l = fire.size() - 1; l >= 0; l--) {
			bond.add(fire.get(l));
		}
		for (int i = 0; i < water.size(); i++) {
			qwe += water.get(i) * bond.get(i);
		}
		DecimalToOctal(qwe);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter \n1:for Octal to binary\n2: for binary to octal");
		int a = scan.nextInt();
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		if (a == 1) {
			OctalBinary(num);
		} else {
			BinaryToOctal(num);
		}
	}

	public static ArrayList<Integer> noob(ArrayList<Integer> fire) {
		while (fire.size() % 3 != 0) {
			fire.add(0, 0);
		}
		return fire;
	}

	public static void bond(ArrayList<Integer> fire) {
		String n = "";
		System.out.println(fire);
		for (int i : fire) {
			n += Integer.toString(i);
		}
		int i = Integer.parseInt(n);
		binaryToDecimal(i);
	}

	private static void OctalBinary(int num) {
		ArrayList<Integer> water = new ArrayList<Integer>();
		for (int i : Digits(num)) {
			ArrayList<Integer> fire = ArmStrong(i);
			water.addAll(fire);
		}
		for (int i : water) {
			System.out.print(i);
		}
	}

	private static void BinaryToOctal(int num) {
		ArrayList<Integer> fire = Digits(num);
		fire = noob(fire);

		bond(fire);
	}
}
