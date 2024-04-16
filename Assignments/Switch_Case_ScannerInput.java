//to ADD, SUB, MUL & DIV in CASE and 
//give i/p using Scanner in Switch()
package Assignments;

import java.util.Scanner;

public class Switch_Case_ScannerInput {
	static int n1=3;
	static int n2=2;
	static void add() {
		int add=n1+n2;
		System.out.println("The addition of 2 number is : "+add);
		}
	static void sub() {
		int sub=n1-n2;
		System.out.println("The subtraction of 2 number is : "+sub);
	}	
	static void mul() {
		int mul=n1*n2;
		System.out.println("The multiplication of 2 number is : "+mul);
	}	
	static void div() {
		int div=n1/n2;
		System.out.println("The Division of 2 number is : "+div);
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int num=1;
		System.out.println("Enter the value of Switch: ");
		int s=s1.nextInt();
		switch(s) {
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mul();
			break;
		case 4:
			div();
			break;
			default:
				System.out.println("Are you looking for any other Arithmetic operation?");
		}
	}

}
