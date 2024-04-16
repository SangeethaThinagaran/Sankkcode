package javaprogramming1;

public class PTypeCasting {

	public static void main(String[] args) {
		double weight= 83;//implicit syntax of widening                                                                            
		System.out.println(weight);
		
		double wt=(double)43;//explicit syntax of widening                                                                            
		System.out.println(wt);

		
		int a1 = (int)45.83;//explicit syntax of Narrowing
		System.out.println(a1);
		
		double d=55.66;
		int b=(int)d;
	}

}
 