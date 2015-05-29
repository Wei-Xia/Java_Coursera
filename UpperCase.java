//change first input word into Upper case

import java.util.*;

public class UpperCase {

  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    String s = in.nextLine();
    System.out.println(s);  //output the input word

    char ch  = s.charAt(0);
    if (Character.isLowerCase(ch))
    {
        ch = Character.toUpperCase(ch);
    }
    System.out.println(ch);

  }
}
