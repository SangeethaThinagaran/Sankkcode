package javaprogramming;

public class GlobalVariable {
	int s=30;
	int c=0;
	int r;
	
	void sub() {
		r=10;
		System.out.println(s-r);
	}
	static void mul() {
		int c=1;
		
	}
	public static void main(String[] args) {
		GlobalVariable g1=new GlobalVariable();
		g1.sub();
		System.out.println(g1.c+g1.r);
	}
	
}
