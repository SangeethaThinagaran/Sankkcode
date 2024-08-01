package source.Project2.SpiceJet.Maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpJet_SignUp_P2 {
	WebDriver driver;
	
@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
WebElement sign_up_link;

@FindBy(xpath="//select[@class='form-control form-select ']")
WebElement title_dd;

@FindBy(id="first_name")
WebElement fname_tf;

@FindBy(id="last_name")
WebElement lname_tf;

@FindBy(id="dobDate")
WebElement dob;

@FindBy(xpath="//select[@class='react-datepicker__month-select']")
WebElement dob_month;

@FindBy(xpath="//select[@class='react-datepicker__year-select']")
WebElement dob_year;

@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--027']")
WebElement dob_day;

@FindBy(xpath="//input[@class=' form-control']")
WebElement mobnum_tf;

@FindBy(id="email_id")
WebElement emailId_tf;

//@FindBy(xpath="(//input[@class='form-control '])[4]")
@FindBy(xpath="//input[@id='new-password']")
WebElement pwd_tf;

@FindBy(xpath="//input[@id='c-password']")
WebElement confirmpwd_tf;

@FindBy(xpath="(//input[@id='defaultCheck1'])")
//@FindBy(xpath="//label[@class='form-check-label font-14']")
//@FindBy(xpath="//input[@class='form-check-input mt-02']")
WebElement condition_cb;

//@FindBy(xpath="//button[@class='btn btn-red']")
@FindBy(xpath="//button[.='Submit']")
//@FindBy(xpath="[class='btn btn-red']")
WebElement submit_button;

public void sign_up_link(WebDriver driver) {
	sign_up_link.click();
}
public void titlepage(WebDriver driver) {
	Set<String> parchild_ID=driver.getWindowHandles();
	Iterator<String> i1=parchild_ID.iterator();
	String par_ID=i1.next();
	String child_ID=i1.next();
	driver.switchTo().window(child_ID);
}
public void title() {
	 Select s1=new Select(title_dd);
	 s1.selectByIndex(2);
}
public void fname() {
	fname_tf.sendKeys("Sanprofessional");
}
public void lname() {
	lname_tf.sendKeys("Thina");
}
public void dob() {
	dob.click();
}
public void dob_month() {
	Select s2= new Select(dob_month);
	s2.selectByValue("0");
	}

public void dob_year() {
	Select s2= new Select(dob_year);
	s2.selectByVisibleText("1987");	
}
public void dob_day() {
	dob_day.click();
}
public void mobnum() {
	mobnum_tf.sendKeys("9940221757");
}
public void emailId(WebDriver driver) throws InterruptedException {
	//WebDriverWait w1=new WebDriverWait(driver , Duration.ofSeconds(30));
	//w1.until(ExpectedConditions.elementToBeClickable(emailId_tf));
	emailId_tf.click();
	Thread.sleep(4000);
	Actions a1=new Actions(driver);
	a1.click(emailId_tf).build().perform();
	System.out.println("before mail id" + emailId_tf.getText());
	emailId_tf.sendKeys("sangee@gmail.com");
	System.out.println("after mail id value" + emailId_tf.getText());
	}
public void confirmpwd() throws InterruptedException {
	confirmpwd_tf.click();
	Thread.sleep(3000);
	confirmpwd_tf.sendKeys("Password@1");
}
public void pwd(WebDriver driver) throws InterruptedException {
	
	Actions a1=new Actions(driver);
	Thread.sleep(4000);
	a1.click(pwd_tf).build().perform();
	//newpassword.click();
	
	Thread.sleep(4000);
	
	a1.sendKeys(pwd_tf, "Password@1").build().perform();
	/*
	 * pwd_tf.click(); Thread.sleep(4000); Actions a1=new Actions(driver);
	 * a1.click(pwd_tf).build().perform();
	 * 
	 * WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	 * w1.until(ExpectedConditions.elementToBeClickable(pwd_tf)).click();;
	 * 
	 * pwd_tf.sendKeys("Password@1");
	 */
}

public void condition_cb(WebDriver driver) {
	System.out.println("condition_cb" + condition_cb.isSelected());
	Actions a2=new Actions(driver);
	a2.click(condition_cb).build().perform();
	System.out.println("condition_cb" + condition_cb.isSelected());
	}
public void submit() {
	System.out.println(submit_button.isDisplayed());
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
	w1.until(ExpectedConditions.elementToBeClickable(submit_button)).click();;
	
	//submit_button.click();
}

public SpJet_SignUp_P2(WebDriver driver) {
PageFactory.initElements(driver,this);
}
}
