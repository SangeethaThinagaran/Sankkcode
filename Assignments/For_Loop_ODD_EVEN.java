//to print and EVEN an ODD numbers from 1 to 100
package Assignments;
public class For_Loop_ODD_EVEN
{
public static void main(String[] args) 
{
	for(int i=1;i<=100;i++) 
	{
		if(i%2==0)
		{
			System.out.println("The number "+i+ " is EVEN.");
		}
		else 
		{
			System.out.println("The number " +i+ " is ODD.");
		}
	}
	}
}
