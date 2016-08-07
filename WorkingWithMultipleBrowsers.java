package webDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WorkingWithMultipleBrowsers {

	//@Test
	public void WorkingWithIntenetExplorerDriver() 
	{
		
		
		String filepath="D:\\SunilReddy\\Workspace_Week30\\browserDrivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",filepath);
		
		WebDriver ie=new InternetExplorerDriver();
		ie.get("http://hotmail.com");
		ie.manage().window().maximize();
		
		ie.findElement(By.name("i0116")).clear();
		ie.findElement(By.name("i0116")).sendKeys("sampleusername@outlook.com");
		
	}
	
	//@Test
	public void WorkingwithChromeDriver()
	{

		/*
			 * ChromeBrowser:-->
			 * Downloads Required:-->
			 * 					* Official website  http://seleniumhq.org
			 * 					* Click on Download
			 * 					* Under Third Party Drivers, Bindings, and Plugins
			 * 					* Click on google ChromeDriver
			 * 					* Click on Latest release chromedriverv1.0
			 * 					* Again click on Latest release chromedriverv1.0 in downloads page
			 * 					* Download ChromDriverwin32.Zip file					
			 */
		
		String filepath="D:\\SunilReddy\\Workspace_Week30\\browserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filepath);
		
		
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");
		chrome.manage().window().maximize();
		
		
		chrome.findElement(By.name("q")).clear();
		chrome.findElement(By.name("q")).sendKeys("Chrombrowser is up and running");
		
	}
	
	@Test
	public void WorkingWith_HtmlUnitDriver()
	{
		
		WebDriver html=new HtmlUnitDriver();
		html.get("http://google.com");
		String pagetitle=html.getTitle();
		System.out.println(pagetitle);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
