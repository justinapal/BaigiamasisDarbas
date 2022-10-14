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
}
