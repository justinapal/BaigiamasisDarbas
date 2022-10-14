package lt.justina.tests;

import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.LogInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    @Override
    @BeforeMethod
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.ekhartyoga.com/");

    }

    @Test
    private void testLogInValidInput() {
        String emailInput = "pal.justina@gmail.com";
        String passwordInput = "insane1169";

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(emailInput);
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButtonAfterCompletedInputFields();

        String expectedUsernameGreetingMessage = "Namaste, Justina";
        String actualUsernameGreetingMessage = "";

        actualUsernameGreetingMessage = HomePage.readUsernameGreetingMessage();

        Assert.assertEquals(actualUsernameGreetingMessage, expectedUsernameGreetingMessage);
    }
}
