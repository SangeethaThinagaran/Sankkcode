//to create an array of length 5 int data type and 
//to store the data in it using the Scanner i/p
package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Array_ScannerIP {
	public static void main(String[] args) {
	int []numb=new int[5];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the First Number:");
	int n1=s.nextInt();
	//System.out.println(n1);
	numb[0]=n1;
	System.out.println("Enter the Second Number:");
	int n2=s.nextInt();
	numb[1]=n2;
	System.out.println("Enter the Third Number:");
	int n3=s.nextInt();
	numb[2]=n3;
	System.out.println("Enter the Fourth Number:");
	int n4=s.nextInt();
	numb[3]=n4;
	System.out.println("Enter the Fifth Number:");
	int n5=s.nextInt();
	numb[4]=n5;
	System.out.println(Arrays.toString(numb));
	}
}
