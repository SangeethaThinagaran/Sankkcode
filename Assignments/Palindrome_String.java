package Assignments;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String output="";
		System.out.println("Enter the Word : " );
		String word=s.next();
		for(int i=word.length()-1;i>=0;i--) {
			char rec=word.charAt(i);
			output=output+rec;
			}
		//System.out.println(output);
		if (output.equals(word)) {
		System.out.println(word+" is a palindrome");
	}
		else {
			System.out.println(word+" is not a palindrome");
		}

	}
}
