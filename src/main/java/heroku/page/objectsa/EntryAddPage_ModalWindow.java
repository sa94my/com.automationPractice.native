package heroku.page.objectsa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAddPage_ModalWindow extends PageBase{
	

	By modalWindowLocator = By.className("modal");
	By modalWindow_Header = By.tagName("h3");
	By modalWindow_CloseButton = By.cssSelector("div.modal-footer p");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

	
	public String getModalHeaderText() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindowLocator)));
		return driver.findElement(modalWindowLocator).findElement(modalWindow_Header).getText();
	}
	
	public void closeModalWindow() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindowLocator)));
		driver.findElement(modalWindow_CloseButton).click();
	}
}
