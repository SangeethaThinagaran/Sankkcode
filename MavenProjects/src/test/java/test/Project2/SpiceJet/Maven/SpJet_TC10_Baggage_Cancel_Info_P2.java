package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;import source.Project2.SpiceJet.Maven.SpJet_Flight_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpJet_TC10_Baggage_Cancel_Info_P2 extends SpiceJet_LaunchQuit_P2{
	@Test
	public void SpJet_Baggage_Cancellation() throws InterruptedException {
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
		flight_info.flight_info_depart_link();
		flight_info.baggage();
		flight_info.baggage_view_baggage();
		flight_info.cancellation();
		flight_info.cancellation_cancellation_charges();
		flight_info.Assertion_TC10_p2();
}
}