package UIPackageMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTestNG {	
	
	public String baseUrl = "https://app.firstrain.com";
    String driverPath = "D:\\Home\\Yogita\\Workspace\\UIproject\\DriverExe\\geckodriver.exe";
    public WebDriver driver ; 
	
	 @BeforeTest
	 public void launchBrowser () {
	 System.out.println("launching firefox browser"); 
     System.setProperty("webdriver.gecko.driver", driverPath);
     driver = new FirefoxDriver();
     driver.get(baseUrl);
     
	 }
	     
	  
  @Test  
  public void verifyHomepageTitle() {
      
     
     String expectedTitle = "FirstRain Orion";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
  }
     
     @AfterTest
     public void terminatebrowser() {
     driver.close();
     }
}
