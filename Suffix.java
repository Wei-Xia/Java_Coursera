import java.util.*;

public class Suffix {

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			int i=10;
			int k= i++ + i;   // k=10+1+10=21   
			
			int m= i+ ++i;		// m = 23
			System.out.println ("K is "+k);
			System.out.println ("M is "+m);
			System.out.println (++i);  // ++i = 13
		

	}
}