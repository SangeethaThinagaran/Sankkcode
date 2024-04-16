  package javaprogramming;

public class This_Calling_Statement_Program {
	This_Calling_Statement_Program(){
		this(5,true);
		System.out.println("1");
	}
	This_Calling_Statement_Program(int a){
		System.out.println("2");
	}
	This_Calling_Statement_Program(int a, boolean b){
		this(0.2f);
		System.out.println("3");
	}
	This_Calling_Statement_Program(float f){
		this(4);
		System.out.println("4");
	}
	public static void main(String[] args) {
		This_Calling_Statement_Program t1=new This_Calling_Statement_Program();
		
	}
}
