package source.Project2.AirIndia.Maven;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AirIndia_Search_Page_P2 {
	@FindBy(xpath="//input[@id='From']")
	WebElement From;
	
	
	@FindBy(xpath="//span[.='Round Trip']") 
	WebElement oneWay_dd;
	 	
	@FindBy(xpath="//span[.='One Way']")
	WebElement oneWay_select;
	
	@FindBy(xpath="//input[@id='To']")
	WebElement OneWay_Destination;
	
	@FindBy(xpath="(//span[.='Round Trip'])[2]")
	WebElement MM_DD;
	
	@FindBy(xpath="//span[.='Multi City']")
	WebElement MultiCity;
	
	@FindBy(xpath="(//input[@id='From'])[1]")
	WebElement From_Flight1;
	
	@FindBy(xpath="(//input[@id='To'])[1]")
	WebElement To_Flight1;
	
	@FindBy(id="datepickerlone")
	WebElement DepartDate_Flight1;
	
	@FindBy(xpath="(//input[@id='From'])[2]")
	WebElement From_Flight2;
	
	@FindBy(xpath="(//input[@id='To'])[2]")
	WebElement To_Flight2;
	
	@FindBy(xpath="(//input[@id='To'])[3]")
	WebElement To_Flight3;

	//@FindBy(xpath="//button[@class='col-lg-4 col-12 booking-flight-btn']")
	@FindBy(xpath="//button[.=' Search Flights ']")
	WebElement SearchFlight;
	
	@FindBy(xpath="(//div[@class='btn-light ng-star-inserted'])[5]")
	WebElement Select_DepartDate_Flight1;
	
	@FindBy(xpath="")
	WebElement DepartDate_Flight3;
	@FindBy(xpath="//button[@class='showFlightBtn primarybtn1']")
	WebElement showFlight_button;
	
	@FindBy(xpath="//div[@id='checkbox']")
	WebElement human_CheckBox;
	
	@FindBy(xpath="//input[@class='btn bi bi-calendar3 ng-star-inserted']") 
	WebElement departDate_select;
	
	@FindBy(xpath="//input[@class='btn bi bi-calendar3']") 
	WebElement returnDate_select;
	 	
	@FindBy(xpath="//select[@title='Select month']") 
	WebElement return_month;
	 	
	
	//@FindBy(xpath="(//span[@class='custom-day ng-star-inserted'])[36]")
	@FindBy(xpath="(//div[@aria-label='Friday, May 31, 2024'])[1]")
	WebElement returnDate_Date;
	 
	
	@FindBy(xpath="//body[@id='homePageNew']") 
	WebElement returnDate_Confirm;
	 
	
	public void From() throws InterruptedException { 
		From.sendKeys("JFK");
		Thread.sleep(3000);
		From.sendKeys(Keys.ENTER); 
		}
	public void returnDate() { 
		returnDate_select.click(); 
		}
	public void departDate() { 
		departDate_select.click(); 
		}
	 
	public void oneWay_dd() {
		oneWay_dd.click();
	}
	public void oneWay_select() {
		oneWay_select.click();
	}

	public void MM_DD() throws InterruptedException {
		MM_DD.click();
//		Thread.sleep(3000);
//		MM_DD.sendKeys(Keys.ARROW_DOWN);
//		MM_DD.sendKeys(Keys.ENTER);
	}

	public void MultiCity() {
		MultiCity.click();
	}
	public void From_Flight1() throws InterruptedException {
		From_Flight1.sendKeys("BOM");
		Thread.sleep(3000);
		From_Flight1.sendKeys(Keys.ENTER);
	}
	
	public void To_Flight1() {
		To_Flight1.sendKeys("DEL");
		To_Flight1.sendKeys(Keys.ENTER);
	}
	public void DepartDate_Flight1() {
		DepartDate_Flight1.click();
	}
	public void To_Flight2() {
		To_Flight2.sendKeys("MAA");
		To_Flight2.sendKeys(Keys.ENTER);
	}
	public void SearchFlight(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.click(SearchFlight).build().perform();
		//SearchFlight.click();
	}
	public void Select_DepartDate_Flight1() {
		Select_DepartDate_Flight1.click();
		}
	public void To_Flight3() {
		To_Flight3.sendKeys("HYD");
		To_Flight3.sendKeys(Keys.ENTER);
	}
//	public void MultiCity() {
//		MultiCity.click();
//	}

	
	
	 public void return_month() { 
		  Select s1=new Select(return_month);
		  s1.selectByValue("6");
		   }

	 public void returnDate_Date() { 
		 System.out.println(returnDate_Date.getText());
		 //returnDate_Date.click(); 
		 }
	 	 
	 public void returnDate_Confirm() { 
		 returnDate_Confirm.click(); }
	 
public void Destination() throws InterruptedException {
	OneWay_Destination.sendKeys("MAA");
	Thread.sleep(3000);
	OneWay_Destination.sendKeys(Keys.ENTER);
	System.out.println("MAA select");
}
public void showFlight(WebDriver driver) {
	showFlight_button.click();
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Book Air India Domestic & International Flights Online in 2024, Fly Non-Stop");
	
}
 
public AirIndia_Search_Page_P2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}	
}
