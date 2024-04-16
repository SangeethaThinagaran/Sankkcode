//to check whether the String has only Alphabets
package Arrays;
public class Array_CheckOnlyAlpha {
	public static void main(String[] args) {
		String name="Sang123eetha";
		char []n=name.toCharArray();
		int count=0;
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isAlphabetic(n[i]);
			System.out.println(Character.isSpaceChar(n[i]));
			
			if(answer==true) {
			count++;
		}
		}
		if(name.length()==count){
			System.out.println("The String has only Alphabets");
		}
		else {
			System.out.println("The String not only has Alphabets");
		}
	}

}
