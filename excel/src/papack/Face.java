package papack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelp.ExcelDataConfig;

public class Face {
	
	WebDriver driver;
	
	@BeforeTest
	public void Url() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenuim\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://facebook.com/");
	}
	
	@Test(dataProvider="fblogin")
	public void Verify(String username,String password) throws InterruptedException
	{
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	@DataProvider(name="fblogin")
	public Object[][] loginData() throws IOException 
	{

		  ExcelDataConfig config=new ExcelDataConfig("D:\\selenuim\\fbsheet.xlsx ");
		  int rows=config.getRowcount(0);
		  Object[][] data = new Object[rows][2];
		  for(int i=0;i<rows;i++)
		  {
		  data[i][0]=config.getData(0,i,0);
		  data[i][1]=config.getData(0,i,1);
		  }
		  return data;
	}
	
	
}
