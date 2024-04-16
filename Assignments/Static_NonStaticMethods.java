package Assignments;

public class Static_NonStaticMethods {
	static void method1() {
		System.out.println("Static Method1");
	}
	static void method2(){
		System.out.println("Static Method2");
	}
	static void method3() {
		System.out.println("Static Method3");
	}
	static void method4(){
		System.out.println("Static Method4");
	}
	void method5() {
		System.out.println("Non Static Method5");
	}
	void method6(){
		System.out.println("Non Static Method6");
	}
	void method7() {
		System.out.println("Non Static Method7");
	}
	void method8(){
		System.out.println("Non Static Method8");
	}
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
		Static_NonStaticMethods a1=new Static_NonStaticMethods();
		a1.method5();
		a1.method6();
		a1.method7();
		a1.method8();
		
	}
	}

