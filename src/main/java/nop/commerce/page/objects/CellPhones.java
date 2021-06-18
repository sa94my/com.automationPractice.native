package nop.commerce.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CellPhones {
	private WebDriver driver;
	private By pageTitle = By.tagName("h1");

	public CellPhones(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public String getPageTitle() {
		return driver.findElement(pageTitle).getText();
	}
}
