package test.Project2.AirIndia.Maven;

import org.testng.annotations.Test;

import source.Project2.AirIndia.Maven.AirIndia_Registration_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_Search_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_SignIn_Page_P2;

public class AirIndia_TC5_RoundTrip_P5 extends AirIndia_LaunchQuit_P2{
	@Test
	public void AirIdia_RoundTripFights() throws InterruptedException {
		AirIndia_Registration_Page_P2 AI_regis=new AirIndia_Registration_Page_P2(driver);
		AI_regis.cookies();
		AI_regis.SignIn();
		
		AirIndia_SignIn_Page_P2 AI_SignIn=new AirIndia_SignIn_Page_P2(driver);
		AI_SignIn.signInName();
		AI_SignIn.SignIn_pwd();
		AI_SignIn.signIn(driver);

		AirIndia_Search_Page_P2 AI_search=new AirIndia_Search_Page_P2(driver);
		AI_search.Destination();
		AI_search.returnDate();
		AI_search.return_month();
		AI_search.returnDate_Date();
		AI_search.returnDate_Confirm();
		AI_search.showFlight(driver);
	}
}
