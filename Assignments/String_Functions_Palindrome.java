//Get the runtime String value to check whether it is a PALINDROME using String Function
package Assignments;

import java.util.Scanner;

public class String_Functions_Palindrome {
	
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
			//String input="madam";
				System.out.println("Enter the String:");
				String input=s.next();
			String output="";
			for(int i=input.length()-1;i>=0;i--) {
					char rev=input.charAt(i);
					output=output+rev;
					}
			System.out.println(output);
				if (input.equals(output)) {
					System.out.println("It is a Palindrome");
				}
				else {
					System.out.println("It is not Palindrome");
				}
					
				}
			}





