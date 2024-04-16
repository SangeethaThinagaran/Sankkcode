package javaprogramming;
abstract class Abs_Parent {//AC
	void add() {//CM
		String a="San";
		String b="geetha";
		String name=a+b;
		System.out.println(name);
	}
	static void sub() {//CM
		String a="Krishna";
		String b=" Kumar";
		String name=a+b;
		System.out.println(name);
    }
	abstract void mul();//AM
	abstract void div();//AM
}
public class Abstract_Class_Methods extends Abs_Parent {
	void mul() {//Abstract Method implementation
		System.out.println("Multiplication");
	}
	void div() {//Abstract Method implementation
		System.out.println("Divison");
	}
	public static void main(String[] args) {
		Abstract_Class_Methods ac1=new Abstract_Class_Methods();
		ac1.add();
		sub();
		ac1.mul();
		ac1.div();
		
	}

}
