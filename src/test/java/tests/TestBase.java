package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.HomePage;

public class TestBase {

	private WebDriver driver ;
	protected HomePage homeObject;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		homeObject = new HomePage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
