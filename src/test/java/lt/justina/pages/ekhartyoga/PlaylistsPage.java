package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;
import lt.justina.tests.TestBase;

import java.util.List;

public class PlaylistsPage extends TestBase {
    public static void clickDropDownInputFeeling() {
        Common.clickElement(Locators.EkhartYoga.Playlists.divInputFeeling);
    }

    public static void checkAttributeGrounding() {
        Common.clickElement(Locators.EkhartYoga.Playlists.spanCollapsibleGrounding);
    }

    public static void clickDropDownInputLevel() {
        Common.clickElement(Locators.EkhartYoga.Playlists.divInputLevels);
    }

    public static void checkAttributeBeginner() {
        Common.clickElement(Locators.EkhartYoga.Playlists.spanCollapsibleBeginner);
    }

    public static void clickButtonApply() {
        Common.clickElement(Locators.EkhartYoga.Playlists.buttonCollapsibleApply);
    }

    public static boolean checkIfPlaylistsAreFilteredAndDisplayed(boolean arePlaylistsFiltered) {
        try {
            List<Boolean> filteredList = Common.getStatusIfChosenElementsAreDisplayed(
                    Locators.EkhartYoga.Playlists.linkFilteredPlaylists);
            if (filteredList.size() > 0)
                return arePlaylistsFiltered;
            else {
                return false;
            }
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            List<Boolean> filteredList = Common.getStatusIfChosenElementsAreDisplayed(
                    Locators.EkhartYoga.Playlists.linkFilteredPlaylists);
            if (filteredList.size() > 0)
                return arePlaylistsFiltered;
            else {
                return false;
            }
        }
    }
}
