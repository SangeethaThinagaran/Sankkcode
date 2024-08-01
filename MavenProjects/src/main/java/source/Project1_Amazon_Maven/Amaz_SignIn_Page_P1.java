package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amaz_SignIn_Page_P1 {

	@FindBy(id="ap_email")
	WebElement mailId_UN_tf;

	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement pwd_signIn_tf;

	//login- submit code button- (//input[@class='a-button-input'])[2]

	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signIn_login_button;

	public void mailId() {
		 mailId_UN_tf.sendKeys("sangeethathinagaran@gmail.com");
	 }
	public void continuebutton() {
		continue_button.click();	
	}	
	 public void pwd_signIn() {
		 pwd_signIn_tf.sendKeys("9940864047");
	 }
	 
	 public void pwd_Wrong_signIn() {
		 pwd_signIn_tf.sendKeys("994086404");
		 
	 }
	
	 
	 public void signIn_login() {
		 signIn_login_button.click();
		  }
	 public void wrongLogin_Assert(WebDriver driver) {
		 Assert.assertNotEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "login page failed");
	 }

	public Amaz_SignIn_Page_P1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
}
