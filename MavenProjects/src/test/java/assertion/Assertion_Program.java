package assertion;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertion_Program {
@ Test
public void tc1(){
	Assert.assertTrue(false);
}

@ Test
public void tc2(){
	Assert.assertTrue(true);
}
}
