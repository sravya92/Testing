package webDriver;


import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover 
{
	public WebDriver driver;
	//@Test
	public void HoverItem() throws Exception 
	{
		
		driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		
		Thread.sleep(10000);
		
		
		WebElement element=driver.findElement(By.xpath("//a[@data-tracking-id='electronics']"));
		
		//Crating action class object 
		Actions action=new Actions(driver);
		
		//movie to element build cursor on element
		action.moveToElement(element).build().perform();
		
		//Wait for element o visisble
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("HP"))).click();
		
	}
	
	@Test
	public void MouseHoverUsingLocator() throws Exception 
	{
		
		driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		
		Thread.sleep(10000);
		
		
		WebElement element=driver.findElement(By.xpath("//a[@data-tracking-id='electronics']"));
		
		//locating webElement
		Locatable hover=((Locatable)element);
		//Get mouse controls on browser session
		Mouse mouse=((HasInputDevices)driver).getMouse();
		//lets move mouse to webelement
		mouse.mouseMove(hover.getCoordinates());
		
		
		
		
		//Wait for element o visisble
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("HP"))).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@value,'range%5B%5D=Rs.+60001+and+Above')]"))).click();
		
		
		
		
	}
	
	
	@Test
	public void Hoverrobotclass()
	{
		
		
	
		
		
	}

}
