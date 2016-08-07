package webDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetTimeoutForAlert 
{

	@Test
	public void test() 
	{
		WebDriver driver=new FirefoxDriver();
		//Using Browser Class Set url at address bar
		driver.navigate().to("http://www.air.irctc.co.in/IndianRailways/");
		driver.manage().window().maximize();
		
		
		//Click Search buttong Without fill any data 
		
		driver.findElement(By.xpath("//div[@onclick='submitSearch();']")).click();
		
		
		
		driver.switchTo().alert().sendKeys("google");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		String alerttext=wait.until(ExpectedConditions.alertIsPresent()).getText();
		System.out.println(alerttext);
		
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		
		
		
		
	}

}
