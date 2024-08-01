package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_NewProfile_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC4_Profile_P1 extends Amaz_LaunchQuit_P1 {
	@Test
	 public void amaz_search() throws InterruptedException{
		 Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
			amaz_page.sign_HoverOver(driver);
			amaz_page.signIn_link();
			
			Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
			amaz_signIn.mailId();
			amaz_signIn.continuebutton();
			amaz_signIn.pwd_signIn();
			amaz_signIn.signIn_login();
	
			Amaz_NewProfile_P1 amazprofile=new Amaz_NewProfile_P1(driver);
			amazprofile.sign_In_Profilelink(driver);
			amazprofile.manage_profile_new();
			Thread.sleep(3000);
			amazprofile.view();
//			amazprofile.prefer_dept();
//			amazprofile.edit();
//			amazprofile.men_women_button();
//			amazprofile.save();
			amazprofile.Ht_Wt_section();
			amazprofile.clear();
			amazprofile.yes_button();
			amazprofile.add_ht_wt();
			//amazprofile.edit_ht_wt();
			amazprofile.ht_text();
			amazprofile.wt_text();
			amazprofile.save();
	}
	
}
