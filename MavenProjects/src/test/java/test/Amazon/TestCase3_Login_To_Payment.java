package test.Amazon;

import org.testng.annotations.Test;

import source.Amazon.Amazon_Home_Page;
import source.Amazon.Amazon_Login_Page;
import source.Amazon.Amazon_Manage_AddressPage;
import source.Amazon.Amazon_ProductPage;
import source.Amazon.Amazon_SearchResult_Page;

public class TestCase3_Login_To_Payment extends LaunchQuit {
@Test
public void loginToPayment() {
	Amazon_Login_Page amazonlogin=new Amazon_Login_Page(driver);
	amazonlogin.signinlink();
	amazonlogin.un();
	amazonlogin.cnt();
	amazonlogin.pwd();
	amazonlogin.signin();
	
	Amazon_Home_Page amazonHome=new Amazon_Home_Page(driver);
	amazonHome.search();
	
	Amazon_SearchResult_Page amazonSearch=new Amazon_SearchResult_Page(driver);
	amazonSearch.prod_one(driver);
	
	Amazon_ProductPage amazonProd=new Amazon_ProductPage(driver);
	amazonProd.addToCart();
	amazonProd.proceedToBuy();
	
	Amazon_Manage_AddressPage amazonaddress=new Amazon_Manage_AddressPage(driver);
	amazonaddress.manageAddress();
	amazonaddress.useThisAddress();
}
}
