package javaprogramming;
class GrandParent {
	GrandParent(){
	System.out.println("3");
}
}
class Parent extends GrandParent{
	Parent(){
	System.out.println("2");
}
	
}
public class Super_ChildCase extends Parent{
	Super_ChildCase(){
		System.out.println("1");
	}
	
 public static void main(String[] args) {
	 {
		 Super_ChildCase sc1=new Super_ChildCase();
		 //Super_ChildCase();
	 }
}
}
