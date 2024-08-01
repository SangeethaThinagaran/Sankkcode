package source.Project2.AirIndia.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AirIndia_Registration_Page_P2 {
//@FindBy(id="signIn")
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	WebElement SignIn_link;

	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	WebElement MyAccount;

@FindBy(id="onetrust-accept-btn-handler")
WebElement cookies_button;

@FindBy(id="SignUpBtn")
//@FindBy(id="createAccountButton")
WebElement signUp_button;

@FindBy(id="title")
WebElement title_dd;

@FindBy(id="givenName")
WebElement fname_tf;

@FindBy(id="surname")
WebElement lname_tf;

@FindBy(id="extension_birthdate")
WebElement DOB;

@FindBy(xpath="//button[@class='button prev-button prev-btn']")
WebElement DOB_Year_Previous_button;

@FindBy(xpath="//span[.='1987']")
WebElement DOB_Year;

@FindBy(xpath="//span[.='Jan']")
WebElement DOB_Month;

@FindBy(xpath="//span[.='27']")
WebElement DOB_Date;

@FindBy(id="continueBtn")
WebElement continue_button;

@FindBy(id="email")
WebElement mailID_tf;

@FindBy(id="confirmEmail")
WebElement confirm_mailID_tf;

@FindBy(id="send_email_otp")
WebElement sendVerCode_mailID;

//@FindBy(xpath="//div[@class='iti__selected-dial-code']")
@FindBy(xpath="//ul[@class='iti__country-list iti__country-list--dropup']/li[231]")
WebElement countrycode_dd;

@FindBy(id="extension_userPhoneNumber")
WebElement mobnum_tf;

@FindBy(xpath="//span[.='United States']")
WebElement country_code_select;

@FindBy(xpath="//div[@class='recaptcha-checkbox-borderAnimation']")
WebElement recaptcha;

@FindBy(id="send_mobile_otp")
WebElement sendmobOTP_button;

@FindBy(id="continueBtnSecondary")
WebElement continueBtnSecondary_button;

public void MyAccount(WebDriver driver) {
	Actions a1=new Actions(driver);
	a1.moveToElement(MyAccount).perform();	
}

public void SignIn() {
	SignIn_link.click();
}
public void cookies() {
	cookies_button.click();
}
public void signUp() {
	signUp_button.click();
}
public void title() {
	Select s1=new Select(title_dd);
	s1.selectByValue("MRS");
}
public void fname() {
	fname_tf.sendKeys("Sanprofessional");
}
public void lname() {
	lname_tf.sendKeys("Thina");
}
public void DOB() {
	DOB.click();
}
public void DOB_Year_Previous() {
	for(int i=0;i<4;i++) {
	DOB_Year_Previous_button.click();
	}
}
public void DOB_Year() {
	DOB_Year.click();
}
public void DOB_Month() {
	DOB_Month.click();
}
public void DOB_Date() {
	DOB_Date.click();
}
public void continue_button() {
	continue_button.click();
}
public void mailID() {
	mailID_tf.sendKeys("sangeethathinagaran@gmail.com");	
}
public void confirm_mailID(){
	confirm_mailID_tf.sendKeys("sangeethathinagaran@gmail.com");
}
public void sendVerCode_mailID() {
	sendVerCode_mailID.click();
}
public void countrycode() throws InterruptedException {
	Thread.sleep(15000);
	countrycode_dd.click();
	
}
public void country_code_select() {
	country_code_select.click();
}
public void mobnum() {
mobnum_tf.sendKeys("7325896485");
}
public void sendmobOTP() {
	sendmobOTP_button.click();
}
public void recaptcha() {
	recaptcha.click();
}
public void continueBtnSecondary() {
	continueBtnSecondary_button.click();
}

public AirIndia_Registration_Page_P2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
