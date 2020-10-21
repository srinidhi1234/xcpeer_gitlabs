package storyboard;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class endtoendtestcasetesngaction extends endtoendtestcasestoryboard
{
	@Test
	public void logintest()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement user_txtfld = driver.findElement(By.xpath("//input[@name='LoginUID']"));
		WebElement pass_txtfld = driver.findElement(By.xpath("//input[@name='LoginPWD']"));
		WebElement login_btn = driver.findElement(By.xpath("//a[.='Log In']"));
		
		user_txtfld.sendKeys("sree.tester123@gmail.com"); //to enter username into username textfield
		pass_txtfld.sendKeys("sree123456"); //to enter password into password textfield
		login_btn.click(); 					//to click on login button
		
		String actualurl = "https://www.storeboard.com/premiumpackages/";
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
