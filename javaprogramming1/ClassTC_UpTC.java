package javaprogramming1;
class DataProvider{
	void username() {
		
	}
	void password() {
		
	}
}
public class ClassTC_UpTC extends DataProvider{
	
	
	void loginButton() {
		
	}

	public static void main(String[] args) {
		 DataProvider  d1=(DataProvider) new ClassTC_UpTC();//Upcasting
		
		d1.username();
		d1.password();
		
		//DataProvider d= new DataProvider();
		

	}

}
