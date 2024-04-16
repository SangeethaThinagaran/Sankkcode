package javaprogramming1;
class GrandParent{
	void add() {
		
	}
}
class Parent extends GrandParent {
	void sub() {
		
	}
} 
public class Childclass_DC extends Parent {
	void mul() {
		
	}
	public static void main(String[] args) {
		//Childclass_DC c1=new Childclass_DC();child class obj
		//c1.mul()=;
		Parent p1=new Childclass_DC();//Upcasting
		p1.add();
		p1.sub();
		Childclass_DC c1=(Childclass_DC) p1;//Downcasting  
		c1.add();
		c1.sub();
		c1.mul();
	}

}
