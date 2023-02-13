package IISC;

public class MatrixMultiplicationUsingFunction {

	public static void main(String[] args) {

		int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
		MatMux(firstMatrix, secondMatrix);
	}

	private static void MatMux(int[][] firstMatrix, int[][] secondMatrix) {
		int r1 = 2, c1 = 3, c2 = 2;
		int[][] product = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		display(product);
	}

	public static void display(int[][] matrix) {
		System.out.println("The matrix is: ");
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}
}
