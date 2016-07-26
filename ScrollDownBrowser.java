package webDriver;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;

public class ScrollDownBrowser
{
	public WebDriver driver;

	@Test
	public void test() 
	{
	
		
		

		driver=new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		
		WebElement element=driver.findElement(By.xpath("//a[@href='http://www.flipkart.com']"));
		
		Actions action=new Actions(driver);
		
		//Take Control to window, use End keys to view Page End
		action.sendKeys(Keys.ESCAPE).perform();
		
		//locate elemnet get mouse and keyboard controls
		Locatable rclick=((Locatable)element);
		Mouse mouse=((HasInputDevices)driver).getMouse();
		Keyboard kb=((HasInputDevices)driver).getKeyboard();
		
		
		mouse.mouseMove(rclick.getCoordinates());
		
		
		
	}

}
