package javaPrograms_Revision;
interface loginInfo{
	void login();
	void registration();
}
interface eduInfo{
	void dept();
	void college();
	
}
public class Interface_Multiple implements loginInfo, eduInfo  {
	public static void main(String[] args) {
		Interface_Multiple i1=new Interface_Multiple();
		i1.login();
		i1.registration();
		i1.dept();
		i1.college();
		
	}
	public void login() {
		System.out.println("Login");
	}
	public void registration() {
		System.out.println("Registration");
	}
	@Override
	public void dept() {
		System.out.println("Department");			
	}
	@Override
	public void college() {
		System.out.println("College");
		
	}

}
