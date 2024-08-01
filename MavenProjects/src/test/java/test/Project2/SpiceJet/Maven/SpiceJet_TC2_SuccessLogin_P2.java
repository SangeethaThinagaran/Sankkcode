package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_LoginLogout_Page_P2;
//import source.Project2.SpiceJet.Maven.SpJet_LoginPage_P2;
import source.Project2.SpiceJet.Maven.SpJet_SignUp_P2;

public class SpiceJet_TC2_SuccessLogin_P2 extends SpiceJet_LaunchQuit_P2 {
	@Test
	public void SpJet_SuccessLgin() throws InterruptedException {
		//SpJet_SignUp_P2 SpJet_SignUp=new SpJet_SignUp_P2(driver);
		SpJet_LoginLogout_Page_P2 SpJet_login=new SpJet_LoginLogout_Page_P2(driver);
		SpJet_login.login_link();
		SpJet_login.login_mobNum();
		SpJet_login.login_pwd();
		SpJet_login.login_button();
		SpJet_login.TC2_SJ_Assertion(driver);
}
}
