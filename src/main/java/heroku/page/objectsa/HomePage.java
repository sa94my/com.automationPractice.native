package heroku.page.objectsa;

public class HomePage extends PageBase{

	
	
	
	public void navigateToContextMenuPage() {
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
	}
	
	public void navigateToNestedFramesPage() {
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
	}
	
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com/");
		
	}
}
