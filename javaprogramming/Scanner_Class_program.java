package javaprogramming;

import java.util.Scanner;

//import java.util.Scanner; //or import java.util.*; where * means All

public class Scanner_Class_program {
	
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the FIRST number");
	int num1=s1.nextInt();
	System.out.println("Enter the SECOND number");
	int num2=s1.nextInt();
	int sum=num1+num2;
	System.out.println("The SUM of 2 numbers is, SUM="+sum);
}	
}
