//f(n) = 1! + 2! + 3! + 4! + ..... + n!

import java.util.*;

public class Factorial {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum = 0;
		int f = 1;
		for (int i=1; i<=n; i++){
			f = i*i;
			sum = sum + f;
		}
		System.out.println(sum);
		
	}
}