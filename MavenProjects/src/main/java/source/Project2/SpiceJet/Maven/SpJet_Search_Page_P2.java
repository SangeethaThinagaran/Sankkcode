package source.Project2.SpiceJet.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SpJet_Search_Page_P2 {
	
	//@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-1i10wst r-1kfrs79']")
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	//@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement search_flight_button;

		@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
		WebElement search_flight_button_TC9;
		
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]") 
	  WebElement from;
	  
	  @FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	  WebElement to;
	  
	  	  
	  @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[2]")
	  WebElement depart_month;

	  @FindBy (xpath = "((//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088'])[2]/div/div/div/div/div)[21]")
	  //@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")
	  //@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[1]")
	  WebElement depart_date;
		
	  //@FindBy(xpath="//div[.='6']")
	  @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[20]")
	  WebElement depart_date_select;
	  
	  @FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[3]")
	  WebElement return_month;
		
	  @FindBy (xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar r-icoktb']")
	  //@FindBy(xpath="(//div[.='Select Date'])[2]")
	  WebElement return_date;
	
	  @FindBy (xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-1otgn73 r-1aockid'])[36]")
	  //@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41'][normalize-space()='15']")
	  //@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41'])[2]")
	  WebElement return_date_select;
	  
		@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[13]")
		WebElement roundtrip_RB;
		  
		@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[17]")
		WebElement passengers_dd;

		@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[20]")
		WebElement adult_add_button;
		
		@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
		//@FindBy(xpath="(//div[.='Done'])[3]")
		WebElement passengers_Done_button;
		  
		/*
		 * public void login_link() { login_link.click(); } public void login_mobNum() {
		 * login_mobNum.sendKeys("9788747516"); } public void login_pwd() {
		 * login_pwd.sendKeys("Password@123"); } public void login_Wrong_Pwd() {
		 * login_pwd.sendKeys("Password@1"); } public void login_button() {
		 * login_button.click(); }
		 */		 	  
		  public void search_flight_button(WebDriver driver) throws InterruptedException {
			  System.out.println("inside search_flight_button()");
			// Actions a1=new Actions(driver);
			 //a1.click(search_flight_button).build().perform(); 
			  search_flight_button.click();
			  Thread.sleep(5000);
			  System.out.println(driver.getTitle());
			  Assert.assertEquals(driver.getTitle(),"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			  
		  } 
		  public void search_flight_button_TC9() {
			  search_flight_button_TC9.click();
		  }
		  public void from() {
		  from.sendKeys("BLR"); 
		  }
		  public void to() {
			  to.sendKeys("DEL"); 
			  }
		  public void depart_date() throws InterruptedException {
			  Thread.sleep(3000);
			  System.out.println("inside depart date");
			  depart_date.click();
				/*
				 * Thread.sleep(3000); String monyyyy=depart_month.getText();
				 * System.out.println(depart_month.getText()); if (monyyyy.equals("June 2024"))
				 * { System.out.println("inside calendar"); depart_date_select.click(); }
				 */
		  }
		  
		   public void return_date() throws InterruptedException {
				System.out.println("inside return date");  
			   Thread.sleep(3000);
			   //return_date.click();  
			   return_date_select.click();
			   System.out.println("after click-inside return date");

				  Thread.sleep(3000);
					/*
					 * Thread.sleep(3000); String monyyyy=return_month.getText();
					 * if(monyyyy.equals("July 2024")) {
					 */ 
					 // return_date.click();
					 // return_date_select.click();
//}
					 }
			   
		  public void roundtrip_RB() {
			  roundtrip_RB.click();
		  }
		  public void passengers_dd() {
			  passengers_dd.click();
		  }
		  public void adult_add_button() {
			  adult_add_button.click();
			  adult_add_button.click();
		  }
		  public void passengers_Done_button() {
			  passengers_Done_button.click();
		  }
//------------eeshan i/p------------
		//{ driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")).click();}//for departure field location
			
			//{    driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[3]/div[4]")).click();} for selecting departutr date

	 @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	 WebElement depart_date_field;
	 
	 public void depart_date_field() {
		 depart_date_field.click();;
	 }
	 @FindBy(xpath="(//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[3]/div[4]")
	 WebElement depart_date_sp_select;
	 
	 public void depart_date_sp_select() {
		 depart_date_sp_select.click();
	 }
	 
	public SpJet_Search_Page_P2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
