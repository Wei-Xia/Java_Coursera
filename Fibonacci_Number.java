//output first 20 fibonacci numbers

import java.util.*;

public class Fibonacci_Number {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int [] a =new int[20];
		a[0] = 0;
		a[1] = 1;
		for (int i=2; i<a.length; i++){
			a[i] = a[i-1]+a[i-2];
		}
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}