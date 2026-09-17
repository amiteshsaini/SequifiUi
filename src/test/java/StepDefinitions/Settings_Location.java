package StepDefinitions;

import PageObjects.*;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Settings_Location extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);
    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Settings_Location(TestState state) {
        super(state);
    }

    @Then("Settings: Locations Tab: Click")
    public void settingsLocationsTabClick() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_LocationsTab));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_LocationsTab), "Settings: Locations Tab: Click");
    }

    @Then("Settings: Locations Tab: Click on Add New button")
    public void settingsLocationsTabClickOnAddNewButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_AddNewButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_AddNewButton), "Settings: Locations Tab: Click on Add New button");
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Select {string} from State Dropdown")
    public void settingsLocationsTabAddLocationSubSectionSelectFromStateDropdown(String State) throws InterruptedException {
        if (!State.equals("") && !State.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_StateDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_StateDropdown), "");
            this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_StateDropdownValueXpath(State)).click();
        } else if (State.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_StateDropdown);
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Add Location SubSection - Select State is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Add Location SubSection - Select State is not visible");
            }
        }
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Enter State General Code to {string}")
    public void settingsLocationsTabAddLocationSubSectionUpdateStateGeneralCodeTo(String StateCode) throws InterruptedException {
        if (!StateCode.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_StateCodeTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Settings_Locations_Elements.Settings_Locations_StateCodeTextBox, StateCode), "Settings: Locations Tab: Add Location SubSection - Update State General Code to " + StateCode + " successful");
        } else if (StateCode.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_StateCodeTextBox);
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Add Location SubSection - State General Code is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Add Location SubSection - State General Code is not visible");
            }
        }
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Select {string} from Office Checkbox")
    public void settingsLocationsTabAddLocationSubSectionSelectFromOfficeCheckbox(String Office) throws InterruptedException {
        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_OfficeCheckBox), "Settings: Locations Tab: Add Location SubSection - Select " + Office + " from Office Checkbox");
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Enter {string} in Office Name Textbox")
    public void settingsLocationsTabAddLocationSubSectionEnterInOfficeNameTextbox(String OfficeName) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_OfficeNameTextBox));
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Settings_Locations_Elements.Settings_Locations_OfficeNameTextBox, OfficeName), "Settings: Locations Tab: Add Location SubSection - Enter " + OfficeName + " in Office Name Textbox");
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Enter {string} in Office Address Textbox")
    public void settingsLocationsTabAddLocationSubSectionEnterInOfficeAddressTextbox(String OfficeAddress) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_OfficeAddressTextBox));
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Settings_Locations_Elements.Settings_Locations_OfficeAddressTextBox, OfficeAddress), "");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_OfficeAddressAutoFillPopup));
        Thread.sleep(1000);
        this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_OfficeAddressAutoFillPopup).click();
//        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_OfficeAddressAutoFillPopup), "Settings: Locations Tab: Add Location SubSection - Enter " + OfficeAddress + " in Office Address Textbox");
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Enter {string} in Installation Partner Textbox")
    public void settingsLocationsTabAddLocationSubSectionEnterInInstallationPartnerTextbox(String InstallationPartner) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_InstallationPartnerTextBox));
        customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Settings_Locations_Elements.Settings_Locations_InstallationPartnerTextBox, InstallationPartner), "Settings: Locations Tab: Add Location SubSection - Enter " + InstallationPartner + " in Installation Partner Textbox");
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Enter Effective Date to {string}")
    public void settingsLocationsTabAddLocationSubSectionUpdateEffectiveDateTo(String RedLineEffectiveDate) throws InterruptedException {
        if (!RedLineEffectiveDate.equals("") && !RedLineEffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_RedlineEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Settings_Locations_Elements.Settings_Locations_RedlineEffectiveDateTextBox, RedLineEffectiveDate), "Settings: Locations Tab: Add Location SubSection - Update Effective Date to " + RedLineEffectiveDate + " successful");
        } else if (RedLineEffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_RedlineEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Add Location SubSection - Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Add Location SubSection - Effective Date is not visible");
            }
        }
    }

    @Then("Settings: Locations Tab: Add Location SubSection - Update RedLine Standard to {string}")
    public void settingsLocationsTabAddLocationSubSectionUpdateRedLineStandardTo(String RedLineStandard) throws InterruptedException {
        if (!RedLineStandard.equals("") && !RedLineStandard.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_RedlineStandardTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Settings_Locations_Elements.Settings_Locations_RedlineStandardTextBox, RedLineStandard), "Settings: Locations Tab: Add Location SubSection - Update RedLine Standard to " + RedLineStandard);
        } else if (RedLineStandard.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_RedlineStandardTextBox);
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Add Location SubSection - RedLine Standard is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Add Location SubSection -  RedLine Standard is not visible");
            }
        }
    }


    @Then("Settings: Locations Tab: Click on Add Location button to Save")
    public void settingsLocationsTabClickAddLocationButton() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_AddLocationSaveButton));
            this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_AddLocationSaveButton).click();
            WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Location added')]"));
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            customLogging.customAssertTrue(true, "Location added successfully");
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Location NOT added successfully");
        }
    }


    @Then("Settings: Locations Tab: Click on Edit button for state code {string}")
    public void settingsLocationsTabClickOnEditButtonForState(String StateCode) throws InterruptedException {
        if (!StateCode.equals("") && !StateCode.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//*[text()='" + StateCode + "'])/..)/td[8]/div/div/div/span")));
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("((//*[text()='" + StateCode + "'])/..)/td[8]/div/div/div/span")), "");
        } else if (StateCode.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(By.xpath("((//*[text()='" + StateCode + "'])/..)/td[8]/div/div/div/span"));
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Location Edit button is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Location Edit button is not visible");
            }
        }
    }

    @Then("Settings: Locations Tab: Edit Location Redline - Click on Edit button")
    public void settingsLocationsTabEditLocationRedlineClickOnEditButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_EditLocationEditButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_EditLocationEditButton), "Settings: Locations Tab: Edit Location Redline - Click on Edit button");
    }

    @Then("Settings: Locations Tab: Edit Location Redline - Click on Add Redline Link")
    public void settingsLocationsTabEditLocationRedlineClickOnAddRedlineLink() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_AddRedlineLink));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_AddRedlineLink), "Settings: Locations Tab: Edit Location Redline - Click on Add Redline Link");
    }

    @Then("Settings: Locations Tab: Edit Location Redline - Update Effective Date to {string}")
    public void settingsLocationsTabEditLocationRedlineUpdateEffectiveDateTo(String RedLineEffectiveDate) throws InterruptedException {
        if (!RedLineEffectiveDate.equals("") && !RedLineEffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_EffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_EffectiveDateTextBox, RedLineEffectiveDate), "Settings: Locations Tab: Edit Location Redline - Update Effective Date to " + RedLineEffectiveDate + " successful");
        } else if (RedLineEffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_EffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Edit Location Redline - Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Edit Location Redline - Effective Date is not visible");
            }
        }
    }

    @Then("Settings: Locations Tab: Edit Location Redline - Update RedLine Standard to {string}")
    public void settingsLocationsTabEditLocationRedlineUpdateRedLineStandardTo(String RedLineStandard) throws InterruptedException {
        if (!RedLineStandard.equals("") && !RedLineStandard.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_StandardTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_StandardTextBox, RedLineStandard), "Settings: Locations Tab: Edit Location Redline - Update RedLine Standard to " + RedLineStandard);
        } else if (RedLineStandard.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_StandardTextBox);
                customLogging.customAssertTrue(false, "Settings: Locations Tab: Edit Location Redline - RedLine Standard is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Settings: Locations Tab: Edit Location Redline -  RedLine Standard is not visible");
            }
        }
    }

    @Then("Settings: Locations Tab: Edit Location Redline - Click on Tick Button")
    public void settingsLocationsTabEditLocationRedlineClickOnTickButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_GreenTick));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_GreenTick), "Settings: Locations Tab: Edit Location Redline - Click on Tick Button");
    }

    @Then("Settings: Locations Tab: Edit Location Redline - Click on Save Button")
    public void settingsLocationsTabEditLocationRedlineClickOnSaveButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_SaveButton));
            if (commonMethods.absoluteClick(Settings_Locations_Elements.Settings_Locations_EditLocationRedline_SaveButton)) {
                WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Location updated')]"));
                ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
                customLogging.customAssertTrue(true, "Location updated successfully");
            } else {
                customLogging.customAssertTrue(false, "Location NOT updated successfully");
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Location NOT updated successfully");
        }
    }
}
