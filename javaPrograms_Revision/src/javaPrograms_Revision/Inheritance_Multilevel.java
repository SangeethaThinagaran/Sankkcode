package javaPrograms_Revision;
class GrandParentMul extends ParentMul {
	 static void add() {
		System.out.println("addition");
	}
}
class ParentMul {
	 static void sub() {
		System.out.println("subtraction");
	}
}

public class Inheritance_Multilevel extends GrandParentMul {

	public static void main(String[] args) {
		add();
		sub();

	}

}
