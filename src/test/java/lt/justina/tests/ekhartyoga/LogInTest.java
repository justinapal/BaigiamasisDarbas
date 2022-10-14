package lt.justina.tests.ekhartyoga;

import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.LogInPage;
import lt.justina.tests.TestBase;
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

    @Test
    private void testLogInInvalidInput(){
        String emailInputInvalid = "t*op.mail.com";
        String passwordInput = "insane1169";

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(emailInputInvalid);
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButtonAfterCompletedInputFields();

        String expectedMessage = "Invalid username or password.";
        String actualMessage = "";

        actualMessage = LogInPage.readMessageInvalidInput();

        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
