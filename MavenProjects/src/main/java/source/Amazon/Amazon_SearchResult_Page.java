package source.Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page {
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
	 WebElement prod1_select; 
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
	WebElement getByTomorrow_CheckBox;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement fourstars;
	
	public void prod_one(WebDriver driver){
		 prod1_select.click();
		 //to move the control to child window
		 Set<String> pandcID=driver.getWindowHandles();
		 Iterator<String> pc=pandcID.iterator();
		  String parentID = pc.next();
		  String childID = pc.next();
		  driver.switchTo().window(childID);
		  System.out.println(driver.getTitle());
	 }
	
	public void getTomorrow() {
		getByTomorrow_CheckBox.click();
	}
	public void fourstars() {
		fourstars.click();
	}
	public Amazon_SearchResult_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
}
