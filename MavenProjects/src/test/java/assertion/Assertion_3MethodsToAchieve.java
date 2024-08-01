package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion_3MethodsToAchieve {
@Test
public void login(){
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.className("gb_J")).click();
	driver.findElement(By.partialLinkText("Gma")).click();
	//Assert.assertEquals(driver.getTitle(),"Gmail: Private and secure email at no cost | Google Workspace");
	//Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/gmail/about/");
	WebElement presenceOfElement= driver.findElement(By.xpath("(//div[@class='dropdown__label'])[4]"));
	Assert.assertTrue(presenceOfElement.isDisplayed());
}
}
	/*Assert.assertEquals(false, false);
	getTitle(),
getCurrentUrl()
presenceOfComponent.isDisplayed()
}
*/