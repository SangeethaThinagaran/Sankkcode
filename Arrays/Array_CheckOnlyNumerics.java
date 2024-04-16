package Arrays;

public class Array_CheckOnlyNumerics {

	public static void main(String[] args) {
		String num="12357657";
		char[] n1=num.toCharArray();
		int count=0;
		for(int i=0;i<num.length();i++) {
			boolean answer=Character.isDigit(n1[i]);
			if(answer==true)
			count++;
		}
		if(num.length()==count) {
			System.out.println("The String has only Numbers");
		}
		else {
			System.out.println("The String not only has Numbers");
		}
	}

}
