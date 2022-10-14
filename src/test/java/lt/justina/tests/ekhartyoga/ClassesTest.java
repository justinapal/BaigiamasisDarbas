package lt.justina.tests.ekhartyoga;

import lt.justina.pages.ekhartyoga.ClassesPage;
import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.LogInPage;
import lt.justina.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.ekhartyoga.com/");

        String emailInput = "pal.justina@gmail.com";
        String passwordInput = "insane1169";

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(emailInput);
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButtonAfterCompletedInputFields();
    }

    @Test
    private void testAddingClassesToFavourites(){
        ClassesPage.ClickElementToGetOptions();
    }


}
