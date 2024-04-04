package javaPrograms_Revision;

public class For_Loop {
 public static void main(String[] args) {
	
	 //to print name 
/*  for (int i=0;i<=5;i++) {
	 System.out.println("Good Morning!");
	}
*/
	 //to print 1-100
/*	 for (int i=1;i<=100;i++) {
		 System.out.println(i);
		 }
*/ 
	 //to print alternate numbers from 1
/*	 for (int i=1;i<=100;i++) {
		 System.out.println(i);
		 i++;
		 }
*/		 
	//to print alternate numbers from 2
/*		 for (int i=2;i<=100;i++) {
			 System.out.println(i);
			 i++;
			 }
*/	 
	 //to print infinite times using i--
/*	 for (int i=0;i<1;i--) {
		 System.out.println(i);
	 }
*/	
	 //to print infinite times using i++
	 /*for(int i=1;i>0;i++) {
		 System.out.println(i);
	 }*/
	 for (int i=1;i<=100;i++)
	 {
		 if(i%2==0) {
			 System.out.println(i + " is a EVEN number");
		 }
		 //else {
			// System.out.println(i + " is a ODD number");
		 //}
	 }
}
}
