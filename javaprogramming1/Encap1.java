package javaprogramming1;

public class Encap1 {
private char c='T';
public char getC() {
return c;	
}
public void setC(char c) {
	this.c=c;
}

private String password="55REDHIPPO";
 public String getPassword() {
	 return password; 
 }
 public void setPassword(String password) {
	 this.password=password;
	 }
	public static void main(String[] args) {
	Encap1 e1=new Encap1();
	e1.setC('S');
	System.out.println(e1.getC());
	e1.setPassword("KAAS HIPPO");
	System.out.println(e1.getPassword());
	}
}
