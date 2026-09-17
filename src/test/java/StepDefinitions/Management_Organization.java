package StepDefinitions;

import PageObjects.Management_Organization_Elements;
import PageObjects.Management_Overrides_Elements;
import PageObjects.Management_Transfer_Elements;
import PageObjects.Reports_Sales_Elements;
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

public class Management_Organization extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Management_Organization(TestState state) {
        super(state);
    }

    @Then("Management: Employment Package Tab: Organization SubSection - Click on Edit button")
    public void managementClickOnOverridesSubSectionEditButtonOnEmploymentPackageTab() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Organization_Elements.OrganizationSubSection_Edit_Button));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Organization_Elements.OrganizationSubSection_Edit_Button), "Management: Employment Package Tab: Organization SubSection - Click on Edit button");
    }


    @Then("Management: Employment Package Tab: Organization SubSection - Click on Add Location button")
    public void managementEmploymentPackageTabOrganizationSubSectionClickOnAddLocationButton() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Organization_Elements.OrganizationSubSection_AddLocation_Button));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Organization_Elements.OrganizationSubSection_AddLocation_Button), "Management: Employment Package Tab: Organization SubSection - Click on Add Location button");
    }

    @Then("Management: Employment Package Tab: Enter {string} in Effective Date TextBox")
    public void managementEmploymentPackageTabOrganizationSubSectionEnterDateTextBox(String Date) throws InterruptedException {
        if (!Date.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Organization_Elements.OrganizationSubSection_EffectiveDateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_Organization_Elements.OrganizationSubSection_EffectiveDateTextbox, Date), "Management: Employment Package Tab: Enter " + Date + " in Effective Date TextBox");
        }
    }

    @Then("Management: Employment Package Tab: Organization SubSection - Additional Office Location - Select {string} from Select State Dropdown")
    public void managementEmploymentPackageTabOrganizationSubSectionAdditionalOfficeLocationSelectFromSelectStateDropdown(String AdditionalOfficeLocation_State) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Organization_Elements.OrganizationSubSection_AdditionalOfficeLocation_State_Dropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Organization_Elements.OrganizationSubSection_AdditionalOfficeLocation_State_Dropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Organization_Elements.getXpathByText(AdditionalOfficeLocation_State)), "Management: Employment Package Tab: Organization SubSection - Additional Office Location - Select " + AdditionalOfficeLocation_State + " from Select State Dropdown");
    }

    @Then("Management: Employment Package Tab: Organization SubSection - Additional Office Location - Select {string} from Select Office Dropdown")
    public void managementEmploymentPackageTabOrganizationSubSectionAdditionalOfficeLocationSelectFromSelectOfficeDropdown(String AdditionalOfficeLocation_Office) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Management_Organization_Elements.OrganizationSubSection_AdditionalOfficeLocation_Office_Dropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Organization_Elements.OrganizationSubSection_AdditionalOfficeLocation_Office_Dropdown), "");
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_Organization_Elements.getXpathByText(AdditionalOfficeLocation_Office)), "Management: Employment Package Tab: Organization SubSection - Additional Office Location - Select " + AdditionalOfficeLocation_Office + " from Select Office Dropdown");
    }

    @Then("Management: Employment Package Tab: Organization SubSection - Click on Save button")
    public void managementEmploymentPackageTabOrganizationSubSectionClickOnSaveButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Management_Organization_Elements.OrganizationSubSection_Save_Button));
            if (commonMethods.absoluteClick(Management_Organization_Elements.OrganizationSubSection_Save_Button)) {
                this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Employment Package Updated')]")).isDisplayed();
                customLogging.customAssertTrue(true, "Employee Organization SubSection has been updated successfully");
            } else {
                customLogging.customAssertTrue(false, "Employee Organization SubSection is NOT updated");
            }
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Employee Organization SubSection is NOT updated \n" + e.getStackTrace());
        }
    }
}
