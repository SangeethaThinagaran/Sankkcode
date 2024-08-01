package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amaz_Order_Page_P1 {

	@FindBy(xpath="(//span[@class='nav-line-1'])[2]")
	WebElement order_link;
	
	@FindBy(xpath="//a[@id='Leave-seller-feedback_2']")
	WebElement leavefeedback_button;
	
	@FindBy(xpath="//label[@name='star4']")
	WebElement fourstar_label;
	
	@FindBy(id="a-autoid-2-announce")
	WebElement submitResponse_button;
	
	@FindBy(xpath="//textarea[@name='feedback-text']")
	WebElement comment_tf;
	
	public void order_return() {
		order_link.click();
	}
	public void leavefeedback() {
		leavefeedback_button.click();
	}
	public void fourstar() {
		fourstar_label.click();
	}
	public void submitResponse() {
		submitResponse_button.click();
	}
	public void comment_order() {
		comment_tf.sendKeys("The product is good as expected");
	}
	public Amaz_Order_Page_P1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
