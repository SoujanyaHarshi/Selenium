package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class User {
WebDriver driver;
	
	@Test
	public void Signup() throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","D:\\selenuim\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("http://onesevenhome.com/#/");
	driver.switchTo().alert().sendKeys("oshuser" +Keys.TAB +"oshuser");
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("(//a[@class='right-links'])[2]")).click();
	//driver.findElement(By.xpath("(//a[@class='right-links'])[2]")).click();
	driver.findElement(By.name("userName")).sendKeys("soujanya.mongolu@gmail.com");
    //driver.findElement(By.name("password")).sendKeys("Rahul@1881");
	driver.findElement(By.xpath("(//input[@type='password'])[last()]")).sendKeys("Rahul@1881");;
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	TakesScreenshot s=((TakesScreenshot)driver);
	File src=s.getScreenshotAs(OutputType.FILE);
	File d=new File("D:\\selenuim\\selenium\\test.png");
	FileUtils.copyFile(src, d);
	//driver.findElement(By.xpath("//a[@href='#/myaccount']")).click();
	//driver.findElement(By.xpath("//a[@href='#/myaccount']")).click();
	
	
	
	
	
	}
}