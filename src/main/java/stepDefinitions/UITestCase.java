package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.MainConfig;
import utils.WebDriverFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UITestCase {

    public static WebDriver driver;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Executing before all");
        System.out.println("Initiating Main config file");
        MainConfig.initMainConfig();
    }
    @Before
    public void setup() throws MalformedURLException {
        driver = WebDriverFactory.getWebDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Executing after all");
    }

    public static void browseToUrl(String url){
        driver.navigate().to(url);
    }
}
