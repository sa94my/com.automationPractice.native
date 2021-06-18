package heroku.page.objectsa;

import org.openqa.selenium.WebDriver;

public class PageBase {

	protected static WebDriver driver;
	
	public void setWebDriver(WebDriver driver) {
		PageBase.driver = driver;
	}
}
