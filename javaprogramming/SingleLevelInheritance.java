package javaprogramming;
class Single_Parent_Class
{
	static void add() {
		System.out.println("Parent Class");
	}
	void sub() {
		System.out.println("Parent Class_Static Method");
	}
}

public class SingleLevelInheritance extends Single_Parent_Class{
public static void main(String[] args) {
	SingleLevelInheritance sl1=new SingleLevelInheritance();
	sl1.sub();
	add();
	
	
}
}
