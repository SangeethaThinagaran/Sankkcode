package test.Project1.Amazon.Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Amaz_LaunchQuit_P1 {
WebDriver driver;
@BeforeMethod
/*
 * @Parameters("project1_browser") public void Amaz_Launch(String browsername) {
 */	

public void Amaz_Launch() {
	//driver=new ChromeDriver();
	driver=new EdgeDriver();
	/*
	 * if(browsername.equals("chrome")) { driver=new ChromeDriver(); }
	 * if(browsername.equals("edge")) { driver=new EdgeDriver(); }
	 */
	
	  driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	 
}

//@AfterMethod
//public void Amaz_quit() {
//	driver.quit();
//}

}