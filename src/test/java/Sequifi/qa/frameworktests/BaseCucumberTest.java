package Sequifi.qa.frameworktests;

import Sequifi.qa.configuration.ProjectConfigurations;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Sequifi.qa.configuration.CheckConfigurationSettings.getPropertyValue;

public class BaseCucumberTest {
    public static final ProjectConfigurations configurations = new ProjectConfigurations();
    private static final String STRING_ENVIRONMENT = "environment";
    private static final String STRING_SCENARIO = "Scenario";
    private static ITestContext testListener;
    Logger logger = new Logger();
    private WebDriver driver;
    private String baseURL;
    private String browserName;

    public BaseCucumberTest() {

    }

    public static void setTestListener(ITestContext testListener) {
        BaseCucumberTest.testListener = testListener;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setUpBeforScenario(Scenario scenario) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void tearDownAfterScenario(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            getScreenshot(scenario);
            closeDriver();
            logger.logStep(LogResult.FAIL, "Scenario - " + scenario.getName() + " Failed");
        } else {
            closeDriver();
        }
    }


    private void closeDriver() {
        try {
            Thread.sleep(2000);
            getDriver().quit();
            getDriver().close();
        } catch (Exception e) {
            logger.logStep(LogResult.INFO, "Error during driver kill - " + e.getMessage());
        }
    }

    private void getScreenshot(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } catch (Exception e) {
            logger.logStep(LogResult.INFO, "Driver not available for screenshot " + e.getMessage());
        }
    }

}
