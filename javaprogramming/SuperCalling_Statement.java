package javaprogramming;
class Parent_1{
		Parent_1(String a){//constructor with para
			System.out.println("Parametrized");
		}

	Parent_1(){//constructor
		System.out.println("NonPara_Parent Method");
	}
}
public class SuperCalling_Statement extends Parent_1{
	SuperCalling_Statement(){
		super("SAN");
		System.out.println("Non Para");
	}
	public static void main(String[] args)  {
		SuperCalling_Statement s1=new SuperCalling_Statement();
		
	}
}
