package lt.justina.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lt.justina.pages.Common;
import lt.justina.pages.ekhartyoga.HomePage;
import lt.justina.pages.ekhartyoga.LogInPage;
import lt.justina.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {

        String emailInput = "karengoto94@gmail.com";
        String passwordInput = "Topmail852!";

        HomePage.open("https://www.ekhartyoga.com/");

        HomePage.clickSignInButton();
        LogInPage.enterInputEmail(emailInput);
        LogInPage.enterInputPassword(passwordInput);
        LogInPage.clickSignInButtonAfterCompletedInputFields();
        HomePage.acceptPrivacyConfirmation();
    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}