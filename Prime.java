//get all the prime numbers below 100

import java.util.*;

public class Prime {
	
	public static void main(String[] args) {

		for (int i=2; i<=100; i++){
			boolean isPrime = true;
			for (int k=2; k<i; k++){
				if (i%k ==0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.println(i);
		}		
	}
}