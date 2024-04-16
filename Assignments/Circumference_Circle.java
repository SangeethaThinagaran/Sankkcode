//to calculate the Circumference of the Circle
package Assignments;
import java.util.Scanner;//importing Scanner class
public class Circumference_Circle {
final static double pi=3.14;
Scanner s1=new Scanner(System.in);
{
	System.out.println("Enter the value of the Diameter:");
}
int d=s1.nextInt();//getting the RunTime input for Diameter
void Circumference() {
	double Circumference=pi*d;
	System.out.println("Circumference of the Circle="+Circumference);
}
public static void main(String[] args) {
	Circumference_Circle c1=new Circumference_Circle();
	c1.Circumference();
}
}
