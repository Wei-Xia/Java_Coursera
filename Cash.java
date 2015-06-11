//charge given money with one, five, ten, twenty dollar bills
//it may have many different results

import java.util.*;

public class Cash {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int amount;
		do{
			System.out.println("Enter cash from 1 to 100:");
			amount = scan.nextInt();
		}  while (amount <1 || amount>100);

		for (int one = 0; one <= amount; one++){
			for (int five = 0; five <= amount/5; five++){
				for (int ten = 0; ten <= amount/10; ten++){
					for (int twenty = 0; twenty <= amount/20; twenty++)
						if (one + five*5 + ten*10 + twenty*20 == amount)
							System.out.println("Thera are "+one+ " one bills, "+ five +  " five bills, " + ten +  " ten bills, " + twenty +  " twenty bills" );
				}
			}

		}

	}
}
	
