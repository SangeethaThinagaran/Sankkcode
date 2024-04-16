package Assignments;
class Parent1 {
		static void add() {
			System.out.println("Parent Class");
		}
	}
class Parent2{
		void sub() {
			System.out.println("Parent Class_Static Method");
		}
	}
public class Multiple_Inheritance_Check extends Parent1 {
	public static void main(String[] args) {
		Multiple_Inheritance_Check ml1=new Multiple_Inheritance_Check();
//		ml1.sub();
		add();		
	}
}
