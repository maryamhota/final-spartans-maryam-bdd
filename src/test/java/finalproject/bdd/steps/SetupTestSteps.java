package finalproject.bdd.steps;

import finalproject.bdd.utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SetupTestSteps extends SeleniumUtility {
    @Given("navigate to browser and open TEK Insurance UI")
    public void openBrowserAndNavigate(){
        setupBrowser();

    }
    @Then("validate the page title TEK Insurance UI")
    public void validateThePageTitle(){
       String pageTitle = getElementText(By.className("chakra-heading css-1at26de"));

       Assert.assertEquals("TEK Insurance UI", pageTitle);

    }
    @And("the Create Primary Account button should exist")
    public void createPrimaryAccountButton() {
        WebElement createPrimaryAccountButton = driver.findElement(By.cssSelector("button.btn-primary"));
}
}
