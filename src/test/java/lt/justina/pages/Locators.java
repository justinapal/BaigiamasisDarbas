package lt.justina.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class EkhartYoga {

        public static class Home {

            public static By linkSignIn = By.xpath("(//a[text()='Sign in' and @href='/log-in'])[1]");

            public static By dashboardHeader = By.xpath("(//h2)[1]");

            public static By linkClasses = By.xpath("//a[@href='/classes/browse_all?page=1']");

            public static By spanCookies = By.xpath("//span[@class='md:text-xl font-body']");

            public static By buttonAcceptCookies = By.xpath("//button[contains(text(), 'Accept')]");

            public static By linkPlaylists = By.xpath("//a[@href='/playlists/browse_all?page=1']");
        }

        public static class LogIn {

            public static By inputUsername = By.xpath("//input[@id='Username']");

            public static By inputPassword = By.xpath("//input[@id='password-field']");

            public static By buttonLogin = By.xpath("//button[@value='login']");

            public static By listInvalidCredentials = By.xpath(
                    "//li[text()='Invalid username or password.']"
            );

            public static By spanUsernameErrorMessage = By.xpath("//span[@id='Username-error']");

            public static By spanPasswordErrorMessage = By.xpath("//span[@id='password-field-error']");
        }

        public class Classes {

            public static By optionsButtonDropDown = By.xpath(
                    "(//div[@class='card-overlay__header']//div[@class='right-side'])[1]//button");

            public static By spanAddToFavourites =
                    By.xpath(
                            "//button//span[contains(text(),'Add to favourites')]"
                    );

            public static By linkFavourites = By.xpath("//a[contains(text(), 'Favourites')]");

            public static By linkClassInFavourites = By.xpath(
                    "//a[contains(@id,'card-item')]");

            public static By spanRemoveFromFavourites = By.xpath(
                    "//span[normalize-space()='Remove from favourites']");

            public static By inputSearch = By.xpath("//input[@placeholder='Search']");

            public static By divSearchIcon = By.xpath(
                    "//div[contains(@class, 'text-with-icon search-input-wrapper__icon search')]"
            );

            public static By searchResultMessage = By.xpath(
                    "//span[contains(text(), 'Search results for \"Esther Ekhart\"')]"
            );

            public static By spanAuthorPrefix = By.xpath(
                    "//div[@class='author']//span[@class='author-prefix']");
        }

        public class Playlists {

            public static By divInputFeeling = By.xpath("//div[@id='select-input-feeling']");

            public static By spanCollapsibleGrounding = By.xpath("//span[normalize-space()='Grounding']");

            public static By buttonCollapsibleApply = By.xpath("//button[normalize-space()='Apply']");

            public static By divInputLevels = By.xpath("//div[@id='select-input-levels']");

            public static By spanCollapsibleBeginner = By.xpath(
                    "//span[normalize-space()='Beginner - 1']"
            );

            public static By linkFilteredPlaylists = By.xpath(
                    "//a[contains(@class,'card-item--media-top')]");
        }
    }
}

