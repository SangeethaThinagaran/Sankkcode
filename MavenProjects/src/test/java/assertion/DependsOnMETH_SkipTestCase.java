package assertion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//To skip any TCs

public class DependsOnMETH_SkipTestCase {
@ Test
public void login() {
	//Assert.assertEquals(false, true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Sign in")).click();
	//Thread.sleep(3000);
	driver.findElement(By.id("ap_email")).sendKeys("sangeethathinagaran@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("9940864047");
	driver.findElement(By.id("signInSubmit")).click();
	String pagetitle=driver.getTitle();
	String expectedpagetitle="nline Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	boolean b1=pagetitle.equals(expectedpagetitle);
	System.out.println(b1);
	//Assert.assertEquals(b1, true, "Login is successful!");
	Assert.assertEquals(pagetitle,expectedpagetitle,"Its not working");

}

@ Test(dependsOnMethods="login")
public void logout() {
	System.out.println("logout");
	
}
}
