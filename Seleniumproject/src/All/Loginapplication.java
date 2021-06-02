package All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objrep.loginobjs;
import objrep.loginobjs2pf;
import objrep.rediffhomepage;
import objrep.rediffhomepage2pf;

public class Loginapplication {

		
@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	loginobjs2pf lo= new loginobjs2pf(driver);
	lo.uname().sendKeys("reena");
	lo.upassword().sendKeys("rani");
	lo.usignin().click();
	
	rediffhomepage2pf rh= new rediffhomepage2pf(driver);
	rh.usearch().sendKeys("applie");
	rh.uTopStories().click();
	
	
	
}
		
		
		
		
		
		
		
		
		
		

	

}
