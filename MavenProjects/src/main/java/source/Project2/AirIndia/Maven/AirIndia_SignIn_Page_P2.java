package source.Project2.AirIndia.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AirIndia_SignIn_Page_P2 {

	@FindBy(id="signInName")
	WebElement signInName_tf;
	
	@FindBy(id="password")
	WebElement SignIn_pwd_tf;

	@FindBy(id="next")
	WebElement signIn_button;

	@FindBy(xpath="//p[.='The username or password you have entered is incorrect. Please check your details and try again.']")
	WebElement err_message;
	
public void signInName() {
	signInName_tf.sendKeys("sankrish2901@gmail.com");
}
public void SignIn_pwd() {
	SignIn_pwd_tf.sendKeys("Password@123");
}
public void SignIn_WrongPwd() {
	SignIn_pwd_tf.sendKeys("Password");
}
public void signIn(WebDriver driver) throws InterruptedException {
	signIn_button.click();
	//Thread.sleep(3000);
	System.out.println(driver.getTitle());
	 //Assert.assertEquals(driver.getTitle(), "Sign up or sign in");
}

public void wrong_pwd_Assertion() {
	Assert.assertTrue(err_message.isDisplayed());
}

public AirIndia_SignIn_Page_P2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
