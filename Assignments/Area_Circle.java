//to caculate the Area of the Circle
package Assignments;
import java.util.Scanner;//importing Scanner class
public class Area_Circle {
final static double  pi=3.14;
Scanner s1=new Scanner(System.in);//implementation of Scanner class
{ //IIB
	System.out.println("Enter the Int value for Radius:");
}
int r=s1.nextInt();//getting theRun Time input for Radius
void areaInt() {
	double Area=pi*r*r;
	System.out.println("Area of the Circle for Int Radius is:"+Area);
	}
{ //IIB
	System.out.println("Enter the Double value for Radius:");
}
double r1=s1.nextDouble();
void areaDouble() {
	double Area=pi*r1*r1;
	System.out.println("Area of the Circle for Double Radius is:"+Area);
	}
public static void main(String[] args) {
	Area_Circle a1=new Area_Circle();
	a1.areaInt();
	a1.areaDouble();
}
}
