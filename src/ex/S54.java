package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		// TODO
		if (value < 0) {
			return "negative";
		} else if (value > 0) {
			return "positive";
		} else {
			return "zero";
		}

	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		// TODO
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		// TODO
		switch (value) {
		case 1:
			return "zero";

		case 2:
			return "one";

		case 3:
			return "two";

		case 4:
			return "three";

		case 5:
			return "four";

		case 6:
			return "five";

		case 7:
			return "six";

		case 8:
			return "seven";

		case 9:
			return "eight";

		case 0:
			return "zero";

		default:
			return "other";

		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		// TODO
		if (percentile <= 50) {
			return 'F';
		} else if (percentile > 50 && percentile <= 60) {
			return 'E';
		} else if (percentile > 60 && percentile <= 70) {
			return 'D';
		} else if (percentile > 70 && percentile <= 80) {
			return 'C';
		} else if (percentile > 80 && percentile <= 90) {
			return 'B';
		} else
			return 'A';
	}
	
	public static char voteEx(double percentile) throws Exception {
		// TODO
		if (percentile <= 50) {
			return 'F';
		} else if (percentile > 50 && percentile <= 60) {
			return 'E';
		} else if (percentile > 60 && percentile <= 70) {
			return 'D';
		} else if (percentile > 70 && percentile <= 80) {
			return 'C';
		} else if (percentile > 80 && percentile <= 90) {
			return 'B';
		} else if(percentile <= 100 && percentile > 90) {
			return 'A';
		} else if(percentile > 100 || percentile < 0) {
			throw new Exception("You cannot pass a percentile greater than 100 or less than 0");
		} else {
			return 'N';
		}
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		// TODO
		if (year % 4 != 0 && year % 400 != 0) {
			return false;
		} else if (year % 100 == 0 && year % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		// TODO
		if (a < b && a < c) {
			result[0] = a;
			if (c > b) {
				result[1] = b;
				result[2] = c;
			} else {
				result[1] = c;
				result[2] = b;
			}
		} else if (a > b && a < c) {
			result[1] = a;
			if (c > b) {
				result[0] = b;
				result[2] = c;
			} else {
				result[0] = c;
				result[2] = b;
			}
		} else if (a > b && a > c) {
			result[2] = a;
			if (c > b) {
				result[0] = b;
				result[1] = c;
			} else {
				result[0] = c;
				result[1] = b;
			}
		}
		return result;
	}



public static int[] sort1(int a, int b, int c) {
	int[] result = new int[3];
	// TODO
	if (a < b && a < c && b < c ) {			                   	
		result[0] = a;                                          
		result[1] = b;				 	  
	    result[2] = c;				    
		} else {
			result[0] = a;
			result[1] = c;					    
			result[2] = b;				      
		}									 
	  if (a > b && a < c && b < c) {		   
		result[0] = b;					    				    
		result[1] = a;				    
		result[2] = c;				    
		} else {							  
			result[0] = c;				    
			result[1] = a;
			result[2] = b;
		}								    
	  if (a > b && a > c && b < c ) {            
		result[0] = b;
		result[1] = c;
		result[2] = a;
		} else {
		 result[0] = c; 
		 result[1] = b;
		 result[2] = a;
	 }
	return result;
     }
}


	
