package lt.justina.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class EkhartYoga {

        public static class Home {

            public static By linkSignIn = By.xpath("(//a[text()='Sign in' and @href='/log-in'])[1]");

            public static By dashboardHeader = By.xpath("(//h2)[1]");

            public static By linkClasses = By.xpath("//a[@href='/classes/browse_all?page=1']");
        }

        public static class LogIn {

            public static By inputUsername = By.xpath("//input[@id='Username']");

            public static By inputPassword = By.xpath("//input[@id='password-field']");

            public static By buttonLogin = By.xpath("//button[@value='login']");

            public static By listInvalidCredentials = By.xpath(
                    "//li[text()='Invalid username or password.']"
            );
        }

        public class Classes {

            public static By optionsButtonDropDown = By.xpath(
                    "//div[@id='options-button-485e379e-6d2f-434f-826a-7d27412977fa']");

            public static By spanAddToFavourites =
                    By.xpath(
                            "//div[@id='options-button-485e379e-6d2f-434f-826a-7d27412977fa']//" +
                                    "button//span[contains(text(), 'Add to favourites')]"
                    );
        }

    }
}

