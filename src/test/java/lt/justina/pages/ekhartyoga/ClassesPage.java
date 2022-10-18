package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

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
        try {
            Common.getStatusIfElementIsDisplayed(Locators.EkhartYoga.Classes.linkClassInFavourites);
            return isClassPresent;
        } catch (NoSuchElementException e) {
            isClassPresent = false;
        }
        return false;
    }

    public static void clickElementToRemoveFromFavourites() {
        Common.clickElement(
                Locators.EkhartYoga.Classes.spanRemoveFromFavourites
        );
    }

    public static void enterSearchInput(String searchText) {
        Common.sendKeysToElement(searchText, Locators.EkhartYoga.Classes.inputSearch);
    }

    public static void clickSearchIcon() {
        Common.clickElement(Locators.EkhartYoga.Classes.divSearchIcon);
    }

    public static String readSearchResultMessage() {
        return Common.getElementText(Locators.EkhartYoga.Classes.searchResultMessage);
    }

    public static boolean checkIfSearchResultsAreDisplayed(boolean areSearchResultsDisplayed) {
        List<Boolean> filteredList =
                Common.getStatusIfChosenElementsAreDisplayed(Locators.EkhartYoga.Classes.spanAuthorPrefix);

        if (filteredList.size() > 0)
            return areSearchResultsDisplayed;
        else {
            return false;
        }
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }
}


