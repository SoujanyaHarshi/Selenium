package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Objects {
  
	public static final By name= By.name("email");
	public static final By pswd=By.name("pass");
	public static final By btn=By.xpath("//input[@value='Log In']");
}
