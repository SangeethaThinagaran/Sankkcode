package javaprogramming1;
class login {
	private String password="contact@123";
	public String getPassword() {
	return password;	
	}
	public void setPassword(String password)//local variable
	{
		this.password=password;
	}
	private int age=18;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		login l1=new login();
		l1.setPassword("san@gmail.com");
		System.out.println(l1.getPassword());
		l1.setAge(20);
	System.out.println(l1.getAge( ));
	}

}
