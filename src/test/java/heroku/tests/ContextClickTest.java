package heroku.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import heroku.page.objectsa.ContextMenuPage;
import heroku.page.objectsa.HomePage;
import utilities.AlertHandler;



public class ContextClickTest extends TestBase{

	
	@Test
	public void contextClickTest() {
		HomePage homeObject = new HomePage();
		homeObject.navigateToContextMenuPage();
		var contxtPageObject = new ContextMenuPage();
		contxtPageObject.rightClickTargetDiv();
		String alertContent = AlertHandler.getAlertText();
		AlertHandler.acceptAlert();
		assertTrue(alertContent.contains("You selected a context"));
	}
	
}
