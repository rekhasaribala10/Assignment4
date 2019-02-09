package Assignment4;

public class MoveAllZerosToTheEnd {

	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 3, 12 };
		int length = array.length; 
		int count = 0;

		//Traverse an array
		for (int i = 0; i < length; i++) {
			if (array[i] != 0) { 
				array[count++] = array[i];
			}//{1,3,12}
		}
		
		while (count < length)
			array[count++] = 0;// push the zeros {1,3,12,0,0}

		for (int j = 0; j < length; j++) {
			System.out.println(array[j]);
		}
	}
}
