package lt.justina.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lt.justina.pages.Common;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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