package exceptionHandling;

public class ExceptionHandling_Prog {

	public static void main(String[] args) {
		try {
		int c=1/0;
		System.out.println(c);
		}
		catch(Exception a1) {
			System.out.println("I have handled Exceptions");
		}

	}

}
