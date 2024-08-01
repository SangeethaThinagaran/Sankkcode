package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_Contact_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Flight_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Food_Seat_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Payment_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpJet_TC11_Contact_Info_P2 extends SpiceJet_LaunchQuit_P2{
	@Test
	public void SpJet_Contact_Info() throws InterruptedException {
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
		flight_info.continue_button();
		Thread.sleep(3000);
		
		SpJet_Contact_Info_Page_P2 contactinfo=new SpJet_Contact_Info_Page_P2(driver);
		contactinfo.contact_Fname_tf();
		contactinfo.contact_Lname_tf();
		contactinfo.contact_MobNum_tf();
		contactinfo.contact_MailID_tf();
		contactinfo.passenger_Fname_tf();
		contactinfo.passenger_Lname_tf();
		contactinfo.passenger_MobNum_tf();
		contactinfo.primary_Passenger_CB(driver);
		contactinfo.continue_button(driver);
			
	
	}

}
//TC clarity especially whohc page and how to evaluate promo code here