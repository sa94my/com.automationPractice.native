package heroku.page.objectsa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.AlertHandler;

public class ContextMenuPage {

	private WebDriver driver ;
	private By targetBox = By.id("hot-spot");
	
	public ContextMenuPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public AlertHandler rightClickTargetDiv() {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(targetBox)).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.alertIsPresent());

		return new AlertHandler(driver);
	}
}
