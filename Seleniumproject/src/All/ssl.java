package All;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ssl {

	public static void main(String[] args) throws IOException {
				
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(src, new File("C:\\Users\\sujujj\\Desktop\\dw\\screenshot.png"));

	}

}
