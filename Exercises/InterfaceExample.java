package Exercises;

public interface InterfaceExample {
	void addint();//AM, AS-public
	void subint();
}
class ChanInterClass implements InterfaceExample{
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
		ChanInterClass s1=new ChanInterClass();
		s1.addint1();
		s1.addint();
		s1.subint();
	}
}
