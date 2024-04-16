//To call STATIC & NONSTATIC methods inside the main method
package javaprogramming;

public class Static_NonStaticMethods {  
	//static methods
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
	//non static methods
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
		//calling static methods
		method1();
		method2();
		method3();
		method4();
		//Creating an object using reference variable
		Static_NonStaticMethods s1=new Static_NonStaticMethods();
		//calling non static methods
		s1.method5();
		s1.method6();
		s1.method7();
		s1.method8();
	}
	}