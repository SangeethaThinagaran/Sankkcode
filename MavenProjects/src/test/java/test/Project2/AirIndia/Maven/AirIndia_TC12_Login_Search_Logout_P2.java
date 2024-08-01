package test.Project2.AirIndia.Maven;

import org.testng.annotations.Test;

import source.Project2.AirIndia.Maven.AirIndia_Search_Page_P2;

public class AirIndia_TC12_Login_Search_Logout_P2 extends AirIndia_LaunchQuit_P2 {
@Test
public void AirIndia_Login_Search_Logout() throws InterruptedException {
	AirIndia_Search_Page_P2 AI_search=new AirIndia_Search_Page_P2(driver);
	//AI_search.From();
	AI_search.Destination();
	AI_search.departDate();
	
}
}
