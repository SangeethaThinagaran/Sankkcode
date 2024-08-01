package source.Project1_Amazon_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amaz_NewProfile_P1 {
WebDriver driver;
@FindBy(id="nav-link-accountList-nav-line-1")
WebElement sign_in_profile;

@FindBy(xpath="//span[.='Manage Profiles']")
WebElement manage_profile_newlink;

@FindBy(xpath="//a[@class='sc-hBxehG sc-dmctIk jPpkrn fbRspv']")
WebElement view_link;

@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[1]")
WebElement prefer_dept;

@FindBy(xpath="//button[.='Edit']")
WebElement edit_button;

@FindBy(xpath="//button[.='Men']")
WebElement men_button;

@FindBy(xpath="//button[.='Women']")
WebElement women_button;

@FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary button']")
WebElement save_button;

//@FindBy(xpath="(//div[@class='accordion-trigger-content desktop'])[2]")
@FindBy(xpath="//div[.='Height and weight']")
WebElement Ht_Wt;

@FindBy(xpath="(//button[.='Edit'])[1]")
WebElement edit_ht_wt;

@FindBy(xpath="(//input[@class='number-input-box'])[1]")
WebElement ht_text;

@FindBy(xpath="(//input[@class='number-input-box'])[2]")
WebElement wt_text;

@FindBy(xpath="//button[.='Clear']")
WebElement clear_button;

@FindBy(xpath="//span[@class='a-button clear-confirmation-button desktop']")
WebElement yes_button;

@FindBy(xpath="//button[.='Add']")
WebElement add_button;

public void sign_In_Profilelink(WebDriver driver) {
	Actions a1=new Actions(driver);
	a1.moveToElement(sign_in_profile).perform();
	}

public void manage_profile_new() {
	manage_profile_newlink.click();
}
public void view() {
	view_link.click();
}
public void prefer_dept() {
	prefer_dept.click();
}
public void edit() {
	edit_button.click();
}
public void men_women_button() {
	if (men_button.isSelected()==true){
		women_button.click();
	}
	else {
	men_button.click();
	//System.out.println("WOMEN button:" + women_button.isSelected());
	}
}
public void save() {
	save_button.click();
}
public void Ht_Wt_section() {
	Ht_Wt.click();
}
public void edit_ht_wt() {
	edit_ht_wt.click();
}
public void ht_text() {
	ht_text.sendKeys("170");
}
public void wt_text() {
	wt_text.sendKeys("70");
}
public void clear() {
	clear_button.click();
}
public void yes_button() {
	yes_button.click();
}
public void add_ht_wt() {
	add_button.click();
}

public Amaz_NewProfile_P1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
}
