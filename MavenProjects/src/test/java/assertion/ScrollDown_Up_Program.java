package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown_Up_Program {
@Test
public void scrollUpDown() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("Shoes");
	search.sendKeys(Keys.ENTER); 
	WebElement w1=driver.findElement(By.linkText("COVID-19 and Amazon"));
	Point p1=w1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	
	JavascriptExecutor js1=driver; 
	//scroll down
	js1.executeScript("window.scrollBy(0,"+y+")");
	//js1.executeScript("window.scrollBy(1000,1000)");
	//scroll up
	//js1.executeScript("window.scrollBy(0,-2000)");
		
}
}
