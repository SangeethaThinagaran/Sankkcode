package chooseBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserProgram extends ChooseBrowser_launch {
	//WebDriver driver;
	 
	@Test
	@Parameters("browser")
	public void launch_browser(String bname) throws InterruptedException {
		/*
		 if(bname.equals("chrome")) {
			 driver=new ChromeDriver();
			}
			if(bname.equals("edge")) {
				 driver=new EdgeDriver();
				}
*/
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.quit();
	}
	
}
