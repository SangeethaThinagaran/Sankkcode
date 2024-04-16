package inheritance;
class GrandParents{
	 void grandParent() {
	 System.out.println("GrandParent Class");	
	}
}
class Parents extends GrandParents{
	static void parent() {
		System.out.println("Parent Class");
	}
}
public class Inheritance_Multilevel extends Parents {
	public static void main(String[] args) {
	Inheritance_Multilevel i1=new Inheritance_Multilevel();
	i1.grandParent();
	parent();
	}
}
