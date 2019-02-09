package Assignment4;

public class Sum {

	public int addRepeated(int sum) {
		while (sum / 10 > 0) {
			int remainder = sum % 10;
			int quotient = sum / 10;
			sum = remainder + quotient;
		}
		return sum;

	}

}