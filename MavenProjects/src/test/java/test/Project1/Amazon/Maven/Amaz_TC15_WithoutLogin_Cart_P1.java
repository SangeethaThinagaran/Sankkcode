package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Cart_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Product_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC15_WithoutLogin_Cart_P1 extends Amaz_LaunchQuit_P1 {
	@Test
	 public void amaz_search(){
		Amaz_Search_Page_P1 amaz_search=new Amaz_Search_Page_P1(driver);
		amaz_search.search_text();
		
		Amaz_Product_Page_P1 amaz_prod=new Amaz_Product_Page_P1(driver);
		amaz_prod.prod1();
			
		Amaz_Cart_Page_P1 amaz_cart=new Amaz_Cart_Page_P1(driver);
		amaz_cart.addToCart_Child(driver);
		amaz_cart.gotToCart();
		amaz_cart.tc15_Assertion(driver);
}

}
