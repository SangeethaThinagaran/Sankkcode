   package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH_MultiException {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try{
			int c=1/s1.nextInt();
			System.out.println("try block");
		}
		catch(ArithmeticException a1){
			System.out.println("I have handled the exception called AE" );
		}
		catch(NullPointerException a2) {
			System.out.println("I have handled NullPointer Exception");
		}
		catch(InputMismatchException a3) {
			System.out.println("I have handled IMME");
		}
		catch(ArrayIndexOutOfBoundsException a4) {
			System.out.println("I have handled AIOOBE");
		}
		finally {
			System.out.println("it was an awesome experience");
		}

	}

}
