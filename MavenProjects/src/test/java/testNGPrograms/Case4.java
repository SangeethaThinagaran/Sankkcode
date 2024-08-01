package testNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Case4 {

	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
		@BeforeMethod
	public void BM() {
		System.out.println("BM");
	}
	
	@Test
	public void testmain() {
		System.out.println("Test");
	}
}
