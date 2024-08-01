package crossBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_TC1 {
	WebDriver driver;
	@Test
	@Parameters("specificbrowser")
	public void HTML_Page111(String browsername) throws InterruptedException {
		if(browsername.equals("chrome")) 
		{
		driver=new ChromeDriver();
		}
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();

		/*driver.get("file:///C:/Users/grkri/OneDrive/Documents/San/Java/JavaSeleniumCourse/learningHTML1.html");
		driver.manage().window().maximize();
		//Username
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("San");
		//Hint
		driver.findElement(By.xpath("//input[@name='say hello']")).sendKeys("Be Humble");
		//Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		//FirstName
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Sangeetha");
		//Lastname
		boolean b1=driver.findElement(By.xpath("//input[@name='lname']")).isEnabled();
		System.out.println(b1);
		//Thread.sleep(3000);
		
		//I have a Boy
		driver.findElement(By.xpath("//input[@name='name1']")).click();
		
		//Male Radio Button
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		
		//Religion
		WebElement f=driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select s1=new Select(f);
		s1.selectByIndex(2);
		//Thread.sleep(4000);
		
		//Sign Up
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
		driver.quit();
		*/
	}
}
