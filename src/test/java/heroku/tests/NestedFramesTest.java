package heroku.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import heroku.page.objectsa.HomePage;
import heroku.page.objectsa.NestedFramesPage;

public class NestedFramesTest extends TestBase{

	
	@Test
	public void testFrameText() {
		HomePage homeObject= new HomePage();
		homeObject.navigateToNestedFramesPage();
		NestedFramesPage nestedFramesPageObject = new NestedFramesPage();
		String firstFrameText = nestedFramesPageObject.getFrameText("frame-top","frame-left");
		String secondFrameText = nestedFramesPageObject.getFrameText("frame-bottom");
		SoftAssert frameTextAssert = new SoftAssert();
		frameTextAssert.assertTrue(firstFrameText.equalsIgnoreCase("left"));
		frameTextAssert.assertEquals(secondFrameText, "BOTTOM");
		frameTextAssert.assertAll();
	}
	
	
	
	
	
}
