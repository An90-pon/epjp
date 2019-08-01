package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		// TODO
		long sum = 0L;
		int i = 0;
		if (first < last && first > 0) {
			for (i = 0; i < last; i++) {
				sum = sum + (first + i);
			}
			return sum;
		} else if (first == last) {
			return first;
		} else {
			return 0;
		}
	}

	public static long sumEx(int first, int last) throws Exception {
		// TODO
		long sumEx = 0L;
		int i = 0;
		for (i = 0; i < last; i++) {
			sumEx = sumEx + (first + i);
		}
		if (last < first) {
			throw new Exception("Last shouldn't be greater than first ");
		}
		return sumEx;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		// TODO
		long evenSum = 0L;
		int i = 0;
		int d = last - first;
		if (first % 2 == 0 && first < last) {
			for (i = 0; i < d; i = i + 2) {
				evenSum = evenSum + (first + i);
			}
			return evenSum;
		} else if (first % 2 != 0 && first < last) {
			for (i = 0; i < d; i = i + 2) {
				evenSum = evenSum + (first + 1 + i);
			}
			return evenSum;
		} else if (first == last) {
			return first;
		} else {
			return 0;
		}
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		int i = 0;
		long factorial = 1;
		if (value >= 1) {
			for (i = 1; i <= value; i++) {
				factorial = factorial * i;
			}
			return factorial;
		} else {
			return 0;
		}

	}

	public static long factorialEx(int value) throws Exception {
		// TODO
		int i = 0;
		long factorial = 1;
		for (i = 1; i <= value; i++) {
			factorial = factorial * i;
		}
		if (value < 0) {
			throw new Exception("You cannot calculate factorial of negative number");
		}
		return factorial;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value < 1 || value > 21) {
			return 0;
		}
		long fibonacci = 0L;
		// long fibonacci1 = 1L;
		int i = 0;
		int n = 3;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for (i = 0; i < n; i++) {

			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			fibonacci = n3;
		}
		return fibonacci;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		int i = 0;
		int j = 0;
		for (i = 0; i < (value - 1); i++) {
			for (j = 0; j < (value - 1); j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}
		return result;
	}
}
