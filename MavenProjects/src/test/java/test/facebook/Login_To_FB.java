package test.facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.facebook.FB_LOGIN_Page;

public class Login_To_FB {
@Test
public void loginToFacebook() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	FB_LOGIN_Page f1=new FB_LOGIN_Page(driver);
	f1.un();
	f1.pwd();
	f1.login();
	}
}
