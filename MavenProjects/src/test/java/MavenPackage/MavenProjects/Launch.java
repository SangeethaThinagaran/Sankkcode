package MavenPackage.MavenProjects;

import org.testng.annotations.Test;

//import org.junit.Test;

public class Launch {
@Test(priority=1)
public void login() {
	System.out.println("Login");
	}
@Test
public void logout() {
	System.out.println("logout");
}
@Test
public void arm() {
	System.out.println("arm");
}
}
