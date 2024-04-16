//class with 1CM extends Abstraction Class with 2Am & 1CM implements Inerface with 2AM
package Assignments;
interface One{//interface
	void login();//Abstract Method 1
	void pwd();//Abstract Method 2
	}
abstract class two implements One{//Abstract class
	abstract void eduInfo();//Abstract Method 1
	abstract void personalInfo();//Abstract Method 2
	static void officeInfo() {//Concrete method 1
		System.out.println("Official Information");
	}
}
public class Interface_C_AC_I extends two{
	void travelInfo() {//Concrete Method 1
		System.out.println("Travel Information");
	}	
	public static void main(String[] args) {
		Interface_C_AC_I i1=new Interface_C_AC_I();
		i1.login();
		i1.pwd();
		i1.eduInfo();
		i1.personalInfo();
		officeInfo();
		i1.travelInfo();
	}
	@Override
	public void login() {
		System.out.println("Login Information");		
	}
	@Override
	public void pwd() {
		System.out.println("Passord Information");	
	}
	@Override
	void eduInfo() {
		System.out.println("Educational Information");
	}
	@Override
	void personalInfo() {
		System.out.println("Personal Information");
	}
}
