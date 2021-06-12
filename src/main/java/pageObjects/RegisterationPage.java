package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterationPage {

	private WebDriver driver ;
	private WebDriverWait wait ;
	
	public RegisterationPage(WebDriver driver) {
		this.driver =driver;
	}
	
	private By firstNameField = By.id("FirstName");
	private By lastNameField = By.id("LastName");
	private By emailField = By.id("Email");
	
	public void registerUser(String firstName,String lastName,String email) {
		wait.until(ExpectedConditions.presenceOfElementLocated(firstNameField));
		driver.findElement(firstNameField).sendKeys(firstName);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(lastNameField));
		driver.findElement(firstNameField).sendKeys(lastName);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(emailField));
		driver.findElement(firstNameField).sendKeys(email);
	}

}
