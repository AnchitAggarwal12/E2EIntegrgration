package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	@Test
	public void tc001()
	{
		System.setProperty("web'driver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("ancgita45@gmail.com");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
}
