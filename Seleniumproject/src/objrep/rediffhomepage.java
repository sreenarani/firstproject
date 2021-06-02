package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffhomepage {

	WebDriver driver;
		
	public  rediffhomepage(WebDriver driver) {
		this.driver= driver;
	}
	By Search=By.xpath("//input[@id='srchword']");
	By Topstories= By.xpath("//div[@class='tabs active']");
	
public WebElement usearch() {
		
		return driver.findElement(Search);
	}
public WebElement uTopStories() {
	
	return driver.findElement(Topstories);
}

	
}
