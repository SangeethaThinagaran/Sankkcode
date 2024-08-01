package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_BuyNow_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC11_CheckOut_Process_P1 extends Amaz_LaunchQuit_P1 {
	@Test
	 public void amaz_checkout() throws InterruptedException{
		 Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
			amaz_page.sign_HoverOver(driver);
			amaz_page.signIn_link();
			
			Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
			amaz_signIn.mailId();
			amaz_signIn.continuebutton();
			amaz_signIn.pwd_signIn();
			amaz_signIn.signIn_login();
			
			Amaz_Search_Page_P1 amaz_search=new Amaz_Search_Page_P1(driver);
			amaz_search.search_text();
						
			Amaz_Product_Page_P1 amaz_prod_Select =new Amaz_Product_Page_P1(driver);
			amaz_prod_Select.prod1();
			
			Amaz_BuyNow_Page_P1 amaz_buynow=new Amaz_BuyNow_Page_P1(driver);
			Thread.sleep(3000);
			amaz_buynow.buy_Now();
			Thread.sleep(3000);
			amaz_buynow.change_Address();
			Thread.sleep(3000);
			amaz_buynow.address3_radio();
			Thread.sleep(3000);
			amaz_buynow.usethisaddress();
			Thread.sleep(3000);
			amaz_buynow.netbanking();
			amaz_buynow.tc11_Assertion(driver);
}

}
