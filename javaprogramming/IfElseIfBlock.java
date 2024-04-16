package javaprogramming;

public class IfElseIfBlock {
	public static void main(String[] args) {
		int a=500;
		int b=500;
		int c=300;
	//FIRST TRUE condition will get executed here
		if(a>b) {
			System.out.println("a is GREATER THAN b");
		}
		else if(a>=b){
			System.out.println("a is GREATER THAN EQUALS TO b");
		}
		else if(a<b) {
			System.out.println("a is LESSER THAN b");
		}
		else{
			System.out.println("a is EQUALS TO b");
		}
	}

}
