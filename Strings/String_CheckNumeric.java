package Strings;

import java.util.Arrays;

public class String_CheckNumeric {

	public static void main(String[] args) {
		int count=0;
		String name="Aarya02";
		char []a=name.toCharArray();
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isDigit(a[i]);
			if (answer==true) {
				System.out.println(a[i]+"is a numeric value at index: "+i);
				count++;
			}
			}
		System.out.println(count+" numerics are present in the this String");
	}

}
