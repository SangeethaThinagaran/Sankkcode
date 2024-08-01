package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_Contact_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Flight_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Food_Seat_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpJet_TC9_Multple_Passengers_P2 extends SpiceJet_LaunchQuit_P2{
	@Test
	public void SpJet_multiple_passenger() throws InterruptedException {
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
		Spjet_search.passengers_dd();
		Spjet_search.adult_add_button();
		Spjet_search.passengers_Done_button();
		Thread.sleep(5000);
		Spjet_search.search_flight_button_TC9();
		Thread.sleep(5000);
		
		SpJet_Flight_Info_Page_P2 flight_info=new SpJet_Flight_Info_Page_P2(driver);
		flight_info.continue_button();
		Thread.sleep(3000);
		
		SpJet_Contact_Info_Page_P2 contactinfo=new SpJet_Contact_Info_Page_P2(driver);
		contactinfo.passenger1_Fname();
		contactinfo.passenger1_Lname();
		contactinfo.passenger1_Next_button();
		contactinfo.passenger2_Fname();
		contactinfo.passenger2_Lname();
		contactinfo.passenger1_Next_button();
		contactinfo.passenger3_Fname();
		contactinfo.passenger3_Lname();
		contactinfo.continue_button(driver);
		
		SpJet_Food_Seat_Info_Page_P2 seatinfo=new SpJet_Food_Seat_Info_Page_P2(driver);
		seatinfo.Assertion_TC9_P2();
		}


}
