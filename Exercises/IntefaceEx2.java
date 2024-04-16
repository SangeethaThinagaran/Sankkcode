package Exercises;
interface InterfaceExample1 {
	void addint();//AM, AS-public
	void subint();
}
abstract class InterAbs {
	
}
public class IntefaceEx2 implements InterfaceExample {
	void addint1() {
		System.out.println("add1");
	}
	@Override
	public void addint() {
		System.out.println("add");		
	}
	@Override
	public void subint() {
		System.out.println("sub");		
	}
	public static void main(String[] args) {
		IntefaceEx2 s1=new IntefaceEx2();
		s1.addint1();
		s1.addint();
		s1.subint();
	}
}
