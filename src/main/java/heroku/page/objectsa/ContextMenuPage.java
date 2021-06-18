package heroku.page.objectsa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage extends PageBase{

	private By targetBox = By.id("hot-spot");

	public void rightClickTargetDiv() {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(targetBox)).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.alertIsPresent());

	}

}
