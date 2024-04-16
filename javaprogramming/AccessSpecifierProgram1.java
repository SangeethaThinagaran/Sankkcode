package javaprogramming;

public class AccessSpecifierProgram1 {
private void m1() {
	System.out.println("1");
}
protected void m2() {
	System.out.println("2");
}
public void m3() {
	System.out.println("3");
}
 void m4() {
	System.out.println("4");
}

	public static void main(String[] args) {
		AccessSpecifierProgram1 a1=new AccessSpecifierProgram1();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();

	}

}
