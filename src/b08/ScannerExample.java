package b08;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		int i;
		int j;
		double avg = 0;
		int temp;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please, enter the number of elements: ");
		int n = scan.nextInt();
		
		int[] numbers = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Please enter the next number: ");
			numbers[i] = scan.nextInt();
		}
		scan.close();

		
		for(j = 0; j < numbers.length - 1; j++) {
			temp = numbers[j];
			avg = avg + temp / (j + 1); 
		}
		
		System.out.println("The average is: " + avg);
	}
		
}	
		
		

	


