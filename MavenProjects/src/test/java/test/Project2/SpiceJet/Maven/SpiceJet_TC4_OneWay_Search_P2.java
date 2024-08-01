package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
//import source.Project2.SpiceJet.Maven.SpJet_LoginPage_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpiceJet_TC4_OneWay_Search_P2 extends SpiceJet_LaunchQuit_P2{
	@Test
	public void SpJet_OneWay_Search() throws InterruptedException {
		SpJet_LoginLogout_Page_P2 SpJet_login=new SpJet_LoginLogout_Page_P2(driver);
		SpJet_login.login_link();
		SpJet_login.login_mobNum();
		SpJet_login.login_pwd();
		SpJet_login.login_button();
		Thread.sleep(5000);
		SpJet_Search_Page_P2 Spjet_search=new SpJet_Search_Page_P2(driver);
		Spjet_search.from();
		Thread.sleep(3000);
		Spjet_search.to();
		Thread.sleep(3000);
		Spjet_search.depart_date();
		
		//Spjet_search.depart_date_field();
		//Spjet_search.depart_date_sp_select();
		Spjet_search.search_flight_button(driver);
	}
}
