package heroku.page.objectsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

	private WebDriver driver ;
	
	public NestedFramesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private void switchToNestedFrame(String ...frames) {
		for(String frame : frames) {
			driver.switchTo().frame(frame);
		}
	}
	
	public String getFrameText(String ...frameNames) {
		switchToNestedFrame(frameNames);
		String frameText =driver.findElement(By.tagName("body")).getText();
		driver.switchTo().defaultContent();
		return frameText;
	}
	
	
}
