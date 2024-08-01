package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(priority=2)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=1,timeOut=0)
	public void logout() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement categ_dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(categ_dd);
		s1.selectByValue("search-alias=stripbooks");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Worldwar");
		driver.findElement(By.id("nav-search-submit-button")).click();


		System.out.println("logout");
	}
	@Test(priority=-1, invocationCount=5)
	public void first() {
		System.out.println("priority=-1");
	}
}
