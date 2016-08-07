package abcpack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG1 {
	
  @Test(enabled=false)
  public void m2() {
	  System.out.println("HI m2");
	  //Assert.assertEquals("c", "d");
  }
  
  @Test
  public void m3()
  {
	  System.out.println("HI m3");
	  //Assert.assertEquals("d", "d");
  }
  
  @Test
  public void m1()
  {
	  System.out.println("HI m1");
	  //Assert.assertEquals("d", "d");
	  
  }
  
  @BeforeMethod()
  public void bm()
  {
	  System.out.println("Before Method");
  }
  
  @BeforeClass()
  public void bc()
  {
	  System.out.println("Before Class");
  }
  
  @AfterMethod()
  public void am()
  {
	  System.out.println("After Method");
  }
  
  @AfterClass()
  public void ac()
  {
	  System.out.println("After Class");
  }
  
}
