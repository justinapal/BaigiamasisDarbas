package lt.justina.pages;

import lt.justina.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
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
        List<WebElement> elements = Common.getElements(locator);
        List<Boolean> presence = new ArrayList<>();

        for (WebElement element : elements) {
            presence.add(element.isDisplayed());
        }
        return presence;
    }
}
