package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Cart_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC9_AddToCart_P1 extends Amaz_LaunchQuit_P1 {
	 @Test
	 public void add_To_Cart(){
		 Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
			amaz_page.sign_HoverOver(driver);
			amaz_page.signIn_link();
			
			Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
			amaz_signIn.mailId();
			amaz_signIn.continuebutton();
			amaz_signIn.pwd_signIn(); 
			amaz_signIn.signIn_login();
			
			Amaz_Search_Page_P1 amaz_prod=new Amaz_Search_Page_P1(driver);
			amaz_prod.search_text();
			
			Amaz_Product_Page_P1 amaz_prod_Select =new Amaz_Product_Page_P1(driver);
			amaz_prod_Select.prod1();
			
			Amaz_Cart_Page_P1 amaz_cart=new Amaz_Cart_Page_P1(driver);
			amaz_cart.addToCart();
			amaz_cart.tc9_Assertion(driver);
			}
}
