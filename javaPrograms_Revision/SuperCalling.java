package javaPrograms_Revision;
class Para_SuperCalling{
	Para_SuperCalling() {
		System.out.println("Parent Class Constructor");
	}
	Para_SuperCalling(int a) {
		System.out.println("Parent Class Constructor -PARA");
	}
}
public class SuperCalling extends Para_SuperCalling {
	SuperCalling(){
		//super(9);
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {
		SuperCalling s1=new SuperCalling();

	}

}
