package source.Project1_Amazon_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amaz_Search_Page_P1 {
	
	@FindBy(id="twotabsearchtextbox")
	 WebElement search_tf;
	
	@FindBy(id="searchDropdownBox")
	WebElement search_dd;
	
	@FindBy(xpath="(//span[.='VYOOx Rubber 2 in 1 Bathroom Cleaning Brush Wiper Tiles Cleaning Bathroom Brush Floor Scrub Brush with Long Handle 120° Rotate Home Kitchen Bathroom Cleaning Brush Pack-1, Multicolor'])")
	//@FindBy(xpath="(//img[@class='s-image s-image-optimized-rendering'])[4]")
	WebElement product_coupon;
	   
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
	WebElement coupon_checkBox;
	
	
	
	 public void search_text() {
		 search_tf.sendKeys("shoes");
		 search_tf.sendKeys(Keys.ENTER);
		 }
	 public void tc5_assertion(WebDriver driver) {
		 Assert.assertEquals(driver.getTitle(), "Amazon.in : shoes");
		 }
	 public void search_text_1() {
		 search_tf.clear();
		 search_tf.sendKeys("bags");
		 search_tf.sendKeys(Keys.ENTER); 
	 }
	 public void search_text_coupon_text() {
		 search_tf.sendKeys("product with coupons");
		 search_tf.sendKeys(Keys.ENTER); 
	 }
	 public void product_coupon() {
		 product_coupon.click();
	 }
	 
	 public void search_dd() {
		 Select s1=new Select(search_dd);
		 //s1.selectByVisibleText("Amazon Fashion");
		 s1.selectByIndex(37);
		 //search_dd.click();
	 }
	 public void coupon_checkBox(WebDriver driver) {
		 Set<String> parentChild_id=driver.getWindowHandles();
		 Iterator<String> i1=parentChild_id.iterator();
		 String parentid=i1.next();
		 String childid=i1.next();
		 driver.switchTo().window(childid);
		 coupon_checkBox.click();
	 } 
	 public Amaz_Search_Page_P1(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		
	}

}
 