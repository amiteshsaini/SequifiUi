package StepDefinitions;

import PageObjects.DashboardElements;
import PageObjects.Management_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Management extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Management(TestState state) {
        super(state);
    }

    @When("Management: Management Menu: Click")
    public void click_on_ManagementMenu() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Elements.ManagementMenu));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Elements.ManagementMenu), "Management: Management Menu: Click successful");
        Thread.sleep(5000);
    }

    @Then("Management: Management Menu: Search {string} Position and Click to open details")
    public void settingsSearchPositionPosition(String Position) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Elements.SearchTextBox));
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Elements.SearchTextBox, Position), "Management: Management Menu: Search " + Position + " successful");
        this.state.getDriver().findElement(Management_Elements.SearchTextBox).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" + Position.split(" ")[0] + "')]")));
        this.state.getDriver().findElement(By.xpath("//*[contains(text(),'" + Position.split(" ")[0] + "')]")).click();
        customLogging.customAssertTrue(true, "Management: Management Menu: " + Position + " open details successful");
    }


    @When("Management: Employment Package Tab: Click")
    public void click_on_EmploymentPackage() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Elements.EmploymentPackageTab), "Management: Employment Package Tab: Click successful");
    }
}

