package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script1 {

	public static void main(String[] args) 
	{


		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Enter Text in Firstname Field
		
		driver.findElement(By.id("u_0_1")).clear();
		driver.findElement(By.id("u_0_1")).sendKeys("NewUser");
		
		
		/*
		 * Example:---> Select Dropdown Options Using Webdriver
		 */
		
		//Select Dropdown using Visible Text
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
		
		//Select Droddown using Value
		new Select(driver.findElement(By.id("day"))).selectByValue("12");
		
		//Select dropdown option Using Index number
		new Select(driver.findElement(By.id("year"))).selectByIndex(26);
		

	}

}
