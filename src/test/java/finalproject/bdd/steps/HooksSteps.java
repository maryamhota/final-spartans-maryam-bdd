package finalproject.bdd.steps;

import finalproject.bdd.utility.SeleniumUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksSteps extends SeleniumUtility {

    @Before
    public void beforeEachScenario(){
        setupBrowser();
    }
    @After
    public void afterEachScenario(){
        quitBrowser();
    }
}
