package chooseBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChooseBrowser_launch {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void common(String bname) {
		if(bname.equals("chrome")) {
		 driver=new ChromeDriver();
		}
		if(bname.equals("edge")) {
			 driver=new EdgeDriver();
			}
}
}
