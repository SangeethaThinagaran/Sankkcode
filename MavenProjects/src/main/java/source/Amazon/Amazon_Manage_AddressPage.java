package source.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Manage_AddressPage {
	@FindBy(xpath="(//input[@name='submissionURL'])[7]")
	WebElement selectAddress_button;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[6]")
	WebElement useThisAddress_button;
	
	public void manageAddress() {
		selectAddress_button.click();
	}
	public void useThisAddress() {
		useThisAddress_button.click();	
	}
	public Amazon_Manage_AddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
