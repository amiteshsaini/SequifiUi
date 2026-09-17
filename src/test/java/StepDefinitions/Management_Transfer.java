package StepDefinitions;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Management_Transfer extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Management_Transfer(TestState state) {
        super(state);
    }

    @Then("Management: Transfer: Click on Transfer Button")
    public void managementTransferClickOnTransferButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_TransferButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_TransferButton), "Management: Transfer: Click on Transfer Button");
    }

    @Then("Management: Transfer: Click Yes on Transfer Confirmation Popup")
    public void managementTransferClickYesOnTransferConfirmationPopup() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_TransferConfirmationYesButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_TransferConfirmationYesButton), "Management: Transfer: Click Yes on Transfer Confirmation Popup");
    }

    @Then("Management: Transfer: Update Transfer Effective Date to {string}")
    public void managementTransferUpdateTransferEffectiveDateTo(String TransferEffectiveDate) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_TransferEffectiveDate));
        customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_Transfer_Elements.Transfer_TransferEffectiveDate, TransferEffectiveDate), "Management: Transfer: Update Transfer Effective Date to " + TransferEffectiveDate);
    }

    @Then("Management: Transfer: Select {string} from Office State Dropdown")
    public void managementTransferSelectFromOfficeStateDropdown(String OfficeState) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_OfficeStateDropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_OfficeStateDropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.getXpathByText(OfficeState)), "Management: Transfer: Select " + OfficeState + " from Office State Dropdown");
    }

    @Then("Management: Transfer: Select {string} from Office Name Dropdown")
    public void managementTransferSelectFromOfficeNameDropdown(String OfficeName) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_OfficeNameDropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_OfficeNameDropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.getXpathByText(OfficeName)), "Management: Transfer: Select " + OfficeName + " from Office Name Dropdown");
    }

    @Then("Management: Transfer: IsManager checkbox is {string}")
    public void managementTransferIsManagerCheckboxIs(String IsManagerCheckbox) {
        if (IsManagerCheckbox.equals("Checked")) {
            customLogging.customAssertTrue(this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_IsManagerCheckbox).getAttribute("class").contains("p-checkbox-checked"), "Is Manager is Checked");
        } else if (IsManagerCheckbox.equals("Unchecked")) {
            customLogging.customAssertFalse(this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_IsManagerCheckbox).getAttribute("class").contains("p-checkbox-checked"), "Is Manager is Unchecked");
        }
    }

    @Then("Management: Transfer: MayActAsBothSetterAndCloser checkbox is {string}")
    public void managementTransferMayActAsBothSetterAndCloserCheckboxIs(String MayActAsBothSetterAndCloserCheckbox) {
        if (MayActAsBothSetterAndCloserCheckbox.equals("Checked")) {
            customLogging.customAssertTrue(this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_MayActAsBothSetterAndCloserCheckbox).getAttribute("class").contains("p-checkbox-checked"), "May act as both setter and closer is Checked");
        } else if (MayActAsBothSetterAndCloserCheckbox.equals("Unchecked")) {
            customLogging.customAssertFalse(this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_MayActAsBothSetterAndCloserCheckbox).getAttribute("class").contains("p-checkbox-checked"), "May act as both setter and closer is Unchecked");
        }
    }

    @Then("Management: Transfer: Select {string} from SelectNewManager Dropdown")
    public void managementTransferSelectFromSelectNewManagerDropdown(String SelectNewManager) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_SelectNewManagerDropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_SelectNewManagerDropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.getManagerXpathByText(SelectNewManager)), "Management: Transfer: Select " + SelectNewManager + " from SelectNewManager Dropdown");
    }

    @Then("Management: Transfer: Select {string} from CloserRedlineChange Dropdown")
    public void managementTransferSelectFromCloserRedlineChangeDropdown(String CloserRedlineChange) throws InterruptedException {
        if (!CloserRedlineChange.equals("") && !CloserRedlineChange.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_CloserRedlineChangeDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_CloserRedlineChangeDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//div[text()='" + CloserRedlineChange + "']")), "Management: Transfer: Select " + CloserRedlineChange + " from CloserRedlineChange Dropdown");
        } else if (CloserRedlineChange.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_CloserRedlineChangeDropdown);
                customLogging.customAssertTrue(false, "Management: Transfer: CloserRedlineChange Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: CloserRedlineChange Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Transfer: Enter {string} in CloserRedlineChangeValue TextBox")
    public void managementTransferEnterInCloserRedlineChangeValueTextBox(String CloserRedlineChangeValue) throws InterruptedException {
        if (!CloserRedlineChangeValue.equals("") && !CloserRedlineChangeValue.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_CloserRedlineChangeAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Transfer_Elements.Transfer_CloserRedlineChangeAmountTextBox, CloserRedlineChangeValue), "Management: Transfer: Enter " + CloserRedlineChangeValue + " in CloserRedlineChangeValue TextBox");
        } else if (CloserRedlineChangeValue.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_CloserRedlineChangeAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Transfer: CloserRedlineChangeValue TextBox is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: CloserRedlineChangeValue TextBox is not be visible");
            }
        }
    }

    @Then("Management: Transfer: Select {string} from CloserRedlineChangeType Dropdown")
    public void managementTransferSelectFromCloserRedlineChangeTypeDropdown(String CloserRedlineChangeType) throws InterruptedException {
        if (!CloserRedlineChangeType.equals("") && !CloserRedlineChangeType.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_CloserRedlineChangeTypeDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_CloserRedlineChangeTypeDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//div[text()='" + CloserRedlineChangeType + "']")), "Management: Transfer: Select " + CloserRedlineChangeType + " from CloserRedlineChangeType Dropdown");
        } else if (CloserRedlineChangeType.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_CloserRedlineChangeTypeDropdown);
                customLogging.customAssertTrue(false, "Management: Transfer: CloserRedlineChangeType Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: CloserRedlineChangeType Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Transfer: Select {string} from SetterRedlineChange Dropdown")
    public void managementTransferSelectFromSetterRedlineChangeDropdown(String SetterRedlineChange) throws InterruptedException {
        if (!SetterRedlineChange.equals("") && !SetterRedlineChange.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_SetterRedlineChangeDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_SetterRedlineChangeDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//div[text()='" + SetterRedlineChange + "']")), "Management: Transfer: Select " + SetterRedlineChange + " from SetterRedlineChange Dropdown");
        } else if (SetterRedlineChange.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_SetterRedlineChangeDropdown);
                customLogging.customAssertTrue(false, "Management: Transfer: SetterRedlineChange Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: SetterRedlineChange Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Transfer: Enter {string} in SetterRedlineChangeValue TextBox")
    public void managementTransferEnterInSetterRedlineChangeValueTextBox(String SetterRedlineChangeValue) throws InterruptedException {
        if (!SetterRedlineChangeValue.equals("") && !SetterRedlineChangeValue.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_SetterRedlineChangeAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_Transfer_Elements.Transfer_SetterRedlineChangeAmountTextBox, SetterRedlineChangeValue), "Management: Transfer: Enter " + SetterRedlineChangeValue + " in SetterRedlineChangeValue TextBox");
        } else if (SetterRedlineChangeValue.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_SetterRedlineChangeAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Transfer: SetterRedlineChangeValue TextBox is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: SetterRedlineChangeValue TextBox is not be visible");
            }
        }
    }

    @Then("Management: Transfer: Select {string} from SetterRedlineChangeType Dropdown")
    public void managementTransferSelectFromSetterRedlineChangeTypeDropdown(String SetterRedlineChangeType) throws InterruptedException {
        if (!SetterRedlineChangeType.equals("") && !SetterRedlineChangeType.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_SetterRedlineChangeTypeDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_SetterRedlineChangeTypeDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//div[text()='" + SetterRedlineChangeType + "']")), "Management: Transfer: Select " + SetterRedlineChangeType + " from SetterRedlineChangeType Dropdown");
        } else if (SetterRedlineChangeType.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_SetterRedlineChangeTypeDropdown);
                customLogging.customAssertTrue(false, "Management: Transfer: SetterRedlineChangeType Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: SetterRedlineChangeType Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Transfer: Select {string} from MapToManager Dropdown")
    public void managementTransferSelectFromMapToManagerDropdown(String MapToManager) throws InterruptedException {
        if (!MapToManager.equals("") && !MapToManager.equals("Should not be visible")) {
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.Transfer_MapToManagerDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Transfer_Elements.getXpathByText(MapToManager)), "Management: Transfer: Select " + MapToManager + " from MapToManager Dropdown");
        } else if (MapToManager.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_MapToManagerDropdown);
                customLogging.customAssertTrue(false, "Management: Transfer: MapToManager Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Transfer: MapToManager Dropdown is not be visible");
            }
        }
    }


    @Then("Management: Transfer: Click on Transfer Button to Save")
    public void managementTransferClickOnTransferButtonToSave() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Transfer_Elements.Transfer_TransferSaveButton));
            this.state.getDriver().findElement(Management_Transfer_Elements.Transfer_TransferSaveButton).click();
            WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Employee has been transferred')]"));
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            customLogging.customAssertTrue(true, "Employee has been transferred successfully");
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Employee transfer is NOT saved successfully");
        }
    }
}

