package StepDefinitions;

import PageObjects.Management_Elements;
import PageObjects.Management_Overrides_Elements;
import PageObjects.Management_RedlineCommissionUpfront_Elements;
import PageObjects.Management_Transfer_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Management_Overrides extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Management_Overrides(TestState state) {
        super(state);
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Click on Edit button")
    public void managementClickOnOverridesSubSectionEditButtonOnEmploymentPackageTab() throws InterruptedException {
        Thread.sleep(5000);
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Overrides_Elements.OverridesSubSectionButton), "Management: Employment Package Tab: Overrides SubSection - Click on Edit button successful");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Update Override Effective Date to {string}")
    public void managementEmploymentPackageTabOverridesSubSectionUpdateOverrideEffectiveDateTo(String OverrideEffectiveDate) throws InterruptedException {
        if (!OverrideEffectiveDate.equals("") && !OverrideEffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Overrides_Elements.OverrideEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_Overrides_Elements.OverrideEffectiveDateTextBox, OverrideEffectiveDate), "Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override Effective Date to " + OverrideEffectiveDate);
        } else if (OverrideEffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Overrides_Elements.OverrideEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Overrides SubSection - Override Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Overrides SubSection - Override Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Update Effective Date to {string}")
    public void managementUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_Overrides_Elements.OverridesEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: Overrides SubSection - Update Effective Date to " + EffectiveDate + " successful");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Direct Override - Update Amount from {string} to {string}")
    public void managementUpdateAmountFromTo(String Amount, String Amount_Updated) throws InterruptedException {
//        this.state.getDriver().findElement(Management_Overrides_Elements.DirectOverrideAmountTextBox).clear();
//        this.state.getDriver().findElement(Management_Overrides_Elements.DirectOverrideAmountTextBox).sendKeys(Amount_Updated);
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Overrides_Elements.DirectOverrideAmountTextBox, Amount_Updated), "Management: Employment Package Tab: Overrides SubSection - Update Amount from " + Amount + " to " + Amount_Updated + " successful");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Direct Override - Select {string} from Calculated Dropdown")
    public void settingsSelectCalculatedDropdownValueFromCalculatedDropdown(String CalculatedDropdownValue) throws InterruptedException {
        try {
            commonMethods.absoluteClick(Management_Overrides_Elements.DirectOverrideCalculatedDropdown);
            commonMethods.absoluteClick(By.xpath("//*[text() = '" + CalculatedDropdownValue + "']"));
        } catch (Exception e) {

        }
    }


    @Then("Management: Employment Package Tab: Overrides SubSection - Validate {string} is hidden")
    public void managementValidateElementIsHidden(String ElementText) {
        customLogging.customAssertFalse(commonMethods.isElementPresent(By.xpath("//*[text() = '" + ElementText + "']")), "Management: Employment Package Tab: Overrides SubSection - Validate " + ElementText + " is hidden successful");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Update Stack Split from {string} to {string}")
    public void managementUpdateStackSplitFromTo(String StackSplit, String StackSplit_Updated) throws InterruptedException {
        String actualAmount = commonMethods.getAttributeValue(Management_Overrides_Elements.StackSplitTextBox);
        customLogging.customAssertEquals(actualAmount, StackSplit, "");
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Overrides_Elements.StackSplitTextBox, StackSplit_Updated), "Management: Employment Package Tab: Overrides SubSection - Update Stack Split from " + StackSplit + " to " + StackSplit_Updated + " successful");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Click on Save button")
    public void managementClickOnSaveButtonOnOverridesSubSection() throws InterruptedException {
        try {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(Management_Overrides_Elements.OverrideSectionSaveButton));
            } catch (Exception e1) {
                Thread.sleep(2000);
            }
            Actions action = new Actions(this.state.getDriver());
            WebElement element1 = this.state.getDriver().findElement(Management_Elements.EmploymentPackageTab);
            action.moveToElement(this.state.getDriver().findElement(Management_Elements.EmploymentPackageTab)).moveToElement(element1).perform();
            if (commonMethods.absoluteClick(Management_Overrides_Elements.OverrideSectionSaveButton)) {
                WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Employment Package Updated')]"));
                ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
                customLogging.customAssertTrue(true, "Overrides has been Updated successfully");
            } else {
                customLogging.customAssertTrue(false, "Overrides is NOT Updated successfully");
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Overrides is NOT Updated successfully");
        }
        Thread.sleep(5000);
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Click on View Manual Overrides")
    public void managementEmploymentPackageTabOverridesSubSectionClickOnViewManualOverrides() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Overrides_Elements.ViewManualOverrideLink), "Management: Employment Package Tab: Overrides SubSection - Click on View Manual Overrides");

    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add New Button")
    public void managementEmploymentPackageTabOverridesSubSectionManualOverrideClickOnAddNewButton() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Overrides_Elements.ManualOverrideAddNewButton), "Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add New Button");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Effective Date to {string}")
    public void managementEmploymentPackageTabOverridesSubSectionManualOverrideUpdateEffectiveDateTo(String ManualOverridesEffectiveDate) throws InterruptedException {
        if (!ManualOverridesEffectiveDate.equals("") && !ManualOverridesEffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Overrides_Elements.ManualOverrideEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_Overrides_Elements.ManualOverrideEffectiveDateTextBox, ManualOverridesEffectiveDate), "Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Effective Date to " + ManualOverridesEffectiveDate);
        } else if (ManualOverridesEffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Overrides_Elements.ManualOverrideEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Effective is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Effective is not be visible");
            }
        }

    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override from to {string}")
    public void managementEmploymentPackageTabOverridesSubSectionManualOverrideUpdateOverrideFromTo(String OverrideFrom) throws InterruptedException {
        if (!OverrideFrom.equals("") && !OverrideFrom.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Overrides_Elements.ManualOverrideOverrideFromTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Overrides_Elements.ManualOverrideOverrideFromTextBox, OverrideFrom), "Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Override from to " + OverrideFrom);
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("(//span[text()='" + OverrideFrom + "'])/../span[1]")), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Overrides_Elements.ManualOverrideOverrideFromCloseButton), "");
        } else if (OverrideFrom.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Overrides_Elements.ManualOverrideOverrideFromTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Override is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Override is not visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Manual Override - Select {string} from Calculated Dropdown")
    public void managementEmploymentPackageTabOverridesSubSectionManualOverrideSelectFromCalculatedDropdown(String ManualOverrideCalculatedDropdown) throws InterruptedException {
        if (!ManualOverrideCalculatedDropdown.equals("") && !ManualOverrideCalculatedDropdown.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Overrides_Elements.ManualOverrideCalculatedDropdown));
            try {
                if (commonMethods.absoluteClick(Management_Overrides_Elements.ManualOverrideCalculatedDropdownCancelButton)) {
                    commonMethods.absoluteClick(Management_Overrides_Elements.ManualOverrideCalculatedDropdown);
                    commonMethods.absoluteClick(By.xpath("//*[@class='p-dropdown-item' and @aria-label = '" + ManualOverrideCalculatedDropdown + "']"));
                }
            } catch (Exception e) {

            }
        } else if (ManualOverrideCalculatedDropdown.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Overrides_Elements.ManualOverrideCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Calculated Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Calculated Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Amount to {string}")
    public void managementEmploymentPackageTabOverridesSubSectionManualOverrideUpdateAmountTo(String ManualOverrideAmount) throws InterruptedException {
        if (!ManualOverrideAmount.equals("") && !ManualOverrideAmount.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Overrides_Elements.ManualOverrideAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Overrides_Elements.ManualOverrideAmountTextBox, ManualOverrideAmount), "Management: Employment Package Tab: Overrides SubSection - Manual Override - Update Amount to " + ManualOverrideAmount);
        } else if (ManualOverrideAmount.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Overrides_Elements.ManualOverrideAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Overrides SubSection - Manual Override - Amount is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - Manual Override - Click on Add Override button")
    public void managementEmploymentPackageTabOverridesSubSectionManualOverrideClickOnAddOverrideButton() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Overrides_Elements.OverrideSectionAddOverrideButton));
            this.state.getDriver().findElement(Management_Overrides_Elements.OverrideSectionAddOverrideButton).click();
            WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Added manual override')]"));
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            customLogging.customAssertTrue(true, "Added manual override successfully");
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Added manual override is NOT saved successfully");
        }
        Thread.sleep(5000);
    }


    @Then("Management: Employment Package Tab: Overrides SubSection - Click on View Changes button")
    public void managementClickOnViewChangesButtonOnOverridesSubSection() throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Overrides_Elements.OverrideSectionViewChangesButton), "Management: Employment Package Tab: Overrides SubSection - Click on View Changes button successful");
    }

    @Then("Management: Employment Package Tab: Overrides SubSection - History - Validate new saved {string} has Direct Override Amount as {string} and Office Stack Override Amount {string} is displayed")
    public void managementValidateNewSavedHasDirectOverrideAmountAsAndOfficeStackOverrideAmountIsDisplayedInHistory(String EffectiveDate, String Amount_Updated, String StackSplit_Updated) {
        customLogging.customAssertTrue(this.state.getDriver().findElement(By.xpath("//tr[ *[ text() = '" + EffectiveDate + "']]/td/div[*[text() = '$ " + Amount_Updated + ".00']]")).isDisplayed(), "Management: Employment Package Tab: Overrides SubSection - History - Validate new saved " + EffectiveDate + " has Direct Override Amount as " + Amount_Updated + " is displayed successful");
        customLogging.customAssertTrue(this.state.getDriver().findElement(By.xpath("//tr[ *[ text() = '" + EffectiveDate + "']]/td/div[ text() = '" + StackSplit_Updated + ".00 %']")).isDisplayed(), "Management: Employment Package Tab: Overrides SubSection - History - Validate new saved " + EffectiveDate + " has Office Stack Override Amount as " + StackSplit_Updated + " is displayed successful");
    }
}
