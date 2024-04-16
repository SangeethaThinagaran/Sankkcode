package inheritance;

public class TC2_HRR extends Login_HRR {
static void personalInfo() {
		System.out.println("Enter the Name:");
		System.out.println("Enter the Address:");
	}
public static void main(String[] args)  {
	TC2_HRR t1=new TC2_HRR();
	t1.login();
	personalInfo();
}
}
