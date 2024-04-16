package javaprogramming1;
class Dataproviders{
	void username() {
		
	}
	void password() {
		
	}
}
public class LoginToAmazon extends Dataproviders{
	void login_button() {
		
	}

	public static void main(String[] args) {
		//Dataproviders d1=new LoginToAmazon();//Upcasting implicitly
		Dataproviders d1=(Dataproviders) new LoginToAmazon();//Upcasting explicitly
	d1.username();
	d1.password();
	LoginToAmazon a2=(LoginToAmazon) d1;//downcasting
	a2.username();
	a2.password();
	a2.login_button();   
	}

}
