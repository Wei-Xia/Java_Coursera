import java.util.*;

public class Height {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your height with foot and inch");

		int foot = in.nextInt();
		int inch = in.nextInt();

		double meter = (foot+inch/12)*0.3048;

		System.out.println("Your height is "+ meter+" meter");

	}

}