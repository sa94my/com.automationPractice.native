package heroku.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import heroku.page.objectsa.PageBase;
import properties.BrowserProperties;
import utilities.Screenshot;

public class TestBase {

	private WebDriver driver ;
	

	@BeforeTest
	public void setUp() {
		//get browser type and options from properties file
		driver = BrowserProperties.getBrowserProperties();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		PageBase pageBaseObject = new PageBase();
		pageBaseObject.setWebDriver(driver);
	}
	
	@AfterMethod
	public void onFailure(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE) {
			Screenshot.takeScreenshot(result.getName());
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
