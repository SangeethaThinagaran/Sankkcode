package Strings;

public class String_CalculateSpace {

	public static void main(String[] args) {
		String s="I  love  India";
		int count=0;
		char []c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			boolean answer=Character.isSpaceChar(c[i]);
			if (answer==true) {
				count++;
			}
			
		}
System.out.println(count);
	}

}
