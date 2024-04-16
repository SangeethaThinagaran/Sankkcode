package Arrays;

public class Array_Number6 {

	public static void main(String[] args) {
		int []numb=new int[4];
		numb[0]=77;
		numb[1]=6;
		numb[2]=75;numb[3]=97;
		int six=6;
		for(int i=0;i<numb.length;i++) {
			if(numb[i]==six) {
				System.out.println("It is a SIX at indexing position "+i);
			}
			else {
				System.out.println("Sorry! we couldnt find SIX at the indexing position "+i);
			}
		}

	}

}
