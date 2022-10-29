package lt.justina.tests.ekhartyoga;

import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.LogInPage;
import lt.justina.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LogInTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {

        HomePage.open("https://www.ekhartyoga.com/");
    }

    @Test
    private void testLogInValidInput() {
        String emailInput = "karengoto94@gmail.com";
        String passwordInput = "Topmail852!";
        String expectedUsernameGreetingMessage = "Namaste, Karen";
        String actualUsernameGreetingMessage = "";

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(emailInput);
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButton();

        actualUsernameGreetingMessage = HomePage.readUsernameGreetingMessage();

        Assert.assertEquals(actualUsernameGreetingMessage, expectedUsernameGreetingMessage);
    }

    @Test
    private void testLogInInvalidEmailInput() {
        String emailInputInvalid = "t*op.mail.com";
        String passwordInput = "Topmail852!";
        String expectedMessage = "Invalid username or password.";
        String actualMessage = "";

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(emailInputInvalid);
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButton();

        actualMessage = LogInPage.readMessageInvalidInput();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    private void testLogInEmailFieldLeftBlank() {
        String passwordInput = "Topmail852!";
        String expectedMessage = "E-mail address is required";
        String actualMessage = "";

        HomePage.clickSignInButton();
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButton();

        actualMessage = LogInPage.readMessageUnderEmailField();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    private void testLogInPasswordFieldLeftBlank() {
        String validEmailInput = "karengoto94@gmail.com";
        String expectedMessage = "Password is required";
        String actualMessage = "";

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(validEmailInput);
        LogInPage.clickSignInButton();

        actualMessage = LogInPage.readMessageUnderPasswordField();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
