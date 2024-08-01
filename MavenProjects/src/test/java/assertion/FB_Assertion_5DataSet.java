package assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class FB_Assertion_5DataSet {
	
@DataProvider(name="FBdata")
public Object FB_data() {
	Object o1[][]=new Object[3][2];
	
	o1[0][0]="sangeethathinagaran@gmail.com";
	o1[0][1]="KS27280205";
	
	o1[0][0]="9940864047";
	o1[0][1]="KS27280205";
	
	o1[0][0]="+919940864047";
	o1[0][1]="KS27280205";
	
	o1[1][0]="sangnagaran@gmail.com";
	o1[1][1]="KS27280205";
	
	o1[2][0]="sangeethathinagaran@gmail.com";
	o1[2][1]="password";
	
	return o1;
		
	}
 @Test(dataProvider="FBdata")
 public void login_FB(String username, String password) {
	 ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Facebook");
 }
}
