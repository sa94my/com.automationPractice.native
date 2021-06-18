package heroku.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import heroku.page.objectsa.HomePage;
import properties.BrowserProperties;

public class TestBase {

	private WebDriver driver ;
	protected HomePage homeObject;
	
	@BeforeClass
	public void setUp() {
		//get browser type and options from properties file
		driver = BrowserProperties.getBrowserProperties();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		homeObject = new HomePage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
