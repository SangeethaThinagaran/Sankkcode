package javaprogramming;

public class LocalVariable {
	
 void sum() {
	 //int q=20;
	 int q;
	 q=20;
	 int r=14;
	 System.out.println(q-r);
 }
 
 
 public static void main(String[] args) {
	LocalVariable l1=new LocalVariable();
	l1.sum();
	//System.out.println(q);
}
}
