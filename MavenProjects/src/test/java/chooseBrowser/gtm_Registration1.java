package chooseBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gtm_Registration1 extends ChooseBrowser_launch{
	//WebDriver driver;
	@Test
	@Parameters("browser")
	public void gtm_Registration11(String bname) {
		/*if(bname.equals("chrome")) {
			 driver=new ChromeDriver();
			}
			if(bname.equals("edge")) {
				 driver=new EdgeDriver();
				}
*/
	driver.get("https://grotechminds.com/registeration-form/");
	WebElement fn=driver.findElement(By.id("firstName"));
	fn.sendKeys("San");
	fn.sendKeys(Keys.CONTROL+"a");
	fn.sendKeys(Keys.CONTROL+"c");
	//Thread.sleep(5000);
	WebElement ln=driver.findElement(By.id("lastName"));
	ln.sendKeys(Keys.CONTROL+"v");
	driver.quit();
	}
}
