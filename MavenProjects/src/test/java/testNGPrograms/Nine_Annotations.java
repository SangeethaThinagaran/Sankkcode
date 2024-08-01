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

public class Nine_Annotations {

	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}
	@AfterTest
	public void AT() {
		System.out.println("AT");
	}
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	@AfterMethod
	public void AM() {
		System.out.println("AM");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("BM");
	}
	@BeforeClass
	public void BC() {
		System.out.println("BC");
	}
	@BeforeTest
	public void BT() {
		System.out.println("BT");
	}
	@BeforeSuite
	public void BS() {
		System.out.println("BS");
	}
	@Test
	public void testmain() {
		System.out.println("Test");
	}
}