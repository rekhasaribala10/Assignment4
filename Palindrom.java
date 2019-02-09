package Assignment4;

public class Palindrom {

	public String findLongestPalindrome(String input) {
		String longest = "";

		for (int i = 0; i < input.length() - 1; i++) {

			String palindrome = checkInBetween(input, i, i);
			
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}

			 palindrome = checkInBetween(input, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;

	}

	public String checkInBetween(String s, int start, int end) {
		if (start > end)
			return null;
		while (start >= 0 && end <= s.length() -1  && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return s.substring(start + 1, end);
	}

}
