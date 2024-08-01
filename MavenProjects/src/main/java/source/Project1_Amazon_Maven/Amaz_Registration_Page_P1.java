package source.Project1_Amazon_Maven;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amaz_Registration_Page_P1 {

WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement cust_name_tf;
	
	@FindBy(id="ap_phone_number")
	WebElement mob_num;
	
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	
	@FindBy(id="continue")
	WebElement verify_button;
	
	@FindBy(id="aa_arkose_customer_support_link")
	WebElement needhelp_link;
	
	public void cust_name() {
		cust_name_tf.sendKeys("Sanprofessional");
	}	
	public void mob_num() {
		mob_num.sendKeys("9789210023");
	}	
	public void pwd() {
		pwd_tf.sendKeys("Password@123");
	}
		
	public void verify(WebDriver driver) {
		verify_button.click();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Authentication required");
	}
	
	public Amaz_Registration_Page_P1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
}
