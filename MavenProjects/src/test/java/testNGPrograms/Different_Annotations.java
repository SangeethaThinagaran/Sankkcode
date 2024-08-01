package testNGPrograms;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Different_Annotations {
@Test
public void Test() {
	System.out.println("Test");
}
 @AfterSuite
 public void AS() {
	 System.out.println("After Suite");
 }
 @AfterTest
 public void AT()
 {
	 System.out.println("After Test");
 }
 @AfterClass
 public void AC() {
	 System.out.println("After Class");
 }
 @AfterMethod
 public void AM() {
	 System.out.println("After Method");
 }
 @BeforeMethod
 public void BM() {
	 System.out.println("Before Method");
 }
 @BeforeClass
 public void BC() {
	 System.out.println("Before Class");
 }
 @BeforeTest
 public void BT() {
	 System.out.println("Before Test");
 }
 @BeforeSuite
 public void BS(){
	 System.out.println("Before Suite");
 }
}
