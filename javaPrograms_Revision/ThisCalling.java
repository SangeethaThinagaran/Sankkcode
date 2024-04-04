package javaPrograms_Revision;

public class ThisCalling {
	ThisCalling() {
		this(1.0);
		System.out.println("1");
	}
	ThisCalling(int a) {
		System.out.println("4");
	}
	ThisCalling(char c) {
		this(5);
		System.out.println("3");
	}
	ThisCalling(double d) {
		this('v');
		System.out.println("2");
	}
	public static void main(String[] args) {
		new ThisCalling();

	}

}
