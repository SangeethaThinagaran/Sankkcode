package javaPrograms_Revision;

import java.util.Scanner;

public class Area_Of_Circle {
	Scanner s1=new Scanner(System.in);
	final static double pi=3.14;
	
	 void Area_Of_Circle(int a) {
		int r=s1.nextInt();
		double area = pi*r*r;
		System.out.println("Area1 = " + area);
	}
	 void Area_Of_Circle(double d) {
			double r=s1.nextDouble();
			double area = pi*r*r;
			System.out.println("Area1 = " + area);
		}
public static void main(String[] args) {
	Area_Of_Circle a1=new Area_Of_Circle();
	a1.Area_Of_Circle(10);
	a1.Area_Of_Circle(10.0);
}
}
