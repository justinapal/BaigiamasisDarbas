package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;

public class LogInPage {

    public static void enterInputEmail(String emailInput) {
        Common.sendKeysToElement(emailInput, Locators.EkhartYoga.LogIn.inputUsername);
    }

    }

