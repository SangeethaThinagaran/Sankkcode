package Exercises;

public class Exercise14 {
	int age;
	String name;
	char gender;
	void kid1(String s, int a, char c) {
		System.out.println("This is about Ananya");
		this.name=s;
		this.gender=c;
		System.out.println(name);
	}
	void kid2(String s, int a, char c) {
		System.out.println("This is about Aarya");
		
	}
	public static void main(String[] args) {
		Exercise14 e1=new Exercise14();
		e1.kid1("Anan", 10, 'F');
	}
	}
