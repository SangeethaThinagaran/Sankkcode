package javaPrograms_Revision;

import java.util.Scanner;

public class Vowels_Consonant {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the input: ");
		String s=s1.next();
		//System.out.println(s);
		char []c=s.toCharArray();
		boolean answer=Character.isAlphabetic(c[0]);
		//System.out.println(answer);
		if(answer==true) {
		if((s.equals("a"))||(s.equals("A"))||(s.equals("e"))||(s.equals("E"))||(s.equals("i"))||(s.equals("I"))||(s.equals("o"))||(s.equals("O"))||(s.equals("u"))||(s.equals("U"))) {
		System.out.println("It is a VOWEl");
	}
		else {
		System.out.println("It is a CONSONANT");
		}
		}
			else {
				System.out.println("It is not the alphabet family");
			}
	
	}

}
