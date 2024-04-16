package exceptionHandling;

public class throw_Program {

	public static void main(String[] args) throws NullPointerException, InterruptedException{
		//throw new NullPointerException();
		Thread.sleep(2000);
		throw new ArithmeticException("Sorry your file is empty ");
		

	}

}
