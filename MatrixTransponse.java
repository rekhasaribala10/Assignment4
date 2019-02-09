package Assignment4;

public class MatrixTransponse {

	public int[][] returnTransposedArray(int[][] sampleArray) {

		int totalLength = sampleArray.length - 1;

		for (int i = 0; i <= totalLength / 2; i++) {
			for (int j = i; j < totalLength - i; j++) {
				int x1 = sampleArray[i][j];
				int x2 = sampleArray[j][totalLength - i];
				int x3 = sampleArray[totalLength - i][totalLength - j];
				int x4 = sampleArray[totalLength - j][i];

				sampleArray[i][j] = x4;
				sampleArray[j][totalLength - i] = x1;
				sampleArray[totalLength - i][totalLength - j] = x2;
				sampleArray[totalLength - j][i] = x3;

			}
		}

		return sampleArray;
	}

}
