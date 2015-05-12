import java.util.*;

public class Change {

	public static void main(String[] args) {

		int bill = 100;

		Scanner in = new Scanner(System.in);
		System.out.println(in.next());
		System.out.println(in.next());
		
		int price = 0;
		price = in.nextInt();
		bill = in.nextInt();

		int change = bill -price;
		System.out.println(change);


	}
}