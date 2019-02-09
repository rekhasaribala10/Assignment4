package Assignment4;

public class FindTheFirstNonRepeatingCharacter {

	public int findNonRepeatingCharacter(String input) {
		char[] inputArray = input.toCharArray();

		for (int i = 0; i < inputArray.length; i++) {
			
			int checkCounter = 0;
			

			for (int j = 0; j < inputArray.length; j++) {
				
				if (i != j) { 
					if (inputArray[i] == inputArray[j]) { 
						break;
					} else {
						checkCounter++; 
					}
				}
			}

			if (checkCounter == inputArray.length - 1) {
				return i;
			}
		}

		return -1;
	}

}
