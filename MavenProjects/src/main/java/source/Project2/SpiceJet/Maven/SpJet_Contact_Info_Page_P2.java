package source.Project2.SpiceJet.Maven;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SpJet_Contact_Info_Page_P2 {
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[1]")
	WebElement contact_title_dd;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-19fu0aa r-1loqt21 r-1777fci r-1inuy60 r-1yt7n81 r-1otgn73'])")
	WebElement contact_title_select;

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement contact_Fname_tf;

	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement contact_Lname_tf;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement contact_MobNum_tf;

	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement contact_MailID_tf;

	@FindBy(xpath="")
	WebElement contact_Country_dd;

	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
	WebElement contact_City_tf;
	
	//@FindBy(xpath="//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[1]/div/div/div/div[1]/svg/g/rect")
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[4]")
	//@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[11]")
	WebElement primary_Passenger_CB;

//	@FindBy(xpath="")
//	WebElement passenger_title_dd;

	@FindBy(xpath="")
	WebElement passenger_title_select;

	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement passenger_Fname_tf;

	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	WebElement passenger_Lname_tf;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[8]")
	WebElement passenger_MobNum_tf;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	//@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
	WebElement passenger1_Fname;
	
	@FindBy(xpath="(//input['@class=css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[7]")
	//@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[6]")
	WebElement passenger1_Lname;
	
	@FindBy(xpath="(//div[.='Next'])[4]")
	WebElement passenger1_Next_button;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	//@FindBy(xpath="(//div[.='Continue'])[2]")
	WebElement continue_button;

//	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-lfiufh r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'])[1]")
//	WebElement passengernew1_Fname;
//	
//	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-lfiufh r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'])[2]")
//	WebElement passengernew2_Lname;
	
	
	
	public void contact_title_dd() {
		contact_title_dd.click();
		contact_title_dd.sendKeys(Keys.ARROW_DOWN);
		contact_title_dd.sendKeys(Keys.ENTER);
	}
	public void contact_title_select() {
		contact_title_select.click();
		System.out.println("inside title select");
	}
	public void contact_Fname_tf() {
		System.out.println("contact_Fname_tf = " + contact_Fname_tf.isEnabled());
		//contact_Fname_tf.clear();
		//contact_Fname_tf.sendKeys("SangeethaLakshmi");
		Assert.assertTrue(contact_Fname_tf.isEnabled());
	}
	public void contact_Lname_tf() {
		System.out.println("contact_Lname_tf = " + contact_Lname_tf.isEnabled());
		//contact_Lname_tf.clear();
		//contact_Lname_tf.sendKeys("ThinagaranM");
		Assert.assertTrue(contact_Lname_tf.isEnabled());
		}
	public void contact_MobNum_tf() {
		System.out.println("contact_MobNum_tf = " + contact_MobNum_tf.isEnabled());
		//contact_MobNum_tf.click();
		//contact_MobNum_tf.sendKeys("9940864047");
		Assert.assertTrue(contact_MobNum_tf.isEnabled());
	}
	public void contact_MailID_tf() {
		System.out.println("contact_MailID_tf = " + contact_MailID_tf.isEnabled());
		//contact_MailID_tf.clear();
		//contact_MailID_tf.sendKeys("sangeethathinagaran@gmail.com");
		Assert.assertTrue(contact_MailID_tf.isEnabled());
	}
	public void contact_Country_dd() {
		contact_Country_dd.sendKeys("");
	}
	public void contact_City_tf() {
		System.out.println("contact_City_tf = " + contact_City_tf.isEnabled());
		//contact_City_tf.sendKeys("Chennai");
		Assert.assertTrue(contact_City_tf.isEnabled());
	}
	public void primary_Passenger_CB(WebDriver driver) {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(primary_Passenger_CB)).click();
		Actions a1=new Actions(driver);
		a1.click(primary_Passenger_CB).build().perform();
		primary_Passenger_CB.click();
		}
	//public void passenger_title_dd() {
		//passenger_title_dd.click();
	//}
	public void passenger_title_select() {
		passenger_title_select.click();
	}
	public void passenger_Fname_tf() {
		System.out.println("passenger_Fname_tf = "  + passenger_Fname_tf.isEnabled());
		//passenger_Fname_tf.sendKeys("Sangeetha");
		Assert.assertTrue(passenger_Fname_tf.isEnabled());
	}
	public void passenger_Lname_tf() {
		System.out.println("passenger_Lname_tf = " + passenger_Lname_tf.isEnabled());
		//passenger_Lname_tf.sendKeys("Thinagaran");
		Assert.assertTrue(passenger_Lname_tf.isEnabled());
	}
	public void passenger_MobNum_tf() {
		System.out.println("passenger_MobNum_tf = " + passenger_MobNum_tf.isEnabled());
		//passenger_MobNum_tf.sendKeys("9940221757");
		Assert.assertTrue(passenger_MobNum_tf.isEnabled());
	}
	public void passenger1_Fname() {
		passenger1_Fname.sendKeys("Sangeetha");
	}
	public void passenger1_Lname() {
		passenger1_Lname.sendKeys("Thina");
	}
	public void passenger2_Fname() {
		passenger1_Fname.sendKeys("Chan");
	}
	public void passenger2_Lname() {
		passenger1_Lname.sendKeys("Thina");
	}
	public void passenger3_Fname() {
		passenger1_Fname.sendKeys("Krishna");
		System.out.println("inside passenger_fname");
	}
	public void passenger3_Lname() {
		passenger1_Lname.sendKeys("Ranga");
	}
	public void passenger1_Next_button() {
		passenger1_Next_button.click();
	}
//	public void passengernew1_Fname() {
//		passenger1_Fname.sendKeys("Sangeetha");
//	}
//	public void passengernew1_Lname() {
//		passenger1_Lname.sendKeys("Thina");
//	}
	public void continue_button(WebDriver driver) {
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(continue_button)).click();
	}

	
	public SpJet_Contact_Info_Page_P2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

}
