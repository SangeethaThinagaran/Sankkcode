package assertion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FB_Registration_5_DataSet {
@DataProvider(name="RegistrationData")
public Object registrationData() {
	Object o2[][]=new Object[5][4];
	o2[0][0]="Samrinya";
	o2[0][1]="Thina";
	o2[0][2]="+919942205555";
	o2[0][3]="Password@124";
	
	o2[1][0]="Navrutha";
	o2[1][1]="Thina";
	o2[1][2]="+919940227775";
	o2[1][3]="Password@125";

	o2[2][0]="kannikana";
	o2[2][1]="Thina";
	o2[2][2]="+919941256767";
	o2[2][3]="Password@126";
	
	o2[3][0]="Vidhushala";
	o2[3][1]="Thina";
	o2[3][2]="+919947198768";
	o2[3][3]="Password@129";

	o2[4][0]="Lalithsana";
	o2[4][1]="Thina";
	o2[4][2]="+919944864047";
	o2[4][3]="Password@127";

	return o2;
	
}

@Test(dataProvider="RegistrationData")
public void FB_Registration(String fname, String lname, String mobnum, String pwd) {
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/signup");
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	//Assert.assertEquals(driver.getTitle(),"Facebook");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobnum);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pwd);
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select mm=new Select(month);
	List<WebElement> monthlist=mm.getOptions();
	monthlist.get(0).click();
	WebElement date1=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select dd=new Select(date1);
	List<WebElement> datelist=dd.getOptions();
	datelist.get(1).click();
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select yyyy=new Select(year);
	List<WebElement> yearlist=yyyy.getOptions();
	//System.out.println(yearlist.get(24).getText());
	yearlist.get(24).click();
	driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	driver.findElement(By.name("websubmit")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	//String s="There was an error with your registration. Please try registering again.";
	boolean b5=driver.findElement(By.xpath("(//div[@role='button'])[3]")).isDisplayed();
	
	Assert.assertEquals(b5, true);
}
}




