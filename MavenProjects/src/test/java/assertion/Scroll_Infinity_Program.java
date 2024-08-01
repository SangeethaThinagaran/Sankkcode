package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll_Infinity_Program {

	@Test 
	public void infinityScroll() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER); 
		
		JavascriptExecutor js1=driver;
		for(int i=0;i<1;i--) {
			js1.executeScript("window.scrollBy(0,200)");
		}
	}
}
