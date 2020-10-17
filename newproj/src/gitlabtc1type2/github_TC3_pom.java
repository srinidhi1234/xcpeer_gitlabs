package gitlabtc1type2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class github_TC3_pom 
{
	
		@FindBy(xpath = "//input[@id='user_login']") 
		private WebElement untbx;
		
		@FindBy(xpath="//input[@id='user_login']")
		private WebElement passbx;
		
		@FindBy(xpath = "//input[@class='btn btn-success']")
		private WebElement lognbtn;
		
		public github_TC3_pom(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void setusn(String usn)
		{
			untbx.sendKeys(usn);
		}
		public void setpass(String pwd)
		{
			passbx.sendKeys(pwd);
		}
		public void passbtn()
		{
			lognbtn.click();
		}
	}
}
