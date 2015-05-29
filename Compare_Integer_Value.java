//compare Integer smaller or greater

import java.util.*;

public class Six {

  public static void main(String[] args){
    Integer i1 = 13;
    Integer i2 = 12;

    System.out.println(Integer.compare(i1,i2));   // 1 0 -1
    System.out.println(i1.compareTo(i2));  // 1 0 -1
    System.out.println(i1>i2); // true or false
  }
}
