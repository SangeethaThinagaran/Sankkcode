package javaprogramming;

public class THIS_Keyword {
String name;
int age;
double salary;
void student_detail(String n, int a, double sal) {
	//System.out.println("I am "+name+" and my age is "+age+" and my salary is "+salary);
	this.name=n;
	this.age=a;
}
void student_detail1(String n, int a, double sal) {
	//System.out.println("I am "+name+" and my age is "+age+" and my salary is "+salary);
	this.name=n;
	this.age=a;
}
public static void main(String[] args) {
	THIS_Keyword tk1=new THIS_Keyword();
	tk1.student_detail("Anan",27,100000.00);
	System.out.println(tk1.name);
	System.out.println(tk1.age);
	System.out.println(tk1.salary);
	
	tk1.student_detail1("Aari",20,200000.00);
	System.out.println(tk1.name);
	System.out.println(tk1.age);
	System.out.println(tk1.salary);
}
}
