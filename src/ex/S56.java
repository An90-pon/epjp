package ex;

public class S56 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		// TODO
		int i;
		int len = s.length();
		StringBuilder reversed = new StringBuilder(len);

		for (i = (len - 1); i >= 0; i--) {
			reversed.append(s.charAt(i));
		}

		return reversed.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		// TODO
		StringBuilder palb = new StringBuilder(s);
		palb.reverse();
		String reversed = palb.toString();
		if (s.equals(reversed)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		// TODO
		return s.replaceAll("[aeiouAEIOU]", "");
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		int i;
		int len = s.length();
		int intsum = 0;
		for (i = 0; i < len - 1; i++) {
			intsum = (int) (intsum + (Character.getNumericValue(s.charAt(len - i - 1)) * Math.pow(2 ,i)));
		}

		return intsum;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];
		int i;
		for (i = 0; i < data.length; i++) {
			result[i] = data[data.length - 1 - i];
		}
		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		double avg = 0;
		int temp;
		for (int i = 0; i < data.length - 1; i++) {
			temp = data[i];
			avg = avg + temp / (i + 1);
		}
		return avg;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		int tempmax = data[0];
		int i = 0;
		for (i = 0; i < data.length - 1; i++) {
			if (data[i] > tempmax) {
				tempmax = data[i];
			}
		}
		return tempmax;
	}
}
