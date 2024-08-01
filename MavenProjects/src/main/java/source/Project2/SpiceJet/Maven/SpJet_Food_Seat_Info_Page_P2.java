package source.Project2.SpiceJet.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SpJet_Food_Seat_Info_Page_P2 {
	 @FindBy(xpath="(//div[.='Seat with extra legroom'])[3]") 
	  WebElement extra_legroom;
	 
	 @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1hv0noj r-z2wwpe r-1loqt21 r-18u37iz r-1ugchlj r-1wtj0ep r-1joea0r r-nsbfu8 r-1qfoi16 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-b8lwoo'])[1]")
	 WebElement Add_extra_luggage;
	 
	  @FindBy(xpath="((//div[.='Meal with beverage ']))[3]") 
	  WebElement meal_beverage;
	
	  @FindBy(xpath="(//div[.='Priority check-in, boarding and baggage delivery'])[3]") 
	  WebElement priority_CheckIn;
		
	  @FindBy(xpath="//*[@id=\"at_addon_close_icon\"]/img") 
	  WebElement close_button;
	  
		 
	  @FindBy(xpath="(//div[.='3A'])[6]") 
	  WebElement seat_Select;
		 
	  @FindBy(xpath="(//div[.='1C'])[10]")
	  WebElement Extracomfort;
	  
	  @FindBy(xpath="(//div[.='Skip'])[3]") 
	  WebElement skip;
	  
	  @FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-adyw6z r-1kfrs79'])[4]")
	 // @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar r-1kfrs79'])[8]") 
	  WebElement seat_Amt_Additional;
	  
	  @FindBy(xpath="(//div[.='Select Meals'])[3]") 
	  WebElement select_Meals_button;
		 
	  @FindBy(xpath="(//img[@class='css-9pa8cd'])[36]") 
	  WebElement food_CB;

	  @FindBy(xpath="(//div[@class='css-76zvg2 r-1862ga2 r-poiln3 r-n6v787'])[1]") 
	  WebElement no_Of_passengers;

	  @FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79 r-1d4mawv'])[3]") 
	  WebElement Add_Seat;

	  @FindBy(xpath="(//div[.='1C'])[6]") 
	  WebElement select_seat;
	  
	  @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[231]") 
	  WebElement seat_RB;

	  @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[235]") 
	  WebElement accept_button;

	  @FindBy(xpath="(//div[.='Continue'])[9]") 
	  WebElement continue_popup;

	  @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']") 
	  WebElement sel_meals_button;

	  @FindBy(xpath="/html/body/div[7]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/img")
	  //@FindBy(xpath="(//img[@class='css-9pa8cd'])[35]")
	  WebElement food1;
	  
	  @FindBy(xpath="//div[.='Done']") 
	  WebElement done_button;
 
	  @FindBy(xpath="(//div[@class='css-76zvg2 r-1862ga2 r-poiln3 r-n6v787'])[9]  ") 
	  WebElement extra_seat_text;

//********new fields or TC 11***************
	  @FindBy(id="at_addon_close_icon") 
	  WebElement addOn_CloseButton;

	  @FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-1gkfh8e r-1kfrs79 r-1d4mawv'])[2]") 
	  WebElement addSeatNew;

	  @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[240]") 
	  WebElement adjSeat;

	  @FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[244]") 
	  WebElement adjSeat_AcceptButton;

	  @FindBy(xpath="(//div[@class='css-1dbjc4n r-1mlwlqe r-z80fyv r-zso239 r-1udh08x r-19wmn03 r-1lgpqti'])[1]") 
	  WebElement foodNew;

	  //@FindBy(xpath="(//div[.='Continue'])[6]") 
	  @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	  
	  WebElement continueButton_New;

	 	  
	  
	  public void extra_legroom() {
		if(close_button.isDisplayed()) {
		close_button.click();
		}
		System.out.println(extra_legroom.isDisplayed());
	}
	public void Add_extra_luggage() {
		Add_extra_luggage.click();
	}
	public void Extracomfort() {
		Extracomfort.click();
	}
	public void meal_beverage() {
		System.out.println(meal_beverage.isDisplayed());
	}
	public void priority_CheckIn() {
		System.out.println(priority_CheckIn.isDisplayed());
	}	
	public void seat_Select() {
		seat_Select.click();
	}
	public void skip() {
		skip.click();
	}
	public void seat_Amt_Additional() {
		System.out.println(seat_Amt_Additional.getText());
	}
	public void select_Meals() {
		select_Meals_button.click();
	}
	public void food_CB() {
		food_CB.click();
	}
	public void food1() {
		food1.click();
	}
	public void Assertion_TC9_P2() {
		String s="Flight related information will be sent to the submitted email address/contact number.";
		Assert.assertEquals(no_Of_passengers.getText(),s);
	}
	public void Add_Seat() {
		Add_Seat.click();
	}
	public void select_seat() {
		select_seat.click();
	}
	public void accept_button() {
		accept_button.click();
	}
	public void continue_popup() {
		continue_popup.click();
	}
	public void seat_RB() {
		seat_RB.click();
	}
	public void sel_meals_button() {
		sel_meals_button.click();
	}
	public void done_button() {
		done_button.click();
	}
	public void extra_seat_text() {
		System.out.println(extra_seat_text.getText());
		String s=extra_seat_text.getText();
		boolean b=s.contains("Extra Seat Fees");
		System.out.println(b);
		Assert.assertTrue(b);
		}
	//***TC 11**********
	public void addOn_CloseButton() {
		addOn_CloseButton.click();
	}
	
	public void addSeatNew() {
		if (addOn_CloseButton.isDisplayed()) {
			addOn_CloseButton();
		}
		addSeatNew.click();
	}
	public void adjSeat() {
		adjSeat.click();
	}
	public void adjSeat_AcceptButton() {
		adjSeat_AcceptButton.click();
	}
	public void foodNew() {
		foodNew.click();
	}
	public void continueButton_New() {
		continueButton_New.click();
	}
	
	
	public SpJet_Food_Seat_Info_Page_P2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
}
