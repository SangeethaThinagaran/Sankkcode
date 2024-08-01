package source.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_Login_Page {
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement signIn_link;
	
	//@FindBy(xpath="//span[@class='nav-action-inner']")
	//WebElement signIn_button1;
		
	@FindBy(id="ap_email")
	WebElement un_tf;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void signinlink() {
		System.out.println(driver);
		
		//Actions a1=new Actions(driver);
		//a1.moveToElement(signIn_link).perform();
		signIn_link.click();
		//signIn_button1.click();
		//Assert.assertEquals(un_tf.isDisplayed(), true,"Sign In Page is successfully opened");
	}
	
	public void un() {
		un_tf.sendKeys("sangeethathinagaran@gmail.com");
	}
	public void cnt() {
		continue_button.click();
	}
	public void pwd() {
		pwd_tf.sendKeys("9940864047");
	}
	public void signin() {
		signin_button.click();
		//Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		
	}


public Amazon_Login_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
}

