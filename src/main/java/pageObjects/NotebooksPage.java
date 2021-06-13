package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotebooksPage {

	private WebDriver driver;
	private WebDriverWait wait ;
	private Select sortingDropDown ;

	
	public NotebooksPage(WebDriver driver) {
		this.driver =driver;
	}
	
	private By sortBy = By.id("products-orderby");
	private By firstProduct = By.xpath("(//div[@class='product-item'])[1]");
	
	
	public String getNameOfFirstProduct() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(firstProduct));
		return driver.findElement(firstProduct).getAttribute("data-productid");
	}
	
	/**
	 * 
	 * @param index values 0 to 5
	 */
	public void sortBy(int index) {
		sortingDropDown = new Select(driver.findElement(sortBy));
		sortingDropDown.selectByIndex(index);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(firstProduct)));
	}
	
	
}
