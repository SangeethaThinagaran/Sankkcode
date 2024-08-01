package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC3_LoginFail_P1 extends Amaz_LaunchQuit_P1 {
	@Test
	public void Amaz_Success_Login() {
		Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
		amaz_page.sign_HoverOver(driver);
		amaz_page.signIn_link();
		
		Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
		amaz_signIn.mailId();
		amaz_signIn.continuebutton();
		amaz_signIn.pwd_Wrong_signIn();
		amaz_signIn.signIn_login();
		
	}
}
