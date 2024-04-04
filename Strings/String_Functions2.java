package Strings;

public class String_Functions2 {
public static void main(String[] args) {
	String s="I am Sangeetha";
	System.out.println(s.replaceAll("[A-Z]",""));
	System.out.println(s.replaceAll("[a-z]",""));
	String name1="Hey I am Fin9";
	System.out.println(name1.replaceAll("[0-9]", ""));
	String name3="";
	System.out.println(s.isEmpty());
	System.out.println(name3.isEmpty());
	System.out.println(s.lastIndexOf('a'));
	System.out.println(s.equalsIgnoreCase("i am sangeetha"));
	System.out.println(s.repeat(5));
	String s1="manish";
	System.out.println(s1.toCharArray());
                    
}
}
