package Assignment4;

public class TransposeMain {

	public static void main(String[] args) {
		MatrixTransponse mt = new MatrixTransponse();
		int[][] matrix = { { 1, 2, 3 }, 
						   { 4, 5, 6 }, 
						   { 7, 8, 9 } };
		matrix = mt.returnTransposedArray(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
