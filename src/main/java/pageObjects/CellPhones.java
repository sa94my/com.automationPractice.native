package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CellPhones {
	private WebDriver driver;
	
	public CellPhones(WebDriver driver) {
		this.driver=driver;
	}
	
	private By pageTitle = By.tagName("h1");
	
	
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}
}
