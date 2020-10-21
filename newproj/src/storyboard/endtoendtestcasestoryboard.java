package storyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class endtoendtestcasestoryboard 
{
	public WebDriver driver;
	@BeforeMethod
	public void Openappl()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.storeboard.com/log-in/");
	}
	@AfterMethod
	public void cloaseappl()
	{
		driver.close();
		
	}
}
