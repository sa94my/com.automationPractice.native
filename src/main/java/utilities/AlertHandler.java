package utilities;

import org.openqa.selenium.Alert;

import heroku.page.objectsa.PageBase;

public class AlertHandler extends PageBase{
	
	private static Alert alert ;
	
	

	public static void acceptAlert() {
		alert =driver.switchTo().alert();
		alert.accept();
		
	}
	
	
	public static String  getAlertText() {
		alert =driver.switchTo().alert();
		return alert.getText();
	}
	
	
}
