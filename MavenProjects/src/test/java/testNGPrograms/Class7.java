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

public class Class7 {

	@BeforeMethod
	public void BM() {
		System.out.println("BM");
	}
	@Test
	public void testmain1() {
		System.out.println("Test1");
	}
	@Test
	public void testmain2() {
		System.out.println("Test2");
	}
	@Test
	public void testmain3() {
		System.out.println("Test3");
	}
}
