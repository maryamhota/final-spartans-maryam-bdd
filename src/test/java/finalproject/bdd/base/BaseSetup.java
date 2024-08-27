package finalproject.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {


    private static WebDriver driver; // making it static to make it reachable
    public void setupBrowser(){

        driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void quitBrowser (){
    // null check before quit
        if(driver != null){
            driver.quit();
        }
    }
    // adding encapsulation
    // indirect access to read only with this getter method to restrict setting new driver instance
     public WebDriver getDriver (){
        return driver;
     }
}
