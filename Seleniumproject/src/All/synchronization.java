package All;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class synchronization {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
	Set<String> win=driver.getWindowHandles();
Iterator<String> it= win.iterator();
String parId=it.next();
driver.switchTo().window(it.next());
System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
driver.switchTo().window(parId);
System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

		
		

}}
