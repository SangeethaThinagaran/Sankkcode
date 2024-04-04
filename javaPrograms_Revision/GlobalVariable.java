package javaPrograms_Revision;

public class GlobalVariable {
	static int a;
	char c;
	static void add() {
		a=5;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	void sub() {
		a=14;
		int b=10;
		int sum=a-b;
		System.out.println(sum);
	}
public static void main(String[] args) {
	add();
	GlobalVariable g1=new GlobalVariable();
	g1.sub();
}
}
