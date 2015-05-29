//compare String true or false

import java.util.*;

public class Compare_String {

  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    String s1 = in.next();   // inpunt "hello"
    String s2 = "hello";
    String s3 = "hello";

    System.out.println(s1==s2);  //s1 is the user's input   //false
    System.out.println(s2==s3);  //s2 and s3 is the same string   //true
    System.out.println(s1.equals(s2)); //only compare with content    //true


  }
}
