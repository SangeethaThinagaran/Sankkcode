package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Cart_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC10_Update_Remove_Items_Cart_P1  extends Amaz_LaunchQuit_P1 {
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
			
			Amaz_Search_Page_P1 amaz_search=new Amaz_Search_Page_P1(driver);
			amaz_search.search_text();
			
			Amaz_Product_Page_P1 amaz_prod_Select =new Amaz_Product_Page_P1(driver);
			amaz_prod_Select.prod1();
			
			Amaz_Cart_Page_P1 amaz_cart=new Amaz_Cart_Page_P1(driver);
			Thread.sleep(3000);
			amaz_cart.addToCart_Child(driver);
			amaz_cart.gotToCart();
			//amaz_cart.noOfAddedItems_cart();
			amaz_cart.delete_prod_cart();
			amaz_cart.countOfCartprod();
			amaz_cart.tc10_Assertion(driver);
}
}
