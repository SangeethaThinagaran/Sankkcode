package Assignments;

//to create a program with SIB, MM, IIB(2 objects) and Constructors(2 objects) 
public class Block_Order {
	static//SIB
	{
		System.out.println("I am SIB");
	}
	
	Block_Order()//Constructor
	{
		System.out.println("I am the Constructor");
	}
	{ //IIB
		System.out.println("I am IIB");
	}
	public static void main(String[] args) {
		System.out.println("I am your Main Method i.e HEART");
		Block_Order b1=new Block_Order();
		Block_Order b2=new Block_Order();
		}
}
