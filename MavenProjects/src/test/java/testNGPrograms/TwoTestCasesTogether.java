package testNGPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTestCasesTogether {
	WebDriver driver;//upcasting ChromeDriver to WebDriver
	
@ BeforeMethod
public void loginGoogle() {
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@ Test
public void testCase1() {
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("Sachin");
	search.sendKeys(Keys.ENTER);
}

@ Test
public void testCase2() {
	WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
}
@ AfterMethod
public void logoutGoogle() throws InterruptedException, IOException {
	TakesScreenshot t1=(TakesScreenshot) driver;//upcasting driver to TakeSCreenShot(I)
	File source=t1.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\grkri\\OneDrive\\Documents\\San\\ss\\"+new TwoTestCasesTogether().getClass()+Math.random()+".png");
	FileHandler.copy(source, destination);
	Thread.sleep(10000);
	driver.quit();
}

}
