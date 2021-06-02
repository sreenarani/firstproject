package All;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkstest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));

WebElement coldriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));

for(int i=1; i<coldriver.findElements(By.tagName("a")).size();i++) {
	String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	coldriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	Thread.sleep(5000);
	
	Set<String> titles=driver.getWindowHandles();
	Iterator<String> it=titles.iterator();
	
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}


	}

	

}
