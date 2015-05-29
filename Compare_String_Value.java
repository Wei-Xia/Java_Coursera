//compare String smaller or greater

import java.util.*;

public class Compare_String_Value {

  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    String s1 = "abc";
    String s2 = "bcd";
    String s3 = "Tom";
    String s4 = "Liz";

    System.out.println(s1.compareTo(s2)); //compare with content in ASCII
    System.out.println(s3.compareTo(s4)); //compare with content in ASCII

  }
}
