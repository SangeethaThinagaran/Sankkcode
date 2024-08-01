package test.Project2.AirIndia.Maven;

import org.testng.annotations.Test;

import source.Project2.AirIndia.Maven.AirIndia_Registration_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_Search_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_SignIn_Page_P2;

public class AirIndia_TC7_Multicity_Search_P2 extends AirIndia_LaunchQuit_P2{
	@Test
	public void AirIdia_MultiCity_Search() throws InterruptedException {
		AirIndia_Registration_Page_P2 AI_regis=new AirIndia_Registration_Page_P2(driver);
		AI_regis.cookies();

		AirIndia_Search_Page_P2 AI_search=new AirIndia_Search_Page_P2(driver);
		AI_search.MM_DD();
		AI_search.MultiCity();
		
		//AI_search.To_Flight1();
		AI_search.From_Flight1();
		AI_search.To_Flight1();
		AI_search.To_Flight2();
		AI_search.DepartDate_Flight1();
		AI_search.Select_DepartDate_Flight1();
		Thread.sleep(3000);
		AI_search.To_Flight3();
		AI_search.SearchFlight(driver);
		//AI_search.oneWay_select();
		//AI_search.search();
		//AI_search.search_tf();
		//AI_search.flight_link();
		//AI_search.oneWay_button();
		//AI_search.Destination();
		//AI_search.showFlight(driver);	
		}

}
