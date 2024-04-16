package javaprogramming;
//to create a program with SIB, MM, IIB(2 objects) and Constructors(2 objects) 
public class Blocks_Order {
	static//SIB
	{
		System.out.println("I am SIB");
	}
	
	Blocks_Order()//Constructor
	{
		System.out.println("I am the Constructor");
	}
	{ //IIB
		System.out.println("I am IIB");
	}
	public static void main(String[] args) {
		System.out.println("I am your Main Method i.e HEART");
		Blocks_Order b1=new Blocks_Order();
		Blocks_Order b2=new Blocks_Order();
		}
}
