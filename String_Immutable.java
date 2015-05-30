//String is immutable, it can't be changed once assigned.

public class String_Immutable {

public static void main (String[] args) {

	String s = "hello";
	g(s);
}

public static void g (String s) {

	System.out.println(s.toUpperCase());
	System.out.println(s);
}
  }

