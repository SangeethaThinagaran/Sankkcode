package source.Project2.SpiceJet.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SpJet_LoginLogout_Page_P2 {
	//@FindBy(linkText="Login")
	//@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	//@FindBy(xpath="//span[@class='d-none d-lg-block']")
	@FindBy(xpath="(//div[.='Login'])[3]")
	//@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[1]/div/div")
	WebElement login_link;

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	//@FindBy(xpath="//input[@class=' form-control']")
	WebElement login_mobNum;

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	//@FindBy(xpath="#password")
	WebElement login_pwd;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73'])")
	//@FindBy(xpath="//div[@class='btn btn-red plr-50']")
	WebElement login_button;

	
	  @FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']") 
	  WebElement logout_dd;
	 
	  @FindBy(xpath="(//div[.='Log Out'])[2]") 
	  WebElement logout_button;
	
	
	public void login_link() {
		login_link.click();
		//System.out.println(login_link.getText());
	}
	public void login_mobNum() {
		login_mobNum.sendKeys("9788747516");
	}
	public void login_pwd() {
		login_pwd.sendKeys("Password@123");
	}
	public void login_Wrong_Pwd() {
		login_pwd.sendKeys("Password@1");
	}
	public void login_button() throws InterruptedException {
		login_button.click();
	}
	public void TC2_SJ_Assertion(WebDriver driver) {
		Assert.assertEquals(driver.getTitle(), "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
	}
	public void TC3_SJ_Assertion() {
		Assert.assertTrue(login_button.isEnabled());
	}
	
	  public void logout_dd() { 
		  logout_dd.click();
		  } 
	  public void logout_button() { 
		  logout_button.click();
		  }
	 public void Assertion_TC12_P2(WebDriver driver){
		 String s="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		 Assert.assertEquals(driver.getTitle(), s);
	 }
	
	
	
	public SpJet_LoginLogout_Page_P2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

}
