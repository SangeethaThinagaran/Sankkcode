//Find the Area of the Circle using 
//human i/p at run time, 10 times
package Assignments;
import java.util.Scanner;
public class AreaCircle_10RTinputs {
	static void AreaOfCircle() {
	double pi=3.14;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the radius value= ");
	int r=s1.nextInt();
	//for(int i=1;i<=10;i++) {
	double area=pi*r*r;
	System.out.println("The Area of the Circle= "+area);
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			AreaOfCircle();
		}
}
}
