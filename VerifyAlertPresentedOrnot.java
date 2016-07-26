package webDriver;



import org.junit.Test;
import org.openqa.selenium.By;


public class VerifyAlertPresentedOrnot extends Repository
{

	@Test
	public void test() 
	{
		
		
		Applicationlaunch("http://www.air.irctc.co.in/IndianRailways/");
		
		//Click Search buttong Without fill any data 
		
		driver.findElement(By.xpath("//div[@onclick='submitSearch();']")).click();
		
		
		//If alert presented close alert box, if not generate report to log
		if(isAlerpresented())
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Aler is not presented");
		}
		
	
		
		
		
		
		
		
	}

}
