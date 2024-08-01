package source.Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_ProductPage {
	WebDriver driver;
	@FindBy(id="add-to-wishlist-button-submit")
	 WebElement addToWishlist_button;
	 
	 @FindBy(xpath="//input[@id='add-to-cart-button']")
	 WebElement addToCart_button;
	 
	 @FindBy(xpath="//button[@class=' a-button-close a-declarative']")
	 WebElement wishlistClosebutton;
	 
	 @FindBy(name="proceedToRetailCheckout")
	 WebElement goToCart_buton;
	 
	 @FindBy(id="sc-buy-box-ptc-button")
	 WebElement proceedToBuy_button;

	 public void wishlist() {
		 addToWishlist_button.click();
		// Assert.assertEquals(wishlistClosebutton.isDisplayed(),false,"Not Displayed");
		 //Assert.assertTrue(false, "TO Skip");
	 }
	 //@Test(dependsOnMethods="wishlist")
	 public void wishlist_closebutton() {
		 wishlistClosebutton.click();
	 }
	 public void goToCart() {
		 goToCart_buton.click();
	 }
	 public void addToCart() {
		 addToCart_button.click();
	 }
	 public void proceedToBuy() {
		 proceedToBuy_button.click();
	 }

	 public Amazon_ProductPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }
}
