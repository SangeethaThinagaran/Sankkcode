package Arrays;
import java.util.Arrays;
public class Array_Reverse {
	public static void main(String[] args) {
		int val[]=new int [5] ;
		int num[]=new int[5];
		int k=num.length-1;
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		//num[0]=num[2];
		//System.out.println(num[0]);
		for(int i=0;i<num.length;i++) {
		val[k]=num[i];
		k--;
		}
System.out.println(Arrays.toString(num));
System.out.println(Arrays.toString(val));

	}              

}


