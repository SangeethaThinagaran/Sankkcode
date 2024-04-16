package inheritance;

class Parent1{
	Parent1() {
	System.out.println("Parent1");
}
}
class Parent2 extends Parent1{
	Parent2(){
		System.out.println("Parent2");
	}
}
class Parent3 extends Parent2{
	Parent3(){
		System.out.println("Parent3");
	}
}
public class Inheritance_MUL1 extends Parent3{
public static void main(String[] args) {
	Inheritance_MUL1 m1=new Inheritance_MUL1();
}
}
