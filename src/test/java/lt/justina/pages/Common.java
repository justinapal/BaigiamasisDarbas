package lt.justina.pages;

import lt.justina.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void closeDriver() {
        Driver.close();
    }

    public static void openUrl(String url) {
        setUpDriver();
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        checkIfElementDisplayed(locator);
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static List<Boolean> getStatusIfChosenElementsAreDisplayed(By locator) {

        checkIfElementDisplayed(locator);

        List<WebElement> elements = Common.getElements(locator);
        List<Boolean> statuses = new ArrayList<>();

        for (WebElement element : elements) {
            statuses.add(element.isDisplayed());
        }
        return statuses;
    }

    public static boolean checkIfElementDisplayed(By locator) {
        WebElement element = Driver.getDriver().findElement(locator);
        int seconds = 5;

        for (int count : new int[seconds]) {
            try {
                element.isDisplayed();
                return true;
            } catch (NoSuchElementException | StaleElementReferenceException ex) {
                sleep(1000);
            }
        }

        return false;
    }

    public static void waitForElementUntilVisibilityChanges(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static boolean getStatusIfElementIsDisplayed(By locator) {
        waitForElementUntilVisibilityChanges(locator);
        return Driver.getDriver().findElement(locator).isDisplayed();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
