package webDriver;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	@Test
	public void test() 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//Wait and Switch to frame
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(".//*"
				+ "[@id='content']/iframe")));
		
		//Target location
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		//Enable Action class
		Actions action=new Actions(driver);
		
		//Drag objet and Drop
		action.clickAndHold(src).moveToElement(dst).release(src).perform();
		
		
		
		if(dst.getText().matches("Dropped!"))
		{
			System.out.println("Object Dropped at specified location");
		}
		
		
		
		
	}

}
