package test.Amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import source.Amazon.Amazon_Home_Page;
import source.Amazon.Amazon_Login_Page;
import source.Amazon.Amazon_ProductPage;
import source.Amazon.Amazon_SearchResult_Page;

public class TestCase1_Login_To_Cart extends LaunchQuit{
	
	@Test(retryAnalyzer=test.Amazon.Amazon_IRetryAnalyzerProgram.class)
	public void login_to_amazon_till_cart(){
	Amazon_Login_Page amazon_login=new Amazon_Login_Page(driver);
	amazon_login.signinlink();
	amazon_login.un();
	amazon_login.cnt();
	amazon_login.pwd();
	amazon_login.signin();
	//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	
	Amazon_Home_Page amazon_home=new Amazon_Home_Page(driver);
	amazon_home.search();
	
	Amazon_SearchResult_Page amazon_search=new Amazon_SearchResult_Page(driver);
	amazon_search.prod_one(driver);
	
	Amazon_ProductPage amazon_ProdPage=new Amazon_ProductPage(driver);
	amazon_ProdPage.wishlist();
	amazon_ProdPage.wishlist_closebutton();
	amazon_ProdPage.addToCart();
	
	
	}

}
