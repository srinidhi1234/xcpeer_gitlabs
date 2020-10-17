package gitlabtc1type2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class gitlab_TC3_testng 
{

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://gitlab.com/users/sign_in");
			github_TC3_pom ln = new github_TC3_pom(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			ln.setusn("sritester");
			ln.setpass("$^!nidhi@123");
			ln.passbtn();
			driver.quit();
		}
		{
			
		}
	
		
	
}
