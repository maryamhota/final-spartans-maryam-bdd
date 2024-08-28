package finalproject.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/SetupTest.feature",// directory for feature files
        glue = "finalproject.bdd.steps" // package for all the steps
)
public class TestRunner {



}
