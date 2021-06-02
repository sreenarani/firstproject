package All;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelwebsite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	List<WebElement> l=	driver.findElements(By.cssSelector(".day"));
	int count=driver.findElements(By.cssSelector(".day")).size();
	
	for(int i=0; i<count;i++) {
		
		String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
		if(text.equalsIgnoreCase("25"))
		{
			driver.findElements(By.cssSelector(".day")).get(i).click();
			break;
		}
	}
		
	}

}
