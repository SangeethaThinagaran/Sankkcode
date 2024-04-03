package javaPrograms_Revision;

public class This_Keyword {
	char gender;
	String name;
	int age;
	
	 void info(String s, int a, char c)
	{
		System.out.println("Name:"+name+",age:"+age+",gender:"+gender);
		System.out.println("Name:"+s+",age:"+a+",gender:"+c);
		this.name=s;
		this.age=a;
		this.gender=c;
		System.out.println("Name:"+name+",age:"+age+",gender:"+gender);
	}
	public static void main(String[] args) {
		This_Keyword t1=new This_Keyword();
		t1.info("Chaarvi",5,'M');
		

	}

}
