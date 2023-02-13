package IISC;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarayToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the \n1:for binary to Decimal" + "\n2: for decimal to binary");
		int x = scan.nextInt();
		System.out.println("Enter the number");
		int num = scan.nextInt();
		if (x == 1) {
			binaryToDecimal(num);
		} else {
			DecimalToBinary(num);
		}
	}

	private static void DecimalToBinary(int num) {
		ArrayList<Integer> fire = new ArrayList<>();
		ArrayList<Integer> bond = new ArrayList<>();

		while (num != 0) {
			int noob = num % 2;
			num /= 2;
			fire.add(noob);
		}
		for (int i = fire.size() - 1; i >= 0; i--) {
			bond.add(fire.get(i));
		}
		System.out.println(bond);

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
		System.out.println(qwe);
	}
}
