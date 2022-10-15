package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;

import java.util.List;

public class ClassesPage {
    public static void clickElementToGetClassesOptions() {
        Common.clickElement(
                Locators.EkhartYoga.Classes.optionsButtonDropDown
        );
    }

    public static void clickElementToAddToFavourites() {
        Common.clickElement(Locators.EkhartYoga.Classes.spanAddToFavourites);
    }

    public static void clickElementFavourites() {
        Common.clickElement(Locators.EkhartYoga.Classes.linkFavourites);
    }

    public static boolean checkIsClassPresentInFavourites(boolean isClassPresent) {
        List<Boolean> presenceList = Common.getStatusIfChosenElementsAreDisplayed(Locators.EkhartYoga.Classes.linkClassInFavourites);

        for (boolean presence : presenceList) {
            if (isClassPresent != presence) return false;
        }
        return true;
    }

    public static void clickSelectInputTeachers() {
        Common.clickElement(Locators.EkhartYoga.Classes.selectInputTeachers);
    }
}
