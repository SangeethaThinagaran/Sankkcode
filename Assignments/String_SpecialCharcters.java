//to calculate the no of Special Chracters in the String
package Assignments;
public class String_SpecialCharcters {
	public static void main(String[] args) {
		int countalpha=0;
		int countnumeric=0;
		String name="Sangeetha123*!*";
		char []s1=name.toCharArray();
//to caculate the no of numerics in the String		
		for(int i=0;i<name.length();i++) {
			boolean answer=Character.isDigit(s1[i]);
			if (answer==true) {
				//countnumeric=countnumeric++;
				countnumeric++;
				}
			}
		System.out.println(countnumeric);
//to calculate the no of alphabets in the the String
		for (int j=0;j<name.length();j++) {
			boolean answer1=Character.isAlphabetic(s1[j]);
			if(answer1==true) {
			//countalpha=countalpha++;	
			countalpha++;
			}
		}
		System.out.println(countalpha);
		int noOfSpecialCharacters=name.length()-(countalpha+countnumeric);
		System.out.println(noOfSpecialCharacters);
	}

}
