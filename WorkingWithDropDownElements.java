package webDriver;



import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownElements
{

	@Test
	public void test() 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Targeting dropdown element
		WebElement dmonth=driver.findElement(By.id("month"));
		
		//Target with Select class
		Select month=new Select(dmonth);
		
		//get options avaialbel and store as list of webelements
		List<WebElement> doptions=month.getOptions();
		
		
		//count of Array 
		
			int arraycount=doptions.size();
			System.out.println(arraycount);
			
			
			
			for (WebElement eachoption : doptions) 
			{
				//Click each option available at dropdown
				eachoption.click();
			
				
			}
		
		
		
		
		
		
	}

}
