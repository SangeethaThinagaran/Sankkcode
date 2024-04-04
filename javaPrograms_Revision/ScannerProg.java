package javaPrograms_Revision;

import java.util.Scanner;

public class ScannerProg {
	static Scanner s1=new Scanner(System.in);
	static int a=s1.nextInt();
	static int b=s1.nextInt();
	
	/*void add() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}*/ 
	static void div() {
		int div=a/b;
		System.out.println(div);
	}
	static void mul() {
		int mul=a*b;
		System.out.println(mul);
	}
	public static void main(String[] args) {
		/*ScannerProg sp=new ScannerProg();
		sp.add();
		//Scanner s1=new Scanner(System.in);
		int c=s1.nextInt();
		int d=s1.nextInt();
		int sub=c-d;
		System.out.println(sub);
*/
		div();
		mul();

	}

}
