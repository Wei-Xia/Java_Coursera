//convert 16 jinzhi into 10 jinzhi
// 16 can be the other jinzhi

import java.util.*;

public class Convert {

  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    String s = in.nextLine();
    Integer i = Integer.valueOf(s,16);
    int ii=i;
    System.out.println(ii);
  }
}
