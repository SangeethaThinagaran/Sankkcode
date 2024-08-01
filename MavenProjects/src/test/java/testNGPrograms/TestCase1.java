package testNGPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	@ AfterMethod
	public void logoutAmazon() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	WebDriver driver;
	
	
	@Test
	public void FaceBook_Registration() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement categ_dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(categ_dd);
		s1.selectByValue("search-alias=stripbooks");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Worldwar");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Reporter.log("Searched Sucessfully");

	}
	
}
