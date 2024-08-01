package test.Project2.SpiceJet.Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpiceJet_LaunchQuit_P2 {
WebDriver driver;
@BeforeMethod
public void SpJet_LaunchQuit_P2() {
	
	driver=new EdgeDriver();
	//driver=new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
}

}
