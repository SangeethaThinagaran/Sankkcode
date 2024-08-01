package test.Amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit_withoutPOM {
	WebDriver driver;
	@BeforeMethod
		public void launchprogram() {
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@AfterMethod
	public void logoutapp() throws IOException {
		TakesScreenshot t1=(TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:/Users/grkri/eclipse-workspace/MavenProjects/ScreenShot/"+new Object().getClass() +Math.random()+".png" );
		FileHandler.copy(source,destination);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.quit();
	}

}
