package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC7_Product_Page_P1 extends Amaz_LaunchQuit_P1{
	@Test
	 public void amaz_search(){
		 Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
			amaz_page.sign_HoverOver(driver);
			amaz_page.signIn_link();
			
			Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
			amaz_signIn.mailId();
			amaz_signIn.continuebutton();
			amaz_signIn.pwd_signIn();
			amaz_signIn.signIn_login();
			
			Amaz_Search_Page_P1 amaz_search=new Amaz_Search_Page_P1(driver);
			amaz_search.search_dd();
			amaz_search.search_text();
			
			Amaz_Product_Page_P1 amaz_prod=new Amaz_Product_Page_P1(driver);
			amaz_prod.prod1();
			amaz_prod.prod1_price_display();
			amaz_prod.customer_review_display();
			amaz_prod.prod_info();
			amaz_prod.tc7_assertion();
	}
}
