//use array to calculate average of given group numbers
//output the numbers which are greater than average

import java.util.*;

public class Array_Average {
	
	public static void main(String[] args) {

		System.out.println("How many numbers that you want to enter");
		Scanner in = new Scanner(System.in);
		int element = in.nextInt();
		double[] numbers = new double [element];   //get how many elements that user wants to enter

		double sum=0;

		System.out.println("Enter each number");
		for (int i=0; i<element; i++)
		{		
			numbers[i] = in.nextDouble();
			sum = sum + numbers[i];
		}

		double average = sum/element;
		for (int i=0; i<element; i++){

			if (numbers[i]>= average)
				System.out.println(numbers[i]);
		}
	}
}