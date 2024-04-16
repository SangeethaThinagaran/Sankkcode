package Arrays;

import java.util.Arrays;

public class Array_Examples1 {
	
public static void main(String[] args) {
	int age[]=new int[5];
	age[0]=91;
	age[1]=3;
	age[2]=45;
	age[3]=10;
	age[4]=100;
/*System.out.println(age[0]);
System.out.println(age[1]);
System.out.println(age[2]);
System.out.println(age[3]);
System.out.println(age[4]);
	*/
	for(int i=0;i<5;i++) {
		System.out.println(age[i]);
	}
		System.out.println(Arrays.toString(age));
		
		String a1="Thinagaran";
		System.out.println(a1.charAt(1));
		char[] value1=a1.toCharArray();
		System.out.println(value1[1]);
		System.out.println(Arrays.toString(value1));
		
		String value[]=new String[4];
		value[0]="Ram";
		value[1]="Sita";
		value[2]="Bhim";
		value[3]="Arjun";
		System.out.println(Arrays.toString(value));
		
}
}