package webDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Repository 
{
	
	
	WebDriver driver;
	
	
	public void Applicationlaunch(String Appurl)
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Appurl);
		driver.manage().window().maximize();
	}
	
	
	
	
	public void launchBrowser(String browsername)
	{
		
		
		switch (browsername) 
		{
		case "ie":
			String filepath="D:\\SunilReddy\\Workspace_Week30\\browserDrivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver",filepath);
			driver=new InternetExplorerDriver();
			break;

		case "ff":
			driver=new FirefoxDriver();
			break;
			
			
		case "ch":
			String file="D:\\SunilReddy\\Workspace_Week30\\browserDrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",file);
			driver=new ChromeDriver();
			break;
			
		default:
			break;
		}
		
		
	}
	
	
	
	

	
	
	//Creating UserDefining Method to verify text presented on page
	
	public  boolean istextpresented(String Exptext)
	{
		
		//Where Expected text match with Actual text it return true for methodname, When
		//does't match return false to method name
		boolean b=driver.findElement(By.tagName("body")).getText().contains(Exptext);
		
		return b; //return true of false to method name
		
	}
	
	
	
	//Creating Userdefined method to verify text presented on soruce
	
	public boolean istextpresent_onsouce(String Exptext)
	{
		boolean b=driver.getPageSource().contains(Exptext);
		
		return b;
	}
	
	
	//Creating Userdefined method to verify title presented on page
	
	public boolean istitlepresented(String Exptitle)
	{
		boolean b=driver.getTitle().matches(Exptitle);
		
		return b;
	}
	
	
	
	//Creating Userdefined method to verify url prsented onpage
	public boolean isurlpresented(String Expurl)
	{
		boolean b=driver.getCurrentUrl().contains(Expurl);
		
		return b;
	}
	
	
	
	//Userdefinedmethodto handle no suchelement found exception
	
	public boolean isObjectExist(By prop)
	{
		try {
			
			driver.findElement(prop);
			return true;
			
		} catch (NoSuchElementException e) 
		{
			//System.out.println(e.getMessage());
			return false;
			
		}
		
	}
	
	
	
	//Userdefined method to verify alert presented or not
	//When alert presented really return value to method true, if alert not presented
	//return false value to methodname
	
	public boolean isAlerpresented()
	{
		
		try {
			
			driver.switchTo().alert();
			return true;
			
		} catch (NoAlertPresentException e) 
		{
			return false;
		}
	}
	
	
	
	//CaptureScreenShot
	
	public void catpurescreenshot(String filename)
	{

		try {
			
			//Set date format
			DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");
			Date d=new Date();
			String time=df.format(d);
			
			
			
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\SunilReddy\\Workspace_Week30\\screens\\"+filename+time+".png"));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	public static boolean ObjecCount(WebDriver driver,String Tagname,int ExpCount)
	{
		

		List<WebElement> Dropdowns=driver.findElements(By.tagName(Tagname));
		
		if(ExpCount==Dropdowns.size())
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	
	
	
}
