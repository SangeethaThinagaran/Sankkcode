package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_BuyNow_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Cart_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC13_Coupon_Code_P1 extends Amaz_LaunchQuit_P1 {
	@Test
	 public void amaz_search() throws InterruptedException{
		 Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
			amaz_page.sign_HoverOver(driver);
			amaz_page.signIn_link();
			
			Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
			amaz_signIn.mailId();
			amaz_signIn.continuebutton();
			amaz_signIn.pwd_signIn();
			amaz_signIn.signIn_login();

			Amaz_Search_Page_P1 amaz_search1=new Amaz_Search_Page_P1(driver);
			amaz_search1.search_text_coupon_text(); 
			Thread.sleep(3000);
			amaz_search1.product_coupon();
			Thread.sleep(3000);
			amaz_search1.coupon_checkBox(driver);
			Thread.sleep(3000);
			
			
			Amaz_Cart_Page_P1 amaz_cart=new Amaz_Cart_Page_P1(driver);
			Thread.sleep(3000);
			amaz_cart.addToCart();
			amaz_cart.gotToCart();
			amaz_cart.tc13_Assertion();
			
}

}
