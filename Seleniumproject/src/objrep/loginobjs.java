package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginobjs {

	WebDriver driver;
	By username=By.xpath("//input[@id='login1']");
	
	By password= By.xpath("//input[@id='password']");
	By signin= By.name("proceed");
	
	
	
	public  loginobjs(WebDriver driver) {
		this.driver= driver;
	}
	public WebElement uname() {
		
		return driver.findElement(username);
	}
	
public WebElement upassword() {
		
		return driver.findElement(password);
	}
	
public WebElement usignin() {
	
	return driver.findElement(signin);
}
	
	
}
