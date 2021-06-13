package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver ;
	private WebDriverWait wait ;
	private Actions builder;
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	private By registerLink = By.className("ico-register");
	private By electronicsCategoryLink = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Electronics')]");
	private By cellPhonesSubCategory = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Cell phones')]");
	
	public RegisterationPage clickRegisterLink() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(registerLink));
		driver.findElement(registerLink).click();
		return new RegisterationPage(driver);
	}
	
	public void hoverOverElectronics() {
		builder = new Actions(driver);
		builder.moveToElement(driver.findElement(electronicsCategoryLink)).perform();
	}
	
	public CellPhones chooseCellPhonesSubcategory() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(cellPhonesSubCategory));
		driver.findElement(cellPhonesSubCategory).click();
		return new CellPhones(driver);
	}
	
	public NotebooksPage navigateToNotebooksPage() {
		driver.get("https://demo.nopcommerce.com/notebooks");
		return new NotebooksPage(driver);
	}
}
