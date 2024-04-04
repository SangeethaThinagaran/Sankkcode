package Strings;

public class String_CheckAlphabets {

	public static void main(String[] args) {
		String name="Ananya2802";
		int count=0;
		char []Ann=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isAlphabetic(Ann[i]);
			if(answer==true) {
				count++;
			}
		}
			
		System.out.println(count+" alphabets are present");

	}

}
