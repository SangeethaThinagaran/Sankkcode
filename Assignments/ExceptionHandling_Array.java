package Assignments;

public class ExceptionHandling_Array {

	public static void main(String[] args) {
	int []num=new int[3];
	num[0]=1;
	num[1]=0;
	try{
		num[2]=num[1]/num[1];
	}
	catch(Exception a1) {
		System.out.println("It is an Arithmetic Exception");
	}
	

	}

}
