package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseTest {
	public WebDriver driver;
    public HomePage homePage;
 
    public WebDriver getDriver() {
        return driver;
    }
 
    @BeforeClass
    public void classLevelSetup() {
        
        System.setProperty("webdriver.ie.driver", "D:\\Sanjay\\Selenium_Training\\Projects\\swtestacademy\\swreport\\driver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }
 
    @BeforeMethod
    public void methodLevelSetup() {
        homePage = new HomePage(driver);
    }
 
    @AfterClass
    public void teardown() {
        driver.quit();
    }

	

}
