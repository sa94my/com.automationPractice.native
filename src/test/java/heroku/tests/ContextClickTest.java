package heroku.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;



public class ContextClickTest extends TestBase{

	
	@Test
	public void contextClickTest() {
		var contxtPageObject = homeObject.navigateToContextMenuPage();
		
		var alertHandler =contxtPageObject.rightClickTargetDiv();
		String alertContent = alertHandler.getAlertText();
		alertHandler.acceptAlert();
		assertTrue(alertContent.contains("You selected a context"));
	}
	
}
