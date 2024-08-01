package testNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case5 {
	@Test 
	public void testcase1() {
		System.out.println("1");
	}
	@BeforeMethod
public void launchBrowser() {
		System         .out.println("launch");
	}
@AfterMethod
public void quit() {
	System.out.println("Quit");
}
@Test 
public void testcase2() {
	System.out.println("2");
}

	           
}
