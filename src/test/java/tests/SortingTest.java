package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.NotebooksPage;

public class SortingTest extends TestBase{

	NotebooksPage notebooksPageObject ;
	SoftAssert soft = new SoftAssert();
	@Test
	public void testSorting() {
		notebooksPageObject = homeObject.navigateToNotebooksPage();
		
		soft.assertEquals(notebooksPageObject.getNameOfFirstProduct(), "4", "default sorting is faulty");
		notebooksPageObject.sortBy(3);
		soft.assertEquals(notebooksPageObject.getNameOfFirstProduct(), "7", " sorting is not working properly");
		soft.assertAll();
	}
}
