package source.Project1_Amazon_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amaz_Cart_Page_P1 {
		
	//@FindBy(xpath="//input[@id='add-to-cart-button']")
	@FindBy(id="add-to-cart-button")
	 WebElement addToCart_button;
	//int count=0;
	//int num;
	@FindBy(id="sw-gtc")
	WebElement gotToCart_button; 
	
	@FindBy(xpath="//div[@id='nav-cart-count-container']")
	WebElement cart_link;
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement noOfAddedItems_cart;
	
	@FindBy(id="nav-cart-count")
	WebElement countOfCartprod_link;
	
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	WebElement delete_prod_cart_button;
	   
	@FindBy(xpath="(//img[@class='s-image s-image-optimized-rendering'])[1]")
	//@FindBy(xpath="(//img[@class='s-image'])[1]")
	WebElement prod2;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[1]")
	WebElement addToCart_Child;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceedToBuy_button;
	
	@FindBy(xpath="(//span[@class='a-size-mini a-color-success sc-clipped-msg a-text-bold'])[1]")
	WebElement coupon_selected;
	
	public void addToCart() {
		 addToCart_button.click();
		//count++;
		// System.out.println(count);
		 // Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart", "The title of the Cart page is different");
		 }
	 
	 public void gotToCart() {	
		 gotToCart_button.click();
		  }
	 public void cartlink() {
			cart_link.click();
			//num=Integer.parseInt(cart_link.getText());
		}
	 public void addToCart_Child(WebDriver driver) {
		 Set<String> pandcID=driver.getWindowHandles();
		 Iterator<String> i1=pandcID.iterator();
		 String parentID=i1.next();
		 String childID=i1.next();
		 driver.switchTo().window(childID);
		 addToCart_Child.click();
		 //count++;
		 //driver.close();
	 }
	 public void addToCart_Child2(WebDriver driver) {
		 Set<String> pandcID=driver.getWindowHandles();
		 Iterator<String> i1=pandcID.iterator();
		 String parentID=i1.next();
		 String childID=i1.next();
		 String childID2=i1.next();
		 driver.switchTo().window(childID2);
		 addToCart_Child.click();
		 //count++;
		 //driver.close();
	 }
	
	 public void noOfAddedItems_cart() {
		 Select s1=new Select(noOfAddedItems_cart);
		 s1.selectByIndex(0);
	 }
	 public void countOfCartprod() {
		 System.out.println("The no of products in the cart : " + countOfCartprod_link.getText());
		 
	  }
	 public void delete_prod_cart() {
			/*
			 * System.out.println(num); if (num!=0) { for (int i=0;i<=num;i++) {
			 * delete_prod_cart_button.click(); }
			 */
		// }
		 delete_prod_cart_button .click();
		 }
	 public void prod2() {
		 prod2.click();
	 }
	 public void proceedToBuy(){
		 proceedToBuy_button.click();
	 }
     public void tc9_Assertion(WebDriver driver) {
	 Assert.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart");
	      }
     
     
     public void tc10_Assertion(WebDriver driver) {
    	 WebElement removedText=driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]"));
    	 //System.out.println(removedText.isDisplayed());
    	 System.out.println(removedText.getText());
    	 String word=removedText.getText();
    	 System.out.println(word.contains("removed"));
    	 Assert.assertTrue(word.contains("removed"));
    	 
    	}
     
		
		/*
		 * public void tc12_Assertion(WebDriver Driver) {
		 * Assert.assertEquals(countOfCartprod_link.getText(), count); }
		 */	 
 
     	public void tc13_Assertion() {
     		Assert.assertTrue(coupon_selected.isDisplayed());
     	}
     	public void tc15_Assertion(WebDriver driver) {
     		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
     	}
     
     	 public Amaz_Cart_Page_P1(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		
	 }

}
