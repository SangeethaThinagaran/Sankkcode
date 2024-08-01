package test.Project2.AirIndia.Maven;

import org.testng.annotations.Test;

import source.Project2.AirIndia.Maven.AirIndia_Registration_Page_P2;

public class AirIndia_TC1_SignUp_P2 extends AirIndia_LaunchQuit_P2 {
@Test
public void AirIndia_register() throws InterruptedException	{
	AirIndia_Registration_Page_P2 AI_regis=new AirIndia_Registration_Page_P2(driver);
	//AI_regis.cookies();
	//AI_regis.SignIn();
	AI_regis.MyAccount(driver);
	AI_regis.signUp();
	//AI_regis.title();
	//AI_regis.fname();
	//AI_regis.lname();
	//AI_regis.DOB();
	//AI_regis.DOB_Year_Previous();
	//AI_regis.DOB_Year();
	//AI_regis.DOB_Month();
	//AI_regis.DOB_Date();
	//AI_regis.continue_button();
	//AI_regis.mailID();
	//AI_regis.confirm_mailID();
	//AI_regis.sendVerCode_mailID();
	//Thread.sleep(15000);
	//AI_regis.countrycode();
	//AI_regis.country_code_select();
	//AI_regis.mobnum();
	//AI_regis.sendmobOTP();
	//Thread.sleep(15000);
	//AI_regis.recaptcha();
	//AI_regis.continueBtnSecondary();
	
	
}

}
