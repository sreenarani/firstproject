package All;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]"));
	driver.manage().window().maximize();
	List<WebElement> total=driver.findElements(By.xpath("//tr/td[1]"));
	List<String> originallist=total.stream().map(s->s.getText()).collect(Collectors.toList());

	List<String> sortedlist=originallist.stream().sorted().collect(Collectors.toList());
	
	
	
	

	}

}
