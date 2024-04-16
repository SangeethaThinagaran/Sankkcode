package inheritance;

public class TC1_HRR extends Login_HRR{
	static void eduInfo() {
		System.out.println("Education Information");
	} 
	public static void main(String[] args) {
		//eduInfo();
		TC1_HRR t1=new TC1_HRR();
		t1.login();
		eduInfo();
	}
}
