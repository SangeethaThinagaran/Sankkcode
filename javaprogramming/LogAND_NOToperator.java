package javaprogramming;

public class LogAND_NOToperator {
	public static void main(String[] args) {
		int age=54;
		//int salary=72000;
		int salary=5000;
			//Both the condition should be FALSE to execute this statement otherwise it will go to ELSE_IF block
		if(!(age>18 && salary<50000)) {
			System.out.println("Are you talking about Ram?");
		}
		//if both are FALSE, it will execute this statement otherwise it will goto ELSE block 
		else if(!(age>18 && salary<72000)) {
			System.out.println("ARe you talking about Sita?");
		}
		//if IF and ELSE_IF inside condition is true, it will reverse the input as FALSE then this block will be executed directly
		else {
			System.out.println("I got it, its Laxman.");
		}
	}
}
