package IISC;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] fire = { { 2, 2 }, { 3, 3 } };
		int[][] water = { { 1, 1 }, { 4, 4 } };
		int k[][] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				k[i][j] = fire[i][j] + water[i][j];
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
	}

}
