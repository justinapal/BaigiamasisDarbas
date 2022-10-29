package lt.justina.pages.ekhartyoga;

import lt.justina.pages.Common;
import lt.justina.pages.Locators;

public class LogInPage {

    public static void enterInputEmail(String emailInput) {
        Common.sendKeysToElement(emailInput, Locators.EkhartYoga.LogIn.inputUsername);
    }

    public static void enterInputPassword(String passwordInput) {
        Common.sendKeysToElement(passwordInput, Locators.EkhartYoga.LogIn.inputPassword);
    }

    public static void clickSignInButton() {
        Common.clickElement(Locators.EkhartYoga.LogIn.buttonLogin);
    }

    public static String readMessageInvalidInput() {
        return Common.getElementText(Locators.EkhartYoga.LogIn.listInvalidCredentials);
    }

    public static String readMessageUnderEmailField() {
        return Common.getElementText(Locators.EkhartYoga.LogIn.spanUsernameErrorMessage);
    }

    public static String readMessageUnderPasswordField() {
        return Common.getElementText(Locators.EkhartYoga.LogIn.spanPasswordErrorMessage);
    }
}

