package Exercises;

public class Exercise13 {
public static void main(String[] args) {
	String s="I love India";
	for(int i=0;i<=s.length()-1;i++) {
		//System.out.println("forloop");
		System.out.println(s.charAt(i));
	}
	for(int j=s.length()-1;j>=0;j--) {
		System.out.println(s.charAt(j));
	}
	int a1=s.length();
	System.out.println(a1);
	System.out.println(s.charAt(5));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf('l'));
	System.out.println(s.equals("i love India"));
	boolean b=s.contains("Love");
	System.out.println(b);
	String s1="Ananya";
	System.out.println(s1.concat("Chandru").concat("Sangeetha"));
	
	
}
}
