package test.Project1.Amazon.Maven;

import org.testng.annotations.Test;

import source.Project1_Amazon_Maven.Amaz_Order_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Page_P1;
import source.Project1_Amazon_Maven.Amaz_Search_Page_P1;
import source.Project1_Amazon_Maven.Amaz_SignIn_Page_P1;

public class Amaz_TC14_LastOrder_5Star_Rating_P1 extends Amaz_LaunchQuit_P1 {
	@Test
	 public void amaz_search(){
		 Amaz_Page_P1 amaz_page=new Amaz_Page_P1(driver);
			amaz_page.sign_HoverOver(driver);
			amaz_page.signIn_link();
			
			Amaz_SignIn_Page_P1 amaz_signIn=new Amaz_SignIn_Page_P1(driver);
			amaz_signIn.mailId();
			amaz_signIn.continuebutton();
			amaz_signIn.pwd_signIn();
			amaz_signIn.signIn_login();
			
			Amaz_Order_Page_P1 amaz_order=new Amaz_Order_Page_P1(driver);
			amaz_order.order_return();
			amaz_order.leavefeedback();
			amaz_order.fourstar();
			amaz_order.comment_order();
			amaz_order.submitResponse();
}

}
