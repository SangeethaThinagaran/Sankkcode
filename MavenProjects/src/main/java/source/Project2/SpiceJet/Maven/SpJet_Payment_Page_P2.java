package source.Project2.SpiceJet.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SpJet_Payment_Page_P2{
	
	 //@FindBy(xpath="(//div[.='Apply Promo'])[2]") 
	  //@FindBy(xpath="(//div[@class='css-76zvg2 r-poiln3 r-ubezar r-1kfrs79 r-15d164r r-1g94qm0'])[2]")
	 // @FindBy(xpath="//*[@id=\"prepayment-container\"]/div[2]/div/div[1]/div/div/div[3]/div[2]/div/div[2]/div")
		//@FindBy(xpath="(//div[contains(text(),'Apply Promo')])[1]")
		@FindBy(xpath="//div[@class='css-1dbjc4n r-1dzdj1l r-1sp51qo']/div/div/div")
	    WebElement applyPromo;

	  @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[14]") 
	  WebElement addOn_PromoCode;
	  
	  @FindBy(xpath="(//div[.='APPLY'])[4]") 
	  WebElement apply_ApplyPromo;
	  
	  @FindBy(xpath="(//div[@data-testid='apply-edit-button-to-open-popup'])") 
	  WebElement edit_Promo;
	  
	  @FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-adyw6z r-1kfrs79'])[3]")
	  WebElement price_Before_Promo;
	  
	  @FindBy(xpath="//iframe[@class='card_number_iframe']")
	 // @FindBy(xpath="//*[@id=\"payment_form\"]/div[2]/div[1]/iframe")
	  //@FindBy(xpath="//iframe[@name='card_number_iframe_Hdy7qYfNTbhcoPJD']")
	 //@FindBy(id="destination_publishing_iframe_spicejet_0")
	 //@FindBy(name="card_number_iframe_CWWdAXYbhwzWALyP")
	 // @FindBy(className="card_number_iframe")
	  WebElement cardNumber_iFrame;
	
	  @FindBy(id="card_number")
	  WebElement cardnumber;
	  
	  @FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	  WebElement cardHolderName_iFrame;
	
	  @FindBy(id="name_on_card")
	  WebElement cardHolderName;

	  @FindBy(name="card_exp_month_iframe_xGm3ExrCG5wNRRhM")
	  WebElement cardExpMonth_iFrame;
	
	  @FindBy(id="card_exp_month")
	  WebElement cardExpMonth;
	  
	  @FindBy(name="card_exp_year_iframe_xGm3ExrCG5wNRRhM")
	  WebElement cardExpYear_iFrame;
	
	  @FindBy(id="card_exp_year")
	  WebElement cardExpYear;
	  
	  @FindBy(name="security_code_iframe_7OLDuWVKe2Ka7DrA")
	  WebElement cardCVV_iFrame;
	
	  @FindBy(id="security_code")
	  WebElement cardCVV;

	  @FindBy(id="at_addon_close_icon") 
	  WebElement addOn_CloseButton;
 	  
	public void applyPromo() {
		System.out.println("APPLY PROMO==="+ applyPromo.isDisplayed());
		applyPromo.click();
	}
	public void addOn_PromoCode() {
		addOn_PromoCode.click();
	}
	public void apply_ApplyPromo() {
		apply_ApplyPromo.click();
	}
	public void Assertion_Tc11_P2() {
		Assert.assertTrue(edit_Promo.isDisplayed());
	}
	
	public void card_Frame(WebDriver driver) {
		if (addOn_CloseButton.isDisplayed()) {
		 	addOn_CloseButton();
		}
		driver.switchTo().frame(cardNumber_iFrame);
		System.out.println("****INTO IFRAME");
		cardnumber.sendKeys("5000400030002000100");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(cardHolderName_iFrame);
		cardHolderName.sendKeys("Sangeetha");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(cardExpMonth_iFrame);
		cardExpMonth.sendKeys("05");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(cardExpYear_iFrame);
		cardExpYear.sendKeys("2028");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(cardCVV_iFrame);
		cardCVV.sendKeys("454");
		driver.switchTo().defaultContent();

	}
	public void addOn_CloseButton() {
		addOn_CloseButton.click();
	}

	
	public SpJet_Payment_Page_P2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
