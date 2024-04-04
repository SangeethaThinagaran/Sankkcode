package javaPrograms_Revision;

public class Constructor_Overloading {
	Constructor_Overloading(){
		System.out.println("Constructor Overloading with Non Para");
	}
	Constructor_Overloading(int a, char c){
		System.out.println("Constructor Overloading with Para");
	}
	public static void main(String[] args) {
		new Constructor_Overloading();
		new Constructor_Overloading(2,'c');
	}
}


