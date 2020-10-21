package storyboard;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class endtoendstoryboardcompleteactions extends endtoendtestcasestoryboard
{
	@Test
	public void logintest()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='LoginUID']")).sendKeys("sree.tester123@gmail.com");
		driver.findElement(By.xpath("//input[@name='LoginPWD']")).sendKeys("sree123456");
		driver.findElement(By.xpath("//a[.='Log In']")).click();
		driver.findElement(By.xpath("//img[@alt='Site Logo']")).click();
		driver.findElement(By.xpath("//textarea[@id='StatusUpdate']")).sendKeys("welcome to test world");
		driver.findElement(By.xpath("//a[.='SHARE']")).click();
		driver.findElement(By.xpath("")).click();
		WebElement ele = driver.findElement(By.xpath("//a[.='Profile']"));
		Actions act = Actions(driver);	
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='View Profile']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
}

	private Actions Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
