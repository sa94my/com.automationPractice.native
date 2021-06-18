package heroku.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import heroku.page.objectsa.PageBase;
import properties.BrowserProperties;

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
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
