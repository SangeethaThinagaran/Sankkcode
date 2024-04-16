package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		int []numb=new int[5];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the integer");
		for(int i=0;i<numb.length;i++) {
			numb[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(numb));
	}

}
