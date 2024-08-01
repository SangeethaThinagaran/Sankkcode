package chooseBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gtm_DragandDrop1 extends ChooseBrowser_launch {
	//WebDriver driver;
	@Test
	@Parameters("browser")
	public void gtm_DragandDrop11(String bname) {
		/*if(bname.equals("chrome")) {
			 driver=new ChromeDriver();
			}
			if(bname.equals("edge")) {
				 driver=new EdgeDriver();
				}
*/
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Actions a1=new Actions(driver);
		//Postman
		//WebElement dragelement=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		//JSON
		//WebElement dragelement=driver.findElement(By.xpath("(//div[@id='div1'])[11]"));
		//GitHub
		WebElement dragelement=driver.findElement(By.xpath("(//div[@id='div1'])[5]")); 
		WebElement dropelement= driver.findElement(By.xpath("(//div[@id='div2'])"));
		a1.dragAndDrop(dragelement, dropelement).perform();
		driver.quit();
	}
	}


