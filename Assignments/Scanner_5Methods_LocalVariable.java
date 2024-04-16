//for Scanner class, create 5 non static methods with local variables 
package Assignments;
import java.util.Scanner;// importing Scanner class
public class Scanner_5Methods_LocalVariable {
	void add() {
		Scanner s1=new Scanner(System.in);//Creating object for Scanner class
		System.out.println("Enter the FIRST number for Addition:");
		int num1=s1.nextInt();
		System.out.println("Enter the SECOND number for Addition:");
		int num2=s1.nextInt();
		int sum=num1+num2;
		System.out.println("Sum="+sum);
	}
	void sub() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the FIRST number for Subtraction:");
		int num1=s1.nextInt();
		System.out.println("Enter the SECOND number for Subtraction:");
		int num2=s1.nextInt();
		int sub=num1-num2;
		System.out.println("Sub="+sub);
	}
	void mul() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the FIRST number for Multiplication:");
		int num1=s1.nextInt();
		System.out.println("Enter the SECOND number for Multiplication:");
		int num2=s1.nextInt();
		int mul=num1*num2;
		System.out.println("Mul="+mul);
	}
	void div() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the FIRST number for Division:");
		int num1=s1.nextInt();
		System.out.println("Enter the SECOND number for Division:");
		int num2=s1.nextInt();
		int div=num1/num2;
		System.out.println("Div="+div);
	}
	void mod() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the FIRST number for Modulus:");
		int num1=s1.nextInt();
		System.out.println("Enter the SECOND number for Modulus");
		int num2=s1.nextInt();
		int mod=num1%num2;
		System.out.println("Mod="+mod);
	}
	public static void main(String[] args) {
		Scanner_5Methods_LocalVariable sm1=new Scanner_5Methods_LocalVariable();
		sm1.add();
		sm1.sub();
		sm1.mul();
		sm1.div();
		sm1.mod();
		
		
	}
}
