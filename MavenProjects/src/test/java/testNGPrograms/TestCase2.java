package testNGPrograms;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test(invocationCount=10)
	public void method1() {
		System.out.println("San");
	}
	@Test(timeOut=-1)
	public void method2() {
		System.out.println("logout");
	}
}
