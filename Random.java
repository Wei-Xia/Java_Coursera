//let compiler get a random number
//user inputs the number, compare the input number is large or small than random number
//end the complier untill input number = random number

import java.util.*;

class Random {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int number =(int)(Math.random()*100);
		int count = 0;
		int a=0;
		System.out.println ("I have already get a new number");

		do{
			System.out.println ("Guess form 1 to 100");
			a = in.nextInt();
			if (a>number){
				System.out.println ("The number you guess is too large");
				count++;
			}
			else
				if (a<number){
				System.out.println ("The number you guess is too small");
				count++;
			}
		} while (a != number);

		System.out.println ("Bingo!");
	
	}
}