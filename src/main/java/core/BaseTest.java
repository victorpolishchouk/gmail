package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeSuite
	public void StartDriver () {
		driver = new FirefoxDriver();
	}
	
	@AfterSuite
	public void ShutDownDriver () {
		driver.quit();
	}

}
