package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;
import lt.justina.tests.TestBase;

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
}
