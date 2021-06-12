package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.CellPhones;

public class HoverNavigationTest extends TestBase{
	CellPhones cellPhonesPageObject ;

	@Test
	public void method() {
		homeObject.hoverOverElectronics();
		cellPhonesPageObject = homeObject.chooseCellPhonesSubcategory();
		assertEquals(cellPhonesPageObject.getPageTitle(), "Cell phones");
	
	}

}
