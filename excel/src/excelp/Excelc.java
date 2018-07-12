package excelp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelc {

	WebDriver driver;
	
	@BeforeClass
	public void Url() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenuim\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://onesevenhome.com/");
	    Thread.sleep(2000);
	     driver.switchTo().alert().sendKeys("oshuser" + Keys.TAB + "oshuser");
	     driver.switchTo().alert().accept();
	}
	
	@Test(dataProvider="userlogin",priority=0)
	public void Verify(String username,String password) throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//a[@class='right-links'])[2]")).click();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	
	@DataProvider(name="userlogin")
	public Object[][] loginData() throws IOException 
	{

		  ExcelDataConfig config=new ExcelDataConfig("D:\\selenuim\\logins.xlsx");
		  int rows=config.getRowcount(0);
		  Object[][] data = new Object[rows][2];
		  for(int i=0;i<rows;i++)
		  {
		  data[i][0]=config.getData(0,i,0);
		  data[i][1]=config.getData(0,i,1);
		  }
		  return data;
	}	  
	
	  @AfterMethod(enabled=false)
	  
	  public void tearDown()
	  {
	  driver.quit();
	  }
	
	  @AfterMethod
		public void logout() throws InterruptedException {
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//span[text()='soujanya mongolu']")).click();
			driver.findElement(By.xpath("//*[@class='login-btn ng-binding']")).click();	
			Thread.sleep(5000);
			driver.findElement(By.linkText("Log Out")).click();
		
			
		
		}

}
