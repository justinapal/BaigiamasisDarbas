package lt.justina.pages;

import org.openqa.selenium.By;

public class Locators {

    public class EkhartYoga {

        public class Home {

            public static By linkSignIn = By.xpath("(//a[text()='Sign in' and @href='/log-in'])[1]");
        }

        public class LogIn{

            public static By inputUsername = By.xpath("//input[@id='Username']");
        }
    }
}

