package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HoverNavigationTest extends TestBase{

	/*
	 * this test needs to be changed, it fails on headless browsers
	 */
	@Test
	public void method() {
		homeObject.hoverOverElectronics();
		var cellPhonesPageObject = homeObject.chooseCellPhonesSubcategory();
		assertEquals(cellPhonesPageObject.getPageTitle(), "Cell phones");
	}

}
