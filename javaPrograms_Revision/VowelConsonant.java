package javaPrograms_Revision;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
	//write a program that can accept any character from the end user and finalize the given character is vowel or consonent
  	   Scanner s1=new Scanner(System.in);
	   String c1=s1.next();
	   //if((c1=="a" && c1=="z")||(c1== "A" && c1=="Z"))
	  // {
		   if((c1=="a"||c1=="A")||(c1=="e"||c1=="E")||(c1=="i"||c1=="I")||(c1=="o"||c1=="O")||(c1=="u"||c1=="U"))
		   {
			   System.out.println("the given alphabet is vowel");
		   }
		   else
		   {
			  System.out.println("the given alphabet is consonent");
		   }
	   //}
		//else
		//{
			//System.out.println("the given value is not the identified family of alphabets");
		//}
			   
		   }
	   }