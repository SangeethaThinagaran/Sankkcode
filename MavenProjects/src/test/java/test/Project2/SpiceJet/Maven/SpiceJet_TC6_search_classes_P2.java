package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_Flight_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
//import source.Project2.SpiceJet.Maven.SpJet_LoginPage_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpiceJet_TC6_search_classes_P2 extends SpiceJet_LaunchQuit_P2{
	@Test
	public void SpJet_Class_Search() throws InterruptedException {
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
		  Thread.sleep(3000);
		  Spjet_search.search_flight_button(driver);
				
		SpJet_Flight_Info_Page_P2 flight_info=new SpJet_Flight_Info_Page_P2(driver);
		flight_info.flight_details_link(driver);
		Thread.sleep(3000);
		/*
		 * flight_info.spiceSaver_RB_default(); Thread.sleep(3000);
		 * flight_info.spiceSaver_RB(); Thread.sleep(3000);
		 */
		
		flight_info.spiceSaver_RB_default();
		Thread.sleep(3000);
		flight_info.spiceFlex_RB();;
		Thread.sleep(3000);
		flight_info.spiceMax_RB();
		Thread.sleep(3000);
		//flight_info.spiceSaver_RB(driver); 
		//Thread.sleep(3000);
		 flight_info.continue_button();
		 flight_info.Assertion_Tc6_P2();
	}
	//spice saver RB are not working properly


}
