package heroku.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NestedFramesTest extends TestBase{

	
	@Test
	public void testFrameText() {
		var nestedFramesPageObject = homeObject.navigateToNestedFramesPage();
		String firstFrameText = nestedFramesPageObject.getFrameText("frame-top","frame-left");
		String secondFrameText = nestedFramesPageObject.getFrameText("frame-bottom");
		SoftAssert frameTextAssert = new SoftAssert();
		frameTextAssert.assertTrue(firstFrameText.equalsIgnoreCase("left"));
		frameTextAssert.assertEquals(secondFrameText, "BOTTOM");
		frameTextAssert.assertAll();

	}
	
	
	
	
	
}
