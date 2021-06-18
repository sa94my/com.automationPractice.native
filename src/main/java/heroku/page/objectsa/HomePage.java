package heroku.page.objectsa;

import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver ;
	
	public HomePage(WebDriver driver) {
		this.driver = driver ;
	}
	
	
	
	public ContextMenuPage navigateToContextMenuPage() {
		driver.get("https://the-internet.herokuapp.com/context_menu");
		return new ContextMenuPage(driver); 
	}
	
	public NestedFramesPage navigateToNestedFramesPage() {
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		return new NestedFramesPage(driver); 
	}
}
