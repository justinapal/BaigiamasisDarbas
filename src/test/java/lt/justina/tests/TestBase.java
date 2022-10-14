package lt.justina.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lt.justina.pages.Common;
import lt.justina.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
        Common.setUpDriver();
    }


    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }

}