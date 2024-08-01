package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amaz_Profile_Page {
	
	//@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signIn_homepage_ho;
	
	@FindBy(className="sc-ksBlkl sc-jRwbcX fedVjG fqsXfW")
	WebElement manage_profile_link;
	
	@FindBy(className="sc-hBxehG sc-dmctIk jPpkrn fbRspv")
	WebElement view_link;
	
	@FindBy(xpath="(//*[name()='svg'and @class='chevron'])[1]")
	WebElement pref_dept_dd;
	
	@FindBy(xpath="//button[.='Edit']")
	WebElement edit_pref_button;
	
	@FindBy(xpath="//button[.='Men']")
	WebElement Men_pref_button;
	
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement save_Pref_button;
	
	public void signIn_HomePage_HoverOver(WebDriver driver) {
		System.out.println("hompeage");
		Actions a1=new Actions(driver);
		a1.moveToElement(signIn_homepage_ho).perform();
	}
	public void manage_profile() {
		manage_profile_link.click();
	}
	public void view_profile() {
		view_link.click();
	}
	public void pref_dept() {
		pref_dept_dd.click();
	}
	public void edit_pref_dept() {
		edit_pref_button.click();
	}
	
	public void Men_pref_dept() {
		Men_pref_button.click();
	}
	public void save_Pref_dept() {
		save_Pref_button.click();
	}
	
	public Amaz_Profile_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
