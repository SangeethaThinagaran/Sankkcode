package javaPrograms_Revision;
class Parent{
	Parent(){
		System.out.println("Cons");
	}
	/*static void Parentclass() {
		System.out.println("Parent Class");
	}*/
	
}
public class Inheritance_Single extends Parent {

	public static void main(String[] args) {
		//Parentclass();
		Inheritance_Single i1=new Inheritance_Single();
		i1.ParentClass2();
		/*Inheritance_Single(){
			System.out.println("Cons_chid");
		}*/
	}
	void ParentClass2() {
		System.out.println("Non Static Parent Class");
	}

}
