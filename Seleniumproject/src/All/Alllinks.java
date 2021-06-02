package All;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Alllinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> links=	driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	//SoftAssert sf= new SoftAssert();
	
	
	for(WebElement link:links)
	{
		String url=link.getAttribute("href");
		HttpURLConnection con=    (HttpURLConnection)new URL(url).openConnection();

		con.setRequestMethod("HEAD");
		con.connect();
		int respcode=con.getResponseCode();
		System.out.println(respcode);
		if(respcode>400)
		{
			System.out.println("the link with text"+link.getText()+" is broken with code"+respcode);
			Assert.assertFalse(false);
		}
	}
	
	}

}
