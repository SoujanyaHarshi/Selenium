package testRunner;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.runner.RunWith;
//import com.cucumber.listener.Reporter;

//import accelerators.ActionsClass;
//import accelerators.Base;
import cucumber.api.CucumberOptions;
//import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
//import seleniumgluecode.Accounts;
//import utility.Log;
//import utility.Utils;


@RunWith(Cucumber.class)
@CucumberOptions(
  //features ="src/test/java/features",
  features ="src/test/resources/features/mavenfeatures.feature",
  //features ="src/test/java/features/CompanySetting.feature",
//  features ="src/test/java/features/SigningSession.feature",
//  features ="src/test/java/features/Dashboard.feature",
//  features ="src/test/java/features/Administration.feature",
  glue= "CucumP"
  //tags= {"~@Admin","~@NotWorking","@Working"},
 // plugin = {"com.cucumber.listener.ExtentReport:target/cucumber-reports/report.html"}, 
 //plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
 // monochrome = true
  )

public class Runner {

	
}
