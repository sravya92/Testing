package webDriver;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidationCommands extends Repository
{

	@Test
	public void VerifyErrorTextDisplayedAt_LoginInvalid() throws Exception
	{
		
		
		//launch Application from Repostiory Class
		Applicationlaunch("http://hotmail.com");
		
		
		//Click Sign In button Without Fill Usernamd and password
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		
		
		
			Thread.sleep(5000);
	
		
		//target Error message
		WebElement ErrText=driver.findElement(By.xpath("//div[@id='idTd_PWD_ErrorMsg_Username']"));
		
		//Expected Behaviour Error Message Should Display 
		if(ErrText.isDisplayed())
		{
			System.out.println("Error message Displayed as \n"+ErrText.getText());
		}
		else
		{
			System.out.println("Expected Error Text not displayed at home page");
		}
		
		
		
		driver.quit();
		
		
		
		
	}

}
