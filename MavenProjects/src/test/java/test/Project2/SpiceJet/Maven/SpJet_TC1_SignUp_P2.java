package test.Project2.SpiceJet.Maven;

import org.testng.annotations.Test;

import source.Project2.SpiceJet.Maven.SpJet_SignUp_P2;

public class SpJet_TC1_SignUp_P2 extends SpiceJet_LaunchQuit_P2 {
@Test
public void SpJet_SignUp() throws InterruptedException {
	SpJet_SignUp_P2 SpJet_SignUp=new SpJet_SignUp_P2(driver);
	SpJet_SignUp.sign_up_link(driver);
	Thread.sleep(3000);
	SpJet_SignUp.titlepage(driver);
	Thread.sleep(3000);
	SpJet_SignUp.title();
	Thread.sleep(3000);
	SpJet_SignUp.fname();
	SpJet_SignUp.lname();
	SpJet_SignUp.dob(); 
	SpJet_SignUp.dob_month();
	SpJet_SignUp.dob_year();
	SpJet_SignUp.dob_day();
	SpJet_SignUp.mobnum();
	Thread.sleep(3000);
	SpJet_SignUp.emailId(driver);
	SpJet_SignUp.pwd(driver);
	Thread.sleep(3000);
	SpJet_SignUp.confirmpwd();
	Thread.sleep(3000);
	SpJet_SignUp.condition_cb(driver);
	Thread.sleep(5000);
	SpJet_SignUp.submit();
	Thread.sleep(3000);
}//password field is Element click intercepted
}
