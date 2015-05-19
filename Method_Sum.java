// use method to calculate

import java.util.*;

public class Method_Sum {
	
	public static void cal(int a, int b) {

		int i;
		int sum = 0;
		for (i=a; i<=b; i++){
			sum = sum +i;
		}

		System.out.println(sum);
	}

	public static void main(String[] args){

		cal(1,10);
		cal(20,30);
		cal(1,100);
		
	}
	
}