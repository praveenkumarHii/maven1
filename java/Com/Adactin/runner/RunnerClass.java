package Com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//Com//Adactin//feature",
glue = "Com.Adactin.stepdefnation",
 monochrome = true,
 dryRun = false,
 strict = true,
 plugin = {"html:Reports/HtmlReport",
		 "pretty",
		 "json:Reports/jsonReport.json",
		 "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
 })

public class RunnerClass {
       public static WebDriver driver;// This is null----1
	
	@BeforeClass
	public static void Setup() {   //private Should be Change public
		System.setProperty("webdriver.chrome.driver",".\\Driver1\\chromedriver.exe"); 
		 driver = new ChromeDriver();//Webdriver Remove and Chenged the Driver Blue Colore
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void FearDown() { //private Should Be Change in public
		driver.close();//Driver not add this try to Webdriver add---2
		
        
		
	}

}
