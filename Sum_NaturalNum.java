package IISC;

import java.util.Scanner;

public class Sum_NaturalNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range ");
		int x = scan.nextInt();
		int sum = 0;
		int i = 0;
		while (i <= x) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
