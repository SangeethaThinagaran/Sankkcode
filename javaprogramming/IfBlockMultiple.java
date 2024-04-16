package javaprogramming;

public class IfBlockMultiple {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
	//FIRST TRUE condition will be executed eventhough there are mutiple TRUE conditions in the program
		
		if (a>b) {
			System.out.println("a is GREATER THAN b");
		}
		if (a<b) {
			System.out.println("a is LESSER THAN b");
		}
		if (a>=b) {
			System.out.println("a is GREATER THAN or EQUAL TO b");
		}
		if (a<=b) {
			System.out.println("a is LESSER THAN or EQUAL TO b");
		}
		if (a==b) {
			System.out.println("a is EQUAL TO b");
		}
		if (a!=b) {
			System.out.println("a is NOT EQUAL TO b");
		}
		
	}

}
