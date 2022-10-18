package lt.justina.tests.ekhartyoga;

import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.PlaylistsPage;
import lt.justina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaylistsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.clickElementToOpenPlaylists();
    }

    @Test
    private void testSearchingPlaylistsByDropDownAttributes() {
        boolean expectedStatusArePlaylistsFiltered = true;
        boolean actualStatusArePlaylistsFiltered;

        PlaylistsPage.clickDropDownInputFeeling();
        PlaylistsPage.checkAttributeGrounding();
        PlaylistsPage.clickButtonApply();
        PlaylistsPage.clickDropDownInputLevel();
        PlaylistsPage.checkAttributeBeginner();
        PlaylistsPage.clickButtonApply();

        actualStatusArePlaylistsFiltered =
                PlaylistsPage.checkIfPlaylistsAreFilteredAndDisplayed(expectedStatusArePlaylistsFiltered);

        Assert.assertEquals(actualStatusArePlaylistsFiltered, expectedStatusArePlaylistsFiltered);
    }
}
