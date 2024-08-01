package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram2 {

	@DataProvider(name="search_result") 
	public Object searchData() {
		
		return new Object[][] {{"India"},{"School"},{"News"},{"Weather"}};
		
	}
	
	@Test(dataProvider="search_result")
	public void result(String input) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(input);
		search.sendKeys(Keys.ENTER);
	}
}
