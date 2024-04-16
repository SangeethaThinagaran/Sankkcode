package accessSpecifier1;

public class Class3 {
	static void m5() {
		System.out.println("5");
	}
	public static void main(String[] args) {
		Class1 c1=new Class1();
		m5();
		c1.m2();
		c1.m3();
		c1.m4();
	}

}
