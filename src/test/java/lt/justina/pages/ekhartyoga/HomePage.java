package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;

public class HomePage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickSignInButton() {
        Common.clickElement(Locators.EkhartYoga.Home.linkSignIn);
    }

    public static String readUsernameGreetingMessage() {
        return Common.getElementText(Locators.EkhartYoga.Home.dashboardHeader);
    }

    public static void clickElementToOpenClasses() {
        Common.clickElement(Locators.EkhartYoga.Home.linkClasses);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementUntilVisibilityChanges(Locators.EkhartYoga.Home.spanCookies);
        Common.clickElement(Locators.EkhartYoga.Home.buttonAcceptCookies);
    }

    public static void clickElementToOpenPlaylists() {
        Common.clickElement(Locators.EkhartYoga.Home.linkPlaylists);
    }
}
