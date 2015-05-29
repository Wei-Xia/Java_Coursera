//change input number into 16 jinzhi

import java.util.*;

public class Convert_Sixteen {

  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    String s = in.nextLine();
    System.out.println(s);

    Integer i = Integer.parseInt(s);
    System.out.println(Integer.toString(i,16));
  }
}
