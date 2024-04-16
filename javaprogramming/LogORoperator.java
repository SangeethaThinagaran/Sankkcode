package javaprogramming;

public class LogORoperator {
	public static void main(String[] args) {
		//int age=4;
		int age=54;
		//int salary=72000;
		int salary=5000;
			//1 of the condition should be true to execute this statement otherwise it will go to ELSE_IF block
		if(age>18 || salary==50000) {
			System.out.println("Are you talking about Ram?");
		}
		//if 1 of the condition is not TRUE, it will goto ELSE block 
		else if(age>18 || salary==72000) {
			System.out.println("ARe you talking about Sita?");
		}
		//if 1 of the condition in IF or ELSE_IF is not TRUE, this block will be executed directly
		else {
			System.out.println("I got it, its Laxman.");
		}
	}
}
