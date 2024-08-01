package test.Project2.AirIndia.Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class AirIndia_LaunchQuit_P2 {
	WebDriver driver;
	@BeforeMethod
	public void AirIndia_LaunchQuit_P2() {
		driver=new EdgeDriver();
		//driver=new ChromeDriver();
		driver.get("https://www.AirIndia.com/");
		//driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

}
