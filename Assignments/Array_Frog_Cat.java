package Assignments;
import java.util.Scanner;
public class Array_Frog_Cat {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s1.nextInt();
		if(n%3==0) {
			if(n%3==0 && n%5==0) {
				System.out.println("FROG and CAT"); 
			}
			else {				
			System.out.println("FROG");
			}
		}
			else if(n%5==0) {
				if(n%3==0 && n%5==0) {
					System.out.println("FROG and CAT");
				}
				else {
					System.out.println("CAT");
				}
		}
			else {
				System.out.println("LION");
			}
	}
}

