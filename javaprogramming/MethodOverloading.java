package javaprogramming;

public class MethodOverloading {
	void sub() {
		int s=20;
		int c=15;
		System.out.println(s-c);
		}
	static void div() {
		int s=30;
		int c=3;
		System.out.println(s/c);
	}
 public static void main(String[] args) {
	MethodOverloading m1=new MethodOverloading();
	m1.sub();
	m1.div();
}
}
