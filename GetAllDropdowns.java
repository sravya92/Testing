package webDriver;



import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllDropdowns 
{

	@Test
	public void test() 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
	/*	if(Repository.ObjecCount(driver, "select", 3))
		{
			System.out.println("Match with Expected count");
		}
		else
		{
			System.out.println("does't match with expected count");
		}
		*/
		
		
		
		//Get Dropdown available in to List of Webelement
		List<WebElement> Dropdowns=driver.findElements(By.tagName("select"));
		
		System.out.println(Dropdowns.size());
		
		
		//Iterate Number of Dropdown times
		for (WebElement eachdropdown : Dropdowns) 
		{
			//Get Each dropdown ID'
			String propid=eachdropdown.getAttribute("id");
			
			//Using ID Select EachDropdown option
			new Select(driver.findElement(By.id(propid))).selectByIndex(1);
			
			
		}
		
		
		
		//Using for loop
		
		for (int i = 0; i < Dropdowns.size(); i++) 
		{
			//Get each element from Array
			String prop=Dropdowns.get(i).getAttribute("id");
			
			//Using ID Select EachDropdown option
			new Select(driver.findElement(By.id(prop))).selectByIndex(2);
			
			
		}
		
		
		
		
		//While loop
		
	    Iterator it=Dropdowns.iterator();
	    
	   
	    int j=0;  //counter value
	    while(it.hasNext())      //Iterate until it has next value
	    {
	    	
	    	it.next();   //Get Each value from iterator
	    	
	    	//to select 3 option in Array
	    	if(j==2)
	    	{
	    		//Get each element from Array
				String prop=Dropdowns.get(j).getAttribute("id");
				
				//Using ID Select EachDropdown option
				new Select(driver.findElement(By.id(prop))).selectByIndex(3);
	    	}
	    	j=j+1;   //increase Manual counter
	    }
		
		
		
		
		
	}

}
