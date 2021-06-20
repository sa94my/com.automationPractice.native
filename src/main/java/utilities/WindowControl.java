package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import heroku.page.objectsa.PageBase;

public class WindowControl {
	
	private static WebDriver driver ;
	static PageBase pageBaseObject = new PageBase();
	
	public static void openLinkInNewTab(String linkText) {
		driver = pageBaseObject.getDriver();
		Actions actionBuilder = new Actions(driver);
		actionBuilder.keyDown( Keys.CONTROL).click(driver.findElement(By.linkText(linkText))).build().perform();
	}
	
	public static boolean switchToWindow_ByHeaderText(String headerText,String headerTag) {
		driver = pageBaseObject.getDriver();
		var windows = driver.getWindowHandles();
		for(String window : windows ) {
			driver.switchTo().window(window);
			var headerElements = driver.findElements(By.tagName(headerTag));
			for(WebElement headerElement : headerElements) {
				if(headerElement.getText().equalsIgnoreCase(headerText))
					return true;
			}
		}
		return false;
	}
	
	public static boolean switchToWindow_ByTitle(String tabTitle) {
		driver = pageBaseObject.getDriver();
		var windows = driver.getWindowHandles();
		for(String window : windows ) {
			driver.switchTo().window(window);
			var currentPageTitle = driver.getTitle();
				if(currentPageTitle.equalsIgnoreCase(tabTitle))
					return true;
			
		}
		return false;
	}
}
