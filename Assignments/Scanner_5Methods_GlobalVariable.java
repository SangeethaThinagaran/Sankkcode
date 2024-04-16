//for Scanner class, create 5 non static methods with Global variables
package Assignments;
import java.util.Scanner;
public class Scanner_5Methods_GlobalVariable {
   Scanner s1=new Scanner(System.in);
   	{
   		System.out.println("Enter the FIRST Number:");
   	}
	 int num1=s1.nextInt();
	 {
	   		System.out.println("Enter the SECOND Number:");
	   	}
	 int num2=s1.nextInt();

void add() {
	int sum=num1+num2;
	System.out.println("Sum="+sum);
}
void sub() {
	int sub=num1-num2;
	System.out.println("Sub="+sub);
}
void mul() {
	int mul=num1*num2;
	System.out.println("Mul="+mul);
}
void div() {
	int div=num1/num2;
	System.out.println("Div="+div);
}
void mod() {
	int mod=num1%num2;
	System.out.println("Mod="+mod);
}
public static void main(String[] args) {
	Scanner_5Methods_GlobalVariable sg1=new Scanner_5Methods_GlobalVariable();
	//Scanner s1=new Scanner(System.in);
	//System.out.println("Enter the FIRST Number:");
	 //sg1.num1=s1.nextInt();
	//System.out.println("Enter the SECOND Number:");
     //sg1.num2=s1.nextInt();
	//System.out.println("Enter the FIRST Number:");
      //sg1.num3=s1.nextInt();
	//System.out.println("Enter the SECOND Number:");
	 //sg1.num4=s1.nextInt();
	sg1.add();
	sg1.sub();
	sg1.mul();
	sg1.div();
	sg1.mod();
}

}
