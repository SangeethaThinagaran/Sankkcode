package test.Amazon;

import org.testng.annotations.Test;

import source.Amazon.Amazon_Home_Page;
import source.Amazon.Amazon_Login_Page;
import source.Amazon.Amazon_SearchResult_Page;

public class TestCase2_Login_Sort_Logout extends LaunchQuit {

	@Test
	public void amazon_login_sort_logout() {
	Amazon_Login_Page amazonlogin=new Amazon_Login_Page(driver);
	amazonlogin.signinlink();
	amazonlogin.un();
	amazonlogin.cnt();
	amazonlogin.pwd();
	amazonlogin.signin();
	
	Amazon_Home_Page amazonSearch=new Amazon_Home_Page(driver);
	amazonSearch.search();
	
	Amazon_SearchResult_Page amazonSearchResult=new Amazon_SearchResult_Page(driver);
	amazonSearchResult.getTomorrow();
	amazonSearchResult.fourstars();
	
	
	}
}
