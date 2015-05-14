import java.util.*;

public class ReverseOrder {
	
	public static void main(String[] args) {

		int [] numbers = new int [2];
		Scanner in = new Scanner(System.in);
		System.out.println ("The size of the array: " + numbers.length);

		for (int index = 0; index< numbers.length; index++){
			System.out.print("Enter number " + (index +1)+ ": ");
			numbers[index] = in.nextInt();
		}

		System.out.println ("The numbers in reverse order:");

		for (int index = numbers.length-1; index >=0; index--)
			System.out.print(numbers[index]+ " ");
		System.out.println();

	}
}