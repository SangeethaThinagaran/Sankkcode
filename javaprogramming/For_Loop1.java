package javaprogramming;

import java.util.Scanner;

public class For_Loop1 {
	void num1to100(){
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
			
	}
	void alternateNum() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			i++;
		}
	}
	void evenNum() {
		for(int i=2;i<101;i++) {
			System.out.println(i);
			i++;
		}
	}
	void backInMinus() {
		for(int i=-10;i<1;i++)
			System.out.println(i);
	}
	static void infinite() {
		for(int i=0;i<1;i--)
		{
			System.out.println(i);
		}
	}
	static void div5() {
		Scanner s1=new Scanner(System.in);
		int j=s1.nextInt();
		for(int i=1;i<j;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		For_Loop1 l1=new For_Loop1();
		//l1.num1to100();
		//l1.alternateNum();
		//l1.evenNum();
		//l1.backInMinus();
		//infinite();
		div5();
		}

}
