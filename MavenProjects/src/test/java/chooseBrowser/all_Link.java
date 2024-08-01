package chooseBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class all_Link extends ChooseBrowser_launch{
	//WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void all_Links1(String bname) {
		/*if(bname.equals("chrome")) {
		 driver=new ChromeDriver();
		}
		if(bname.equals("edge")) {
			 driver=new EdgeDriver();
			}
			*/
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++) {
			WebElement a1=allLinks.get(i);
			//String url=a1.getAttribute("href");
			String text=a1.getText();
			System.out.println(text);
			//System.out.println(url);
		driver.quit();
	}
}

}
