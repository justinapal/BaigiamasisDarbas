package lt.justina.tests;

import lt.justina.pages.ekhartyoga.LogInPage;
import org.testng.annotations.BeforeMethod;


public class LogInTest extends TestBase {
    @Override
    @BeforeMethod
    public void setUp(){
        super.setUp();
        LogInPage.open("https://www.ekhartyoga.com/");
    }


}
