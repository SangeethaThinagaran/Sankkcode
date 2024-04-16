package Assignments;

public class Constructors5_Overloading {
//Contructor Overloading concept - creating 5 constructor methods with different parameters.
	Constructors5_Overloading(int a){
		System.out.println("This is the Constructor Overloading with INT parameter");
	}
	Constructors5_Overloading(char c){
		System.out.println("This is the Constructor Overloading with CHAR parameter");
	}
	Constructors5_Overloading(String s){
		System.out.println("This is the Constructor Overloading with STRING parameter");
	}
	Constructors5_Overloading(boolean b){
		System.out.println("This is the Constructor Overloading with BOOLEAN parameter");
	}
	Constructors5_Overloading(int a, boolean b, String s){
		System.out.println("This is the Constructor Overloading with INT, BOOLEAN and STRING parameters");
	}

	public static void main(String[] args) {
	/*Calling all the constructor methods by invoking the class directly without 
	creating a reference variable as it holds the same name as class name*/
		new Constructors5_Overloading(10);
		new Constructors5_Overloading('I');
		new Constructors5_Overloading("Programming is interesting!");
		new Constructors5_Overloading(true);
		new Constructors5_Overloading(7,false,"Unstoppable");
	}
}
