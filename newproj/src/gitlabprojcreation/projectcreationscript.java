package gitlabprojcreation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class projectcreationscript {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gitlab.com/users/sign_in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("sritester");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("$^!nidhi@123");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='qa-your-projects-link']")).click();
		driver.findElement(By.xpath("//a[.='New project']")).click();
		driver.findElement(By.xpath("(//h3[@class='blank-state-title experiment-new-project-page-blank-state-title'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='project_name']")).sendKeys("my project");
		driver.findElement(By.xpath("//textarea[@id='project_description']")).sendKeys("My project is with respect to test github");
		driver.findElement(By.xpath("//input[@value='Create project']")).click();
		
	}

}
