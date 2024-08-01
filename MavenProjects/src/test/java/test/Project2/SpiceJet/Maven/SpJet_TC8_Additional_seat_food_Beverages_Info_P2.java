package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_Contact_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Flight_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Food_Seat_Info_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
import source.Project2.SpiceJet.Maven.SpJet_Search_Page_P2;

public class SpJet_TC8_Additional_seat_food_Beverages_Info_P2 extends SpiceJet_LaunchQuit_P2{
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
		//flight_info.flight_details_link(driver);
		//Thread.sleep(3000);
		flight_info.continue_button();
		Thread.sleep(3000);
		
		SpJet_Contact_Info_Page_P2 contactinfo=new SpJet_Contact_Info_Page_P2(driver);
		//contactinfo.primary_Passenger_CB(driver);
		contactinfo.passenger1_Fname();
		contactinfo.passenger1_Lname();
		contactinfo.continue_button(driver);
		
		SpJet_Food_Seat_Info_Page_P2 foodseat=new SpJet_Food_Seat_Info_Page_P2(driver);
		foodseat.extra_legroom();
		foodseat.meal_beverage();
		foodseat.priority_CheckIn();
		foodseat.Add_extra_luggage();
		foodseat.seat_Select();
		foodseat.seat_RB();
		foodseat.accept_button();
		foodseat.continue_popup();
		foodseat.sel_meals_button();
		foodseat.food1();
		foodseat.done_button();
		foodseat.extra_seat_text();
		
//		foodseat.skip();
//		foodseat.seat_Amt_Additional();
//		foodseat.select_Meals();
//		foodseat.food_CB();
		
	}

}
