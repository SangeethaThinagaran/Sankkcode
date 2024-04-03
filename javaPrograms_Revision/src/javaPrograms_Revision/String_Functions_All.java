package javaPrograms_Revision;

import java.util.Arrays;

public class String_Functions_All {

	public static void main(String[] args) {
		String name="I love India10";
		System.out.println(name.length());
		System.out.println(name.charAt(9));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf('i'));
		System.out.println(name.indexOf('I'));
		System.out.println(name.equals("I love India10"));
		System.out.println(name.equals("I love INDIA10"));
		System.out.println(name.contains("love"));
		System.out.println(name.substring(5));
		System.out.println(name.substring(5,10));
		System.out.println(name.concat("THE MOST"));
		System.out.println(name.replace('I','1'));
		System.out.println(name.replaceAll("[A-Z]","*"));
		System.out.println(name.replaceAll("[a-z]","!"));
		System.out.println(name.replaceAll("[0-9]","*"));
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf('i'));
		System.out.println(name.equalsIgnoreCase("i love india10"));
		System.out.println(name.equalsIgnoreCase("i love india"));
		System.out.println(name.repeat(3));
		char []a=name.toCharArray();
		System.out.println(Arrays.toString(a));
	}

}
