package Strings;

public class String_Functions {
public static void main(String[] args) {
	String a="I am Sangeetha";
	//contains
	boolean b=a.contains("gee");
	System.out.println(b);
	//subString(initial value)
	String s1=a.substring(5);
	System.out.println(s1);
	//subString(initial value, last index)
	//String s2=a.substring(2,4);
	System.out.println(a.substring(2,4));
	//concat-combining 2 Strings
	System.out.println(a.concat( ",Daddy's girl"));
}
}
