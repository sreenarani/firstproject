package All;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksopenornot {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
String url=	driver.findElement(By.cssSelector("a[href*='Soapui']")).getAttribute("href");
HttpURLConnection con=    (HttpURLConnection)new URL(url).openConnection();

con.setRequestMethod("HEAD");
con.connect();
int respcode=con.getResponseCode();
System.out.println(respcode);

		
		

	}

}
