package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.NotebooksPage;

public class SortingTest extends TestBase{

	NotebooksPage notebooksPageObject ;
	SoftAssert soft = new SoftAssert();
	int sortingMethod = 3; // price low to high,when changed change first product id accordingly
	String dataProductId = "7";
	@Test
	public void testSorting() {
		notebooksPageObject = homeObject.navigateToNotebooksPage();
		
		soft.assertEquals(notebooksPageObject.getNameOfFirstProduct(), "4", "default sorting is faulty");
		notebooksPageObject.sortBy(sortingMethod);
		soft.assertEquals(notebooksPageObject.getNameOfFirstProduct(), dataProductId, " sorting is not working properly");
		soft.assertAll();
	}
}
