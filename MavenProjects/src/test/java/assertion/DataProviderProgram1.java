package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram1 {
@ DataProvider(name="data1")
public Object testdata1() {
	return new Object[][] {{"shoe"},{"mobile"},{"webcamera"},{"laptop"},{"pencil"},{"pen"},{"tablet"}};
	
}

@ DataProvider(name="data2")
public Object testdata2() {
	return new Object[][] {{11},{114},{44},{987},{789}};
	
}

@ DataProvider(name="data3")
public Object testdata3() {
	return new Object[][] {{"MahatmaGandhiji"},{"JawaharlalNehru"},{"RajivGandhi"},{"SoniaGandhi"},{"Rabindranath Tagore"},{"MGR"},{"Subash ChandrBose "},{"Jayalalitha"},{"Karunanidhi"},{"Barathiyar"}};
	//return Object[][] {{"MahatmaGandhiji"},{"JawaharlalNehru"},{"RajivGandhi"},{"SoniaGandhi"},{"RabindranathTagore"},{"MGR"},{"Karunanidhi"},{"Jayalalitha"},{"SubashChandraBose"},{"Barathiyar"}};
	
}
	
@ Test(dataProvider="data3")
public void amazon_search(String input) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys(input);
	search.sendKeys(Keys.ENTER);
		if (input=="MahatmaGandhiji") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"MahatmaGandhiji - Google Search","Successfully launched");
		}
	if (input.equals("JawaharlalNehru")) {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"JawaharlalNehru - Google Search","Successfully launched");
	}
	if (input=="RajivGandhi") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"RajivGandh - Google Search","Successfully launched");
	}	
	if (input=="SoniaGandhi") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"SoniaGandhi - Google Search","Successfully launched");
	}
	if (input=="Rabindranath Tagore") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Rabindranath Tagore - Google Search","Successfully launched");
	}
	if (input=="MGR") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"MGR - Google Search","Successfully launched");
	}
	if (input=="Subash ChandrBose") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Subash ChandrBos - Google Search","Successfully launched");
	}
	if (input=="Jayalalitha") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Jayalalitha - Google Search","Successfully launched");
	}
	if (input=="Karunanidhi") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Karunanidhi - Google Searc","Successfully launched");
	}
	if (input=="Barathiyar") {
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Barathiyar - Google Search","Successfully launched");
	}
	}
}
