package webDriver;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {
	public WebDriver driver;

	@Test
	public void test() 
	{
		
		
		

		driver=new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		try {
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\SunilReddy\\Workspace_Week30\\screens\\Image.png"));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		/*
		 * Note:-->   Add Try catch block before writing script
		 * 			  Store Captured Screenshot into file format
		 * 			  Fileutils import from apache.commons.io package
		 * 			  Destination file define into file format
		 * 			  Extension:--> png--> portable network graphic
		 */
		
	}
	
	@Test
	public void SreenshotAlongwithTimestamp() 
	{
		
		
		

		driver=new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		
		
		try {
			
			//Set date format
			DateFormat df=new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss");
			Date d=new Date();
			String time=df.format(d);
			
			
			
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\SunilReddy\\Workspace_Week30\\screens\\Image"+time+".png"));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		/*
		 * Note:-->   Add Try catch block before writing script
		 * 			  Store Captured Screenshot into file format
		 * 			  Fileutils import from apache.commons.io package
		 * 			  Destination file define into file format
		 * 			  Extension:--> png--> portable network graphic
		 */
		
	}

}
