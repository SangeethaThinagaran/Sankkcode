package Strings;

public class String_Name {
public static void main(String[] args) {
	String s="ChanDru";
	int a=s.length();
	System.out.println(a);
	char c=s.charAt(2);
	System.out.println(c);
	String n=s.toLowerCase();
	System.out.println(n);
	String n1=s.toUpperCase();
	System.out.println(n1);
	int b=s.indexOf('r');
	System.out.println(b);
	boolean b1=s.equals("CHANDRU");
	System.out.println(b1);
	for(int i=0;i<a;i++) {
		System.out.println(s.charAt(i));
		}
	System.out.println("=========");
	for(int i=0;i<a;i++) {
		System.out.print(s.charAt(i));
		//System.out.println(" ");
		}
		System.out.println("=========");
	for(int i=a-1;i>=0;i--) {
		System.out.println(s.charAt(i));
	}
	System.out.println("=========");
	for(int i=a-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
	}
}
