package test.Project2.AirIndia.Maven;

import org.testng.annotations.Test;

import source.Project2.AirIndia.Maven.AirIndia_Registration_Page_P2;
import source.Project2.AirIndia.Maven.AirIndia_SignIn_Page_P2;

public class AirIndia_TC2_Success_Login_P2 extends AirIndia_LaunchQuit_P2{
@Test
public void AirIdia_SuccessLogin() throws InterruptedException {
	AirIndia_Registration_Page_P2 AI_regis=new AirIndia_Registration_Page_P2(driver);
	AI_regis.cookies();
	AI_regis.SignIn();
	
	AirIndia_SignIn_Page_P2 AI_SignIn=new AirIndia_SignIn_Page_P2(driver);
	AI_SignIn.signInName();
	AI_SignIn.SignIn_pwd();
	AI_SignIn.signIn(driver);

}

}
