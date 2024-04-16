package Exercises;

import java.util.Scanner;

public class Exercise10 {
	
	Scanner s1=new Scanner(System.in);
	{
		System.out.println("Enter the 1st Number:");
	}
	static int a1;
	static int a2;
	void add() {
	int sum=a1+a2;
	System.out.println(sum);
	}
 public static void main(String[] args) {
	 Exercise10 e1=new Exercise10();
	 //Scanner s1=new Scanner(System.in);
	 a1=e1.s1.nextInt();
	 a2=e1.s1.nextInt();
	 e1.add();
	 
	
}
}
