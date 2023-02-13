package IISC;
import java.util.Scanner;

public class Interval_Prime_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the begining no.");
		int low = scan.nextInt();
		System.out.println("enter the sencond no.");
		int high = scan.nextInt();

		while (low < high) {
			boolean flag = false;

			for (int i = 2; i <= low / 2; ++i) {

				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && low != 0 && low != 1)
				System.out.print(low + " ");

			++low;
		}
	}
}
