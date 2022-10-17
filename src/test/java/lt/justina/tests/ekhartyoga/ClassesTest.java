package lt.justina.tests.ekhartyoga;

import lt.justina.pages.Locators;
import lt.justina.pages.ekhartyoga.ClassesPage;
import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.LogInPage;
import lt.justina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.clickElementToOpenClasses();
    }

    @Test
    private void testAddingClassesToFavourites() {
        boolean expectedStatusIsClassPresentInFavourites = true;
        boolean actualStatusIsClassPresentInFavourites;

        ClassesPage.clickElementToGetClassesOptions();
        ClassesPage.clickElementToAddToFavourites();
        ClassesPage.clickElementFavourites();

        actualStatusIsClassPresentInFavourites = ClassesPage.checkIsClassPresentInFavourites(
                expectedStatusIsClassPresentInFavourites
        );

        Assert.assertEquals(actualStatusIsClassPresentInFavourites, expectedStatusIsClassPresentInFavourites);
    }

    @Test
    private void testSearchInputByClasses() {
        String searchText = "Esther Ekhart";
        String expectedSearchResultMessage = "Search results for \"Esther Ekhart\"";
        String actualSearchResultMessage = "";
        boolean expectedStatusSearchResults = true;
        boolean actualStatusSearchResults;

        ClassesPage.enterSearchInput(searchText);
        ClassesPage.clickSearchIcon();
        actualSearchResultMessage = ClassesPage.readSearchResultMessage();

        Assert.assertEquals(actualSearchResultMessage, expectedSearchResultMessage);

        actualStatusSearchResults = ClassesPage.checkIfSearchResultsAreDisplayed(expectedStatusSearchResults);

        Assert.assertEquals(actualStatusSearchResults, expectedStatusSearchResults);
    }
}
