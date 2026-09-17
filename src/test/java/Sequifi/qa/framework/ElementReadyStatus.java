package Sequifi.qa.framework;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ElementReadyStatus {
    public WebDriver driver;
    protected ExtentTest testStep;
    protected SoftAssert softAssert;
    private boolean cucumberTest = false;


    public ElementReadyStatus(WebDriver driver, ExtentTest testStep, SoftAssert softAssert) {
        this.driver = driver;
        this.testStep = testStep;
        this.softAssert = softAssert;
    }

    public ElementReadyStatus(WebDriver driver) {
        this.driver = driver;
        this.setCucumberTest(true);
    }

    public void setCucumberTest(boolean cucumberTest) {
        this.cucumberTest = cucumberTest;
    }
}
