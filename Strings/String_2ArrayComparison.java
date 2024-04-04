package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_2ArrayComparison {

	public static void main(String[] args) {
		int number[]=new int[3];
		int number2[]=new int[3];
		number[0]=55;
		number[1]=33;
		number[2]=56;
		number2[0]=55;
		number2[1]=33;
		number2[2]=56;
		boolean answer=Arrays.equals(number, number2);
		System.out.println(answer);

	}

}
