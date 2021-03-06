package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import nop.commerce.page.objects.NotebooksPage;

public class SortingTest extends TestBase{

	
	private int sortingMethod = 3; // price low to high,when changed change first product id accordingly
	private String dataProductId = "7";
	@Test
	public void testSorting() {
		NotebooksPage notebooksPageObject ;
		notebooksPageObject = homeObject.navigateToNotebooksPage();
		 SoftAssert soft = new SoftAssert();
		soft.assertEquals(notebooksPageObject.getNameOfFirstProduct(), "4", "default sorting is faulty");
		notebooksPageObject.sortBy(sortingMethod);
		soft.assertEquals(notebooksPageObject.getNameOfFirstProduct(), dataProductId, " sorting is not working properly");
		soft.assertAll();
	}
}
