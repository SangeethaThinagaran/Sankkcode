package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amaz_Product_Page_P1 {
//@FindBy(xpath="(//div[@class='_bGlmZ_itemImage_1kTKp _bGlmZ_expandedItemImageT1_23GyI'])[1]")
@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement prod1_image;


@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
WebElement prod1_price;

@FindBy(xpath="//h2[.='Customer reviews']")
WebElement customer_review;

@FindBy(xpath="//h3[.=' Product details ']")
WebElement prod_info;

@FindBy(xpath="//i[@class='a-icon a-icon-checkbox']")
WebElement getbyToday_CheckBox;

@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
WebElement shoe_brand;

public void prod1() {
	prod1_image.click();
}

public void prod1_price_display() {
	System.out.println("prod1_Price_Display = "+ prod1_price.isDisplayed());
}

public void customer_review_display() {
	System.out.println("customer_review_display = " + customer_review.isDisplayed());
}

public void prod_info() {
	System.out.println("prod_info_display = " + prod_info.isDisplayed());
}

public void getbyToday() {
	getbyToday_CheckBox.click();
}

public void shoe_brand_select() {
	shoe_brand.click();
}
public void tc7_assertion() {
	Assert.assertTrue(prod1_price.isDisplayed());
	Assert.assertTrue(customer_review.isDisplayed());
	Assert.assertTrue(prod_info.isDisplayed());
}


public Amaz_Product_Page_P1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

}
