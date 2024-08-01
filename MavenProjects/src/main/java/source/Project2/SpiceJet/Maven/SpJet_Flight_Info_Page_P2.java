package source.Project2.SpiceJet.Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SpJet_Flight_Info_Page_P2 {
	String s;
	String pa;
	boolean b1, b2, b3, b4;
	@FindBy(xpath="(//div[.='Flight Details'])[3]")
	//@FindBy(xpath="(//div[@class='css-1dbjc4n r-1d09ksm r-18u37iz'])[2]")
	WebElement flight_details_link;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[12]")
	WebElement spiceSaver_RB;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[13]")
	WebElement spiceFlex_RB;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[14]")
	WebElement spiceMax_RB;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79'])[12]")
	WebElement spiceMax_RB_Amt;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	//@FindBy(xpath="(//div[.='Continue'])[2]")
	WebElement continue_button;
		
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-adyw6z r-1kfrs79'])[3]")
	WebElement payable_amount;

	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-ubezar r-1kfrs79 r-zl2h9q']")
	WebElement flight_info_depart_link;

	@FindBy(xpath="(//div[.='Baggage'])[4]")
	WebElement baggage;

	@FindBy(xpath="(//div[.='Cancellation'])[4]")
	WebElement cancellation;

	@FindBy(xpath="(//div[.='View Baggage Allowance'])")
	WebElement baggage_view_baggage;

	@FindBy(xpath="(//div[.='Cancellation Charges'])")
	WebElement cancellation_cancellation_charges;

	
	public void flight_details_link(WebDriver driver) {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(flight_details_link)).click();;
		//flight_details_link.click();
	}
	public void spiceSaver_RB(WebDriver driver) {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(spiceSaver_RB)).click();;

		//spiceSaver_RB.click();
	}
	public void spiceSaver_RB_default() {
		System.out.println(spiceSaver_RB.isSelected());
	}
	public void spiceFlex_RB() {
		spiceFlex_RB.click();
	}
	public void spiceMax_RB() {
		spiceMax_RB.click();
		s=spiceMax_RB_Amt.getText();
		System.out.println(s);
		
	}
	public void continue_button() throws InterruptedException {
		continue_button.click();
	}
	public void Assertion_Tc6_P2() {
		pa=payable_amount.getText();
		System.out.println(pa);
		String s1=s.substring(2);
		System.out.println(s1);
		boolean b=pa.contains(s1);
		System.out.println(b);
		Assert.assertTrue(b);
		}
	public void baggage() {
		baggage.click();
	}
	public void cancellation() {
		cancellation.click();
	}
	public void flight_info_depart_link() {
		 b1=flight_info_depart_link.isDisplayed();
		System.out.println(flight_info_depart_link.isDisplayed());
	}
	public void baggage_view_baggage() {
		System.out.println(baggage_view_baggage.isDisplayed());
		 b2=baggage_view_baggage.isDisplayed();
	}
	public void cancellation_cancellation_charges() {
		System.out.println(cancellation_cancellation_charges.isDisplayed());
		 b3=cancellation_cancellation_charges.isDisplayed();
	}
	
	public void Assertion_TC10_p2(){
		if (b1&&b2&&b3==true) {
			b4=true;
		}
		Assert.assertTrue(b4);
	}

	public SpJet_Flight_Info_Page_P2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

}
