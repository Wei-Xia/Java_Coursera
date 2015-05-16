// three ways to get the results of f(n)

//f(n) = 1 - 1/2 + 1/3 - 1/4 + 1/5 - .... - 1/n

import java.util.*;

class Fraction {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

/*    	[way 1]
		int sign = 1;
		double result = 0.0;

		for (int i=1; i<=n; i++){

			result = result + sign*(1.0/i);
			sign=-sign;
		}

		System.out.println(result);


		[way 2]
		double sign = 1.0; 
		double result = 0.0;
		for (int i=1; i<=n; i++) {
			result = result+ sign/i;
			sign=-sign;
		}

		System.out.println(result);
*/
		double result = 0.0;    //  [way 3]
		for (int i=1; i<=n; i++) {
			result = result+ ((i%2 == 1)?1.0:-1.0) / i;
		}

		System.out.println(result);
	}
	
}
