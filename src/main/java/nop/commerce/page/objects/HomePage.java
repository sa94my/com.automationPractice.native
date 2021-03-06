package nop.commerce.page.objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver ;
	private WebDriverWait wait ;
	
	private By registerLink = By.className("ico-register");
	private By electronicsCategoryLink = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Electronics')]");
	private By cellPhonesSubCategory = By.xpath("//ul[contains(@class,'notmobile')] //a[contains(.,'Cell phones')]");
	private By aboutUsLink = By.xpath("//a[contains(.,'About us')]");
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	

	
	public RegisterationPage clickRegisterLink() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(registerLink));
		driver.findElement(registerLink).click();
		return new RegisterationPage(driver);
	}
	
	public void hoverOverElectronics() {
		Actions builder;
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
	
	public AboutUsPage navigateToAboutUsPage() {
		driver.findElement(aboutUsLink).click();
		return new AboutUsPage(driver);
	}
}
