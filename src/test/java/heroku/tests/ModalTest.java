package heroku.tests;

import org.testng.annotations.Test;

import heroku.page.objectsa.EntryAddPage_ModalWindow;
import heroku.page.objectsa.HomePage;
import utilities.WindowControl;

public class ModalTest extends TestBase{

	@Test
	public void switchWindowAndCheckModal() {
		HomePage homeObject = new HomePage();
		homeObject.goHome();
		WindowControl.openLinkInNewTab("Entry Ad");
		WindowControl.switchToWindow_ByHeaderText("Entry Ad", "h3");
		var entryAddPage = new EntryAddPage_ModalWindow();
		System.out.println(entryAddPage.getModalHeaderText());
		entryAddPage.closeModalWindow();
		

	}
	
}
