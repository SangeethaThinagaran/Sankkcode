package source.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_LOGIN_Page {
WebDriver driver;
//-----STEP-1-------
@FindBy(id="email")
WebElement un_tf;

@FindBy(name="pass")
WebElement pwd_tf;

@FindBy(xpath="//button[@name='login']")
WebElement login_button;

//-----STEP-2-----
public void un() {
	un_tf.sendKeys("");
	}

public void pwd() {
	pwd_tf.sendKeys("");
}

public void login() {
	login_button.click();
	
}

//-----STEP-3-----
public FB_LOGIN_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
}
