package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_BuyNow_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Cart_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC12_ProdCount_CartCount_P1 extends Amaz_LaunchQuit_P1 {
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
			
			Amaz_Cart_Page_P1 amaz_cart=new Amaz_Cart_Page_P1(driver);
			//amaz_cart.cartlink();
			//amaz_cart.delete_prod_cart();
			
			Amaz_Search_Page_P1 amaz_search=new Amaz_Search_Page_P1(driver);
			amaz_search.search_text();
						
			Amaz_Product_Page_P1 amaz_prod_Select =new Amaz_Product_Page_P1(driver);
			amaz_prod_Select.prod1();
			
			
			Thread.sleep(3000);
			amaz_cart.addToCart_Child(driver);
			amaz_search.search_text_1();
			amaz_cart.prod2();
			Thread.sleep(3000);
			amaz_cart.addToCart_Child2(driver);
			Thread.sleep(3000);
			amaz_cart.gotToCart();
			Thread.sleep(3000);
			amaz_cart.countOfCartprod();
			//amaz_cart.tc12_Assertion(driver);
			amaz_cart.proceedToBuy();
			Thread.sleep(3000);
			
			
			Amaz_BuyNow_Page_P1 amaz_buyNow=new Amaz_BuyNow_Page_P1(driver);
			amaz_buyNow.address3_radio();
			Thread.sleep(3000);
			amaz_buyNow.usethisaddress_buttontc12();
			Thread.sleep(3000);
			//amaz_buyNow.deliverToAddress();
			//Thread.sleep(3000);
			amaz_buyNow.netbanking();
			Thread.sleep(3000);
			amaz_buyNow.tc11_Assertion(driver);
			
			
}
	

}
