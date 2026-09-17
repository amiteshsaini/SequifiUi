package Sequifi.qa.framework;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class CommonElementMethods extends ElementReadyStatus {

    public CommonElementMethods(WebDriver driver, ExtentTest testStep, SoftAssert softAssert) {
        super(driver, testStep, softAssert);
    }

    public CommonElementMethods(WebDriver driver) {
        super(driver);
    }
}
