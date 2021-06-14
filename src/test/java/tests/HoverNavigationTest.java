package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import page.objects.CellPhones;

public class HoverNavigationTest extends TestBase{

	/*
	 * this test needs to be changed, it fails on headless browsers
	 */
	@Test
	public void method() {
		homeObject.hoverOverElectronics();
		 CellPhones cellPhonesPageObject ;
		cellPhonesPageObject = homeObject.chooseCellPhonesSubcategory();
		assertEquals(cellPhonesPageObject.getPageTitle(), "Cell phones");
	
	}

}
