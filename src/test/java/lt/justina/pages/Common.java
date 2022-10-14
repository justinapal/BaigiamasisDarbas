package lt.justina.pages;

import lt.justina.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common {

    public static void setUpDriver(){
        Driver.setDriver();
    }

    public static void closeDriver() {Driver.close();
    }

    public static void openUrl(String url) {Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator){
        return Driver.getDriver().findElement(locator);
    }
    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(String keys, By locator) {getElement(locator).sendKeys();
    }
}
