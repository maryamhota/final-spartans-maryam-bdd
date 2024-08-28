package finalproject.bdd.utility;

import finalproject.bdd.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

// selenium utility extends the BaseSetup class
public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    private WebElement waitForVisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // creating a method to click on a given locator
    public void clickOnElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public void sendText(By locator, String value) {
        waitForVisibility(locator).sendKeys(value);

    }
    // creating method for getting the text of a locator
   public String getElementText(By locator){
        return waitForVisibility(locator).getText();
   }
    }


