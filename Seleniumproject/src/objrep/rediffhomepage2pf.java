package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffhomepage2pf {

	WebDriver driver;
		
	public  rediffhomepage2pf(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	//By Search=By.xpath("//input[@id='srchword']");
//	By Topstories= By.xpath("//div[@class='tabs active']");
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement Search;
	
	@FindBy(xpath="//div[@class='tabs active']")
	WebElement Topstories;
	
	
public WebElement usearch() {
		
		return Search;
	}
public WebElement uTopStories() {
	
	return Topstories;
}

	
}
