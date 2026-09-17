package StepDefinitions;

import PageObjects.DashboardElements;
import PageObjects.LoginElements;
import PageObjects.RequestAndApprovals_Elements;
import Sequifi.qa.configuration.CheckConfigurationSettings;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Login extends AbstractStepDefinitions {

    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);
    Duration timeoutInSeconds = Duration.ofSeconds(15);

    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Login(TestState state) {
        super(state);
    }

    @Given("Login: browser is open")
    public void browser_is_open() {
        customLogging.customAssertTrue(true, "Chrome browser is open");
        this.state.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.state.getDriver().manage().window().maximize();
    }

    @Then("Login: Validate user is on login page")
    public void user_is_on_login_page() {
        String url = CheckConfigurationSettings.getEnvironmentPropertyValue("url");
        this.state.getDriver().get(url);
        customLogging.customAssertTrue(true, "Navigate to " + url + " successful");
    }

    @When("Login: user enters valid username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        String username = CheckConfigurationSettings.getEnvironmentPropertyValue("superadmin_user");
        String password = CheckConfigurationSettings.getEnvironmentPropertyValue("superadmin_password");
        Thread.sleep(2000);
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(LoginElements.UserNameTextBox, username), "Enter Username successful");
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(LoginElements.PasswordTextBox, password), "Enter Password successful");
    }

    @When("Login: user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(LoginElements.UserNameTextBox, username), "Enter Username successful");
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(LoginElements.PasswordTextBox, password), "Enter Password successful");
    }

    @And("Login: Click Submit Button")
    public void login_clickSubmit() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LoginElements.SubmitButton));
        } catch (Exception e) {
        }
        customLogging.customAssertTrue(commonMethods.absoluteClick(LoginElements.SubmitButton), "Login: Submit successful");
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(LoginElements.SubmitButton));
        } catch (Exception e) {
        }
        Thread.sleep(2000);
    }

    @Then("Login: Validate user is navigated to homepage")
    public void Validate_user_is_navigated_to_homepage() throws InterruptedException {
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardElements.DashboardLabel));
            if (state.getDriver().findElement(DashboardElements.CloseModal).isDisplayed()) {
                customLogging.customAssertTrue(commonMethods.absoluteClick(DashboardElements.CloseModal), "Dashboard: Close Modal popup");
            }
        } catch (Exception ignored) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardElements.DashboardLabel));
        }
        String expectedTitle = CheckConfigurationSettings.getEnvironmentPropertyValue("title");
        String actualTitle = this.state.getDriver().getTitle();
        customLogging.customAssertEquals(actualTitle, expectedTitle, "Login: user is navigated to homepage");
    }

    @When("Login: Subscription popup - Click on Later button")
    public void Dashboard_SubscriptionPopup_ClickOnLateButton() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LoginElements.SubscriptionPopupLaterButton));
            customLogging.customAssertTrue(commonMethods.absoluteClick(LoginElements.SubscriptionPopupLaterButton), "Dashboard: Subscription popup - Click on Later button");
        } catch (Exception e) {
        }
    }

    @When("Login: Reset App")
    public void ResetApp() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(LoginElements.ResetAppButton), "Dashboard: Reset App Button Clicked successfully");
        customLogging.customAssertTrue(commonMethods.absoluteClick(LoginElements.ResetAppConfirmationPopupYesButton), "Dashboard: Reset App Confirmation Tab Yes Button Clicked successfully");
    }

    @When("Login: logout from App")
    public void logoutFromApp() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(LoginElements.AccountMenuButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(LoginElements.AccountMenuButton), "");
        wait.until(ExpectedConditions.elementToBeClickable(LoginElements.LogoutButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(LoginElements.LogoutButton), "Dashboard: Logout Button Clicked successfully");
        Thread.sleep(5000);
    }

    public void resetAppIndependently() {
        try {
            browser_is_open();
            user_is_on_login_page();
            user_enters_valid_username_and_password();
            login_clickSubmit();
            Validate_user_is_navigated_to_homepage();
            ResetApp();
//            logoutFromApp();
        } catch (Exception e) {

        }

    }

    @When("Login: Wait")
    public void login_wait() throws InterruptedException {
        Thread.sleep(180000);
    }
}
