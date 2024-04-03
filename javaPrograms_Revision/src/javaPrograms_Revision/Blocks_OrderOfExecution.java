package javaPrograms_Revision;

public class Blocks_OrderOfExecution {
	{
		System.out.println("IIB1");
	}
	Blocks_OrderOfExecution(){
		System.out.println("Constructor");
	}
	static void add() {
		System.out.println("Static Method");
	}
	{
		System.out.println("IIB2");
	}
	
	public static void main(String[] args) {
		add();
		System.out.println("Main Method");
		new Blocks_OrderOfExecution();
		Blocks_OrderOfExecution b1=new Blocks_OrderOfExecution();
		//add();
	}
	static {
		System.out.println("SIB");
	}
}
