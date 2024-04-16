package javaprogramming;

public class NestedIfBlock {
	public static void main(String[] args) {
		int age=19;
		double salary=20000.00;
		//if statement can have multiple IF, IF_ELSE, Nested_IF
		if(age<18) {
			if(salary<10000) {
				System.out.println("IF-inside IF loop 1");
			}
			else {
				System.out.println("IF-inside ELSE loop");
			}
			System.out.println("IF-inside Outer IF loop");
		}
		//else block can also have mutiple IF, IF_ELSE, Nested_IF blocks
		else {
				//System.out.println("ELSE-outer ELSE loop");
				if(salary>15000) {
					System.out.println("ELSE-inside IF loop 1");
				}
				else {
					System.out.println("ELSE-inside ELSE loop");
				}
				System.out.println("ELSE-outer ELSE loop");
			}
		}
	}


