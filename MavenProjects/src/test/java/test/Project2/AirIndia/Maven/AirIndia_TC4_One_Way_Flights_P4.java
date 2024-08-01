package test.Project2.AirIndia.Maven;

import org.testng.annotations.Test;

import source.Project2.AirIndia.Maven.AirIndia_Registration_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_Search_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_SignIn_Page_P2;

public class AirIndia_TC4_One_Way_Flights_P4 extends AirIndia_LaunchQuit_P2{
	@Test
	public void AirIdia_OneWayFights() throws InterruptedException {
		AirIndia_Registration_Page_P2 AI_regis=new AirIndia_Registration_Page_P2(driver);
		AI_regis.cookies();
		AI_regis.SignIn();
		
		AirIndia_SignIn_Page_P2 AI_SignIn=new AirIndia_SignIn_Page_P2(driver);
		AI_SignIn.signInName();
		AI_SignIn.SignIn_pwd();
		AI_SignIn.signIn(driver);

		AirIndia_Search_Page_P2 AI_search=new AirIndia_Search_Page_P2(driver);
		AI_search.oneWay_dd();
		AI_search.oneWay_select();
		//AI_search.search();
		//AI_search.search_tf();
		//AI_search.flight_link();
		//AI_search.oneWay_button();
		AI_search.Destination();
		AI_search.showFlight(driver);	
		}

}
