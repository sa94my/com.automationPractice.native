package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandler {
	private  WebDriver driver ;
	private  Alert alert ;
	
	public AlertHandler(WebDriver driver) {
		this.driver = driver;
	}

	public  void acceptAlert() {
		alert =driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	public  String  getAlertText() {
		alert =driver.switchTo().alert();
		return alert.getText();
	}
	
	
}
