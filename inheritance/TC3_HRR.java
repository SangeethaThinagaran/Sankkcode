package inheritance;

public class TC3_HRR extends Login_HRR{
	TC3_HRR() {
		//super(); is called implicitly here
		System.out.println("Enter the experience in 1st Company");
		System.out.println("Enter the experience in 2nd Company");
			}
	public static void main(String[] args) {
		TC3_HRR t3=new TC3_HRR();
		t3.login();
		//workExperience();
			}

}
