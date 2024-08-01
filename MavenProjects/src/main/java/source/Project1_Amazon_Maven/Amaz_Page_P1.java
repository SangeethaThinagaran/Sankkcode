package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.FindBy;

public class Amaz_Page_P1 {
WebDriver driver;

@FindBy(xpath="//span[.='Hello, sign in']")
WebElement signIn_ho;

@FindBy(xpath="(//a[.='Start here.'])[1]")
WebElement starthere_link;

@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
WebElement  signIn_link;


public void sign_HoverOver(WebDriver driver) {
	Actions a1=new Actions(driver);
	a1.moveToElement(signIn_ho).perform();
	
}
 public void start_here() {
	 starthere_link.click();
 }
 
 public void signIn_link() {
	 signIn_link.click();
 }
 
 
 public Amaz_Page_P1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

}
