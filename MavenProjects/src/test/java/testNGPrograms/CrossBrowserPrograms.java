package testNGPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserPrograms {
	WebDriver driver;
	@Test
	//@Parameters("browser")
	public void launch_browser() throws InterruptedException {
		//if(nameofbrowser.equals("chrome")) {
		 driver=new ChromeDriver();
	/*	}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
		*/
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.quit();
	}
	
	//class2
	public class HTML_Page {
	@Test(priority=-1)
	public void HTML_Page1() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/grkri/OneDrive/Documents/San/Java/JavaSeleniumCourse/learningHTML1.html");
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
	}
	}
	
	public class all_Links {
	@Test
	public void all_Links1() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++) {
			WebElement a1=allLinks.get(i);
			//String url=a1.getAttribute("href");
			String text=a1.getText();
			System.out.println(text);
			//System.out.println(url);
		driver.quit();
	}
}
	}
	
	public class gtm_Registration {
	@Test
	public void gtm_Registration1() {
	driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registeration-form/");
	WebElement fn=driver.findElement(By.id("firstName"));
	fn.sendKeys("San");
	fn.sendKeys(Keys.CONTROL+"a");
	fn.sendKeys(Keys.CONTROL+"c");
	//Thread.sleep(5000);
	WebElement ln=driver.findElement(By.id("lastName"));
	ln.sendKeys(Keys.CONTROL+"v");
	driver.quit();
	}
	}
	public class gtm_DragandDrop {
	@Test
	public void gtm_DragandDrop1() {
		driver= new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Actions a1=new Actions(driver);
		//Postman
		//WebElement dragelement=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		//JSON
		//WebElement dragelement=driver.findElement(By.xpath("(//div[@id='div1'])[11]"));
		//GitHub
		WebElement dragelement=driver.findElement(By.xpath("(//div[@id='div1'])[5]")); 
		WebElement dropelement= driver.findElement(By.xpath("(//div[@id='div2'])"));
		a1.dragAndDrop(dragelement, dropelement).perform();
		driver.quit();
	}
	}
}
