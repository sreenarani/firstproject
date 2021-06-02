package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginobjs2pf {

	WebDriver driver;
	//By username=By.xpath("//input[@id='login1']");
	//	By password= By.xpath("//input[@id='password']");
//	By signin= By.name("proceed");
	
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signin;
	
	
	
	
	public  loginobjs2pf(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement uname() {
		
		return username ;
	}
	
public WebElement upassword() {
		
		return password;
	}
	
public WebElement usignin() {
	
	return signin;
}
	
	
}
