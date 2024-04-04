package Strings;

public class String_Functions3 {

	public static void main(String[] args) {
		String name="I am Student";
		System.out.println(name.replace('a',' '));
		System.out.println(name.replace('t', 'n'));
		System.out.println(name.replaceAll("[A-Z]",""));
		System.out.println(name.replaceAll("[a-z]", ""));
		String name1="Hey I am Fin9!";
		System.out.println(name1.replaceAll("[0-9]",""));
		String name2="Sangeetha";
		System.out.println(name2.replaceAll("[A-Z]","Manish"));
		System.out.println(name2.isEmpty());
		System.out.println(name.lastIndexOf('t'));
		System.out.println(name.equalsIgnoreCase("i am student"));
		System.out.println(name.equalsIgnoreCase("student"));
		System.out.println(name.repeat(4));
		
	}

}
