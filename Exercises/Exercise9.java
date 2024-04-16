package Exercises;
import java.util.*;
public class Exercise9 {
	//Scanner s1=new Scanner(System.in);
	int num1;
	int num2;
	void add() {
		int sum=num1+num2;
		System.out.println(sum);
	}
	void sub() {
		int sub=num1-num2;
		System.out.println(sub);
	}
	public static void main(String[] args) {
	  Exercise9 e1=new Exercise9();
	  Scanner s1 =new Scanner(System.in);
	  e1.num1=s1.nextInt();
	  e1.num2=s1.nextInt();
	  e1.add();
	  e1.sub();
	  
	
}
}
