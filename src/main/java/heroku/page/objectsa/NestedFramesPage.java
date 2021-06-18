package heroku.page.objectsa;

import org.openqa.selenium.By;

public class NestedFramesPage extends PageBase{

	
	
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
