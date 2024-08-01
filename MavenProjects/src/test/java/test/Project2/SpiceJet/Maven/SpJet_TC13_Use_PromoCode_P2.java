package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_Contact_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Flight_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Food_Seat_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Payment_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpJet_TC13_Use_PromoCode_P2 extends SpiceJet_LaunchQuit_P2{
	@Test
	public void SpJet_Use_PromoCode() throws InterruptedException {
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
		contactinfo.passenger1_Fname();
		contactinfo.passenger1_Lname();
		contactinfo.continue_button(driver);

//		SpJet_Food_Seat_Info_Page_P2 foodseat=new SpJet_Food_Seat_Info_Page_P2(driver);
//		foodseat.Add_extra_luggage();
//		foodseat.seat_Select();
//		foodseat.seat_RB();
//		foodseat.accept_button();
//		foodseat.continue_popup();
//		foodseat.sel_meals_button();
//		foodseat.food1();
//		foodseat.done_button();
		
		SpJet_Food_Seat_Info_Page_P2 foodseat=new SpJet_Food_Seat_Info_Page_P2(driver);
		//foodseat.addOn_CloseButton();
		foodseat.addSeatNew();
		Thread.sleep(3000);
		//foodseat.Add_extra_luggage();
		foodseat.seat_Select();
//		foodseat.seat_RB();
//		foodseat.accept_button();
		foodseat.adjSeat();
		Thread.sleep(3000);
		foodseat.adjSeat_AcceptButton();
		foodseat.continue_popup();
		foodseat.sel_meals_button();
		//foodseat.food1();
		foodseat.foodNew();
		foodseat.done_button();
		Thread.sleep(3000);
		foodseat.continueButton_New();
	
		SpJet_Payment_Page_P2 pymtpage=new SpJet_Payment_Page_P2(driver);
		pymtpage.applyPromo();
		pymtpage.addOn_PromoCode();
		pymtpage.apply_ApplyPromo();
		 
		
	}
}
