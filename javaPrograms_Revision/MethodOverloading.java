package javaPrograms_Revision;

public class MethodOverloading {
void method() {
	System.out.println("Method1");
}
void method(int a) {
	System.out.println("Method2 with int");
}
static void method(int a, String s) {
	System.out.println("Method3 with int and String");
}
public static void main(String[] args) {
	method(4,"San");
	MethodOverloading m1= new MethodOverloading();
	m1.method();
	m1.method(1);
}

}
