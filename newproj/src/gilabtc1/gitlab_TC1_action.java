package gilabtc1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class gitlab_TC1_action extends gitlab_TC1_generic
{
	@Test
	public void logintest()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement user_txtfld = driver.findElement(By.xpath("//input[@id='user_login']"));
		WebElement pass_txtfld = driver.findElement(By.xpath("//input[@id='user_password']"));
		WebElement login_btn = driver.findElement(By.xpath("//input[@class='btn btn-success']"));
		
		user_txtfld.sendKeys("sritester"); //to enter username into username textfield
		pass_txtfld.sendKeys("$^!nidhi@123"); //to enter password into password textfield
		login_btn.click(); 					//to click on login button
		
		String actualurl = "https://gitlab.com/users/sign_in";
		String expectedurl = driver.getCurrentUrl();
		
		if(actualurl.equalsIgnoreCase(expectedurl))
		{
			System.out.println("Login test case pass");
		}
		else
		{
			System.out.println("Login test case failed");
		}
		
	}
}
