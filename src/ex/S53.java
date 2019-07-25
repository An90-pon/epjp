package ex;

public class S53 {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		// TODO
		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		// TODO
		return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore
	 * @param stroke
	 * @param nr     number of cylinders
	 * @return the engine capacity
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		// TODO
		return nr * Math.PI * (bore / 2) * (bore / 2) * stroke / 1000;
	}

	// somma delle cifre in un numero
	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		// TODO
		int sum = 0;

		while (value != 0) {
			sum = sum + Math.abs(value) % 10;
			value = value / 10;
		}

		return sum;
	}

}
