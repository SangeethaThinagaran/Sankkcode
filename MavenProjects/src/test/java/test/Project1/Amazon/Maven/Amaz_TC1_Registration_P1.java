package test.Project1.Amazon.Maven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Registration_Page_P1;

public class Amaz_TC1_Registration_P1 extends Amaz_LaunchQuit_P1 {

	//WebDriver driver;
@Test	

	public void  Amaz_Registration() throws InterruptedException {
	Amaz_Page_P1 amazpage=new Amaz_Page_P1(driver);
	amazpage.sign_HoverOver(driver);
	amazpage.start_here();
	
	Amaz_Registration_Page_P1 amazregis=new Amaz_Registration_Page_P1(driver);
	amazregis.cust_name();
	amazregis.mob_num();
	amazregis.pwd();
	amazregis.verify(driver);
	}
}
