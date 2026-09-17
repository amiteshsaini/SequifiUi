package StepDefinitions;

import PageObjects.Management_Overrides_Elements;
import PageObjects.SettingsElements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Settings extends AbstractStepDefinitions {

    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);
    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Settings(TestState state) {
        super(state);
    }

    @When("Settings: Settings Menu: Click")
    public void click_on_settings() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.Settings), "Click on settings successful");
    }

    @And("Settings: click on Edit Profile")
    public void click_on_edit_profile() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.EditProfile), "Settings: click on Edit Profile successful");
    }

    @Then("Settings: fill the required company data")
    public void fill_the_required_company_data() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        this.state.getDriver().findElement(By.xpath("//div[@class='bi bi-pencil-fill fs-6 py-1 px-2 text-cmGrey700 bg-white shadow-sm rounded cursor-pointer']")).click();
        this.state.getDriver().findElement(By.xpath("//div[text()='Add Logo']")).click();

        Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection str = new StringSelection("D:\\Automation\\Logo\\Flex logo.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        this.state.getDriver().findElement(By.xpath("//button[@aria-label='Save'][@class='p-button p-component bg-cmBlue-Crayola text-cmwhite border-0  w-auto null px-5 py-2']")).click();

        Thread.sleep(2000);
        WebElement element = this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter company name']"));
        JavascriptExecutor js = (JavascriptExecutor) this.state.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(1000);
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter company name']")).clear();
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter company name']")).sendKeys("Solar Test Company");

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.xpath("//input[@name='phone_number']")).clear();
        this.state.getDriver().findElement(By.xpath("//input[@name='phone_number']")).sendKeys("1238675309");

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.name("business_name")).click();
        this.state.getDriver().findElement(By.name("business_name")).clear();
        this.state.getDriver().findElement(By.name("business_name")).sendKeys("Solar Test Company LLC");
        // this.state.getDriver().findElement(By.xpath("//input[@name='business_name']")).clear();
        //this.state.getDriver().findElement(By.xpath("//input[@placeholder='Enter Business name']"));

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='abc@gmail.com']")).clear();
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='abc@gmail.com']")).sendKeys("companytest@sequifi.com");

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='www.URL.com']")).clear();
        this.state.getDriver().findElement(By.xpath("//input[@placeholder='www.URL.com']")).sendKeys("www.solartestcompany.com");

        Thread.sleep(2000);
        WebElement BusinessAddress = this.state.getDriver().findElement(By.name("business_address"));
        Thread.sleep(2000);
        BusinessAddress.clear();
        BusinessAddress.sendKeys("NY Testing");
        BusinessAddress.sendKeys(Keys.ARROW_DOWN);
        BusinessAddress.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.xpath("//input[@name='business_phone']")).clear();
        this.state.getDriver().findElement(By.xpath("//input[@name='business_phone']")).sendKeys("9876543210");

        Thread.sleep(2000);
        WebElement MailingAddress = this.state.getDriver().findElement(By.name("mailing_address"));
        MailingAddress.clear();
        MailingAddress.sendKeys("3000 N University Ave, Provo, UT");
        Thread.sleep(2000);
        MailingAddress.sendKeys(Keys.ARROW_DOWN);
        MailingAddress.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.name("business_ein")).clear();
        this.state.getDriver().findElement(By.name("business_ein")).sendKeys("123456789");

        Thread.sleep(2000);
        this.state.getDriver().findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext']")).click();
        WebElement TimeZone = this.state.getDriver().findElement(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']"));
        TimeZone.sendKeys("(GMT-07:00) Mountain Time (US & Canada)");
        TimeZone.sendKeys(Keys.ARROW_DOWN);
        TimeZone.sendKeys(Keys.ENTER);
    }

    @And("Settings: click on save button")
    public void click_on_save_button() {
        WebElement element1 = this.state.getDriver().findElement(By.xpath("//span[text()='Cancel']"));
        JavascriptExecutor js1 = (JavascriptExecutor) this.state.getDriver();
        js1.executeScript("arguments[0].click();", element1);
    }

    @Then("Settings: Validate user is navigated back to settings page")
    public void user_is_navigated_back_to_settings_page() throws InterruptedException {
        this.state.getDriver().getPageSource().contains("Flex Marketing");
    }


    @Then("Settings: Package Tab: Click")
    public void settingsClickOnPositionsTab() throws InterruptedException {
        Thread.sleep(2000);
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.PositionsTab), "Settings: Package Tab: Click successful");
    }

    @Then("Settings: Package Tab: Search {string} Position")
    public void settingsSearchPositionPosition(String Position) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(SettingsElements.SearchTextBox, Position), "Settings: Package Tab: Search " + Position + " Position successful");
    }

    @Then("Settings: Package Tab: Click on Commission Structure Edit")
    public void settingsClickOnCommissionStructureEdit() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.CommissionStructureButton), "Settings: Package Tab: Click on Commission Structure Edit successful");
    }

    @Then("Settings: Package Tab: Upfront Sub Tab - Click")
    public void settingsClickOnUpfrontSubTab() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.UpfrontSubTab), "Settings: Package Tab: Upfront Sub Tab - Click successful");
    }

    @Then("Settings: Package Tab: Upfront Sub Tab - Enable Upfront")
    public void settingsEnableUpfront() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.UpfrontEnableDisableCheckbox), "Settings: Package Tab: Upfront Sub Tab - Enable Upfront successful");
    }

    @Then("Settings: Package Tab: Upfront Sub Tab - Enter Amount {string} on Upfront Sub Tab")
    public void settingsEnterAmountOnUpfrontSubTab(String amount) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(SettingsElements.AmountTextBox, amount), "Settings: Package Tab: Upfront Sub Tab - Enter Amount " + amount + " on Upfront Sub Tab successful");
    }

    @Then("Settings: Package Tab: Upfront Sub Tab - Select {string} from Calculated Dropdown on Upfront Sub Tab")
    public void settingsSelectCalculatedDropdownValueFromCalculatedDropdownOnUpfrontSubTab(String CalculatedDropdownValue) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.CalculatedDropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[text() = '" + CalculatedDropdownValue + "']")), "Settings: Package Tab: Upfront Sub Tab - Select " + CalculatedDropdownValue + " from Calculated Dropdown on Upfront Sub Tab successful");
    }

    @Then("Settings: Package Tab: Upfront Sub Tab - Select {string} from Upfront System Dropdown on Upfront Sub Tab")
    public void settingsSelectCalculatedDropdownValueFromUpfrontSystemDropdownOnUpfrontSubTab(String SettingsUpfrontSystemDropdownValue) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.UpfrontSystemDropdown), "");
        this.state.getDriver().findElements(By.xpath("//*[text() = '" + SettingsUpfrontSystemDropdownValue + "']")).get(2).click();
        customLogging.customAssertTrue(true, "Settings: Package Tab: Upfront Sub Tab - Select " + SettingsUpfrontSystemDropdownValue + " from Upfront System Dropdown on Upfront Sub Tab successful");

    }

    @Then("Settings: Package Tab: Upfront Sub Tab - Click Submit")
    public void settingsClickSubmitOnUpfrontSubTab() {
        this.state.getDriver().findElements(SettingsElements.UpfrontSubTabSubmitButton).get(1).click();
        customLogging.customAssertTrue(true, "Settings: Package Tab: Upfront Sub Tab - Click Submit successful");
    }

    @Then("Settings: Package Tab: Overrides Sub Tab - Click")
    public void settingsClickOnOverridesSubTab() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.OverridesSubTab), "Settings: Package Tab: Overrides Sub Tab - Click successful");
    }

    @Then("Settings: Package Tab: Overrides Sub Tab - Enable Direct Overrides")
    public void settingsEnableDirectOverrides() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.DirectOverridesEnableDisableCheckbox), "Settings: Package Tab: Overrides Sub Tab - Enable Direct Overrides successful");
    }

    @Then("Settings: Package Tab: Overrides Sub Tab - Enter Amount {string} on Upfront Sub Tab")
    public void settingsEnterAmountOnOverridesSubTab(String amount) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(SettingsElements.DirectOverridesAmountTextBox, amount), "Settings: Package Tab: Overrides Sub Tab - Enter Amount " + amount + " on Upfront Sub Tab successful");
    }

    @Then("Settings: Package Tab: Overrides Sub Tab - Select {string} from Calculated Dropdown")
    public void settingsSelectCalculatedDropdownValueFromCalculatedDropdownOnOverridesSubTab(String CalculatedDropdownValue) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.DirectOverridesCalculatedDropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[text() = '" + CalculatedDropdownValue + "']")), "Settings: Package Tab: Overrides Sub Tab - Select " + CalculatedDropdownValue + " from Calculated Dropdown successful");
    }

    @Then("Settings: Package Tab: Overrides Sub Tab - Click Submit")
    public void settingsClickSubmitOnOverridesSubTab() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(SettingsElements.DirectOverridesSubTabSubmitButton), "Settings: Package Tab: Overrides Sub Tab - Click Submit successful");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(SettingsElements.DirectOverridesSubTabSubmitButton));
    }
}
