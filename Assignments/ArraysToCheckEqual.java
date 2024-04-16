package Assignments;

public class ArraysToCheckEqual {

	public static void main(String[] args) {
		int []n1=new int[3];
		n1[0]=10;
		n1[1]=20;
		n1[2]=30;
		int []n2=new int[3];
		n2[0]=10;
		n2[1]=20;
		n2[2]=30;
		for (int i=0;i<n1.length;i++) {
			if (n1[i]==n2[i]) {
			System.out.println("The value in index postion "+i+ " is equal");	
			}
		}
		

	}

}
