package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


public class ScrollTest extends TestBase{
	
	
	@Test
	public void scroll() {
		var aboutUsPageObject = homeObject.navigateToAboutUsPage();
		assertEquals(aboutUsPageObject.getPageTitle(), "About us", "wrong page or title changed");
	}
}
