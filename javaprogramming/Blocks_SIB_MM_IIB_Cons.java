package javaprogramming;

public class Blocks_SIB_MM_IIB_Cons {
//SIB
	static {
	System.out.println("I am SIB, and the FIRST");
}
//IIB	
{
	System.out.println("I am IIB, and the THIRD");
}
//Constructor
Blocks_SIB_MM_IIB_Cons(){
	System.out.println("I am the Constructor and the FOURTH");
}
//MainMethod
public static void main(String[] args) {
	System.out.println("I am the Main Method and the SECOND");
	Blocks_SIB_MM_IIB_Cons b1=new Blocks_SIB_MM_IIB_Cons();
	}
}
