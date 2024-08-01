package testNGPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Flipkart_Exam {
	WebDriver driver;
	
	@ BeforeMethod
	public void flipkart_search() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	@ Test
	public void testCase1() throws InterruptedException, IOException {
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("mouse");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='oleBil'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='wjcEIp']")).click();
		String parID=		driver.getWindowHandle();
		Set<String> parchID=	driver.getWindowHandles();
		Iterator<String> i1=	parchID.iterator();
		String parentid=		i1.next();
		driver.close();
		String childid=		i1.next();
		driver.switchTo().window(childid);
		TakesScreenshot t1=	(TakesScreenshot) driver;
		 File source= t1.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\grkri\\OneDrive\\Documents\\San\\ss\\"+ new Flipkart_Exam().getClass() + Math.random() +"05282024.png");
		FileHandler.copy(source, destination);
		
			
	}

}
