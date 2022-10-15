package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;

public class ClassesPage {
    public static void clickElementToGetClassesOptions() {
        Common.clickElement(
                Locators.EkhartYoga.Classes.optionsButtonDropDown
        );
    }

    public static void clickElementToAddToFavourites() {
        Common.clickElement(Locators.EkhartYoga.Classes.spanAddToFavourites);
    }
}
