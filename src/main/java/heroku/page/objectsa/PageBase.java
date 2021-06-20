package heroku.page.objectsa;

import org.openqa.selenium.WebDriver;

public class PageBase {
	/*
	 * with two different techniques to pass the driver instance
	 * 1-static object of a parent class
	 * 2-getter method
	 */
	protected static WebDriver driver;
	
	public void setWebDriver(WebDriver driver) {
		PageBase.driver = driver;
	}
	
	public  WebDriver getDriver() {
		return driver ;
	}
}
