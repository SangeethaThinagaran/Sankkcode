package inheritance;
class Single_Parent_Class
	{
		static void add() {
			System.out.println("Parent Class");
		}
		void sub() {
			System.out.println("Parent Class_Static Method");
		}
	}
	public class Inheritance_SingleLevel extends Single_Parent_Class{
	public static void main(String[] args) {
		Inheritance_SingleLevel sl1=new Inheritance_SingleLevel();
		sl1.sub();
		add();		
	}
	}

