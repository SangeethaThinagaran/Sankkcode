package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amaz_BuyNow_Page_P1 {
	@FindBy(xpath="//input[@name='submit.buy-now']")
	 WebElement buy_Now_button;
	
	@FindBy(id="addressChangeLinkId")
	WebElement change_Address_link;
	   
	@FindBy(xpath="(//input[@name='submissionURL'])[3]")
	WebElement address3_radio;
	 
	@FindBy(xpath="(//input[@class='a-button-input'])[7]")
	WebElement usethisaddress_button;
	
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement usethisaddress_buttontc12;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netbanking_option;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[7]")
	WebElement deliverToAddress;
	
	 public void buy_Now() {
		 buy_Now_button.click();
		 }
	 public void change_Address () {
		 change_Address_link.click();
		 }
	public void address3_radio() {
		address3_radio.click();
	}
	 public void usethisaddress() {
		 usethisaddress_button.click();
	 }
	 public void usethisaddress_buttontc12(){
		 usethisaddress_buttontc12.click();
	 }
	 public void netbanking() {
		 netbanking_option.click();
	 }
	 public void deliverToAddress() {
		 deliverToAddress.click();
	 }
	 public void tc11_Assertion(WebDriver driver) {
		 Assert.assertTrue(netbanking_option.isSelected());
	 }
	 
	 public Amaz_BuyNow_Page_P1(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		
	}

}
