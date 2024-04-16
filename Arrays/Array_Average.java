package Arrays;

public class Array_Average {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		numbers[0]=10;
		numbers[1]=10;
		numbers[2]=10;
		numbers[3]=10;
		numbers[4]=10;
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println(sum);
		double average=sum/numbers.length;
		System.out.println(average);
	}

}
