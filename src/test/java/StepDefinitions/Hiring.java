package StepDefinitions;

import PageObjects.*;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Hiring extends AbstractStepDefinitions {

    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);
    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Hiring(TestState state) {
        super(state);
    }


    @When("Hiring: Hiring Menu: Click")
    public void user_click_on_HiringMenu() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.HiringMenu));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.HiringMenu), "Hiring: Hiring Menu: Click");
    }

    @When("Hiring: Onboarding: Click on Onboarding Employees Tab")
    public void user_click_on_OnboardingEmployeesTab() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.OnboardingTab));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.OnboardingTab), "Hiring: Onboarding: Click on Onboarding Employees Tab");
    }

    @When("Hiring: Onboarding: Click on Hire New Button")
    public void user_click_on_HireNewButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.HireNewButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.HireNewButton), "Hiring: Onboarding: Click on Hire New Button");
    }

    @When("Hiring: Onboarding: Hire New: Details: Enter {string} as First Name")
    public void hiringUserEntersFirstName(String firstName) throws InterruptedException {
        if (!firstName.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.FirstNameTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.FirstNameTextBox, firstName), "Hiring: Onboarding: Hire New: Details: Enter " + firstName + " as First Name");
        }
    }

    @When("Hiring: Onboarding: Hire New: Details: Enter {string} as Last Name")
    public void hiringUserEntersLastName(String lastName) throws InterruptedException {
        if (!lastName.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.LastNameTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.LastNameTextBox, lastName), "Hiring: Onboarding: Hire New: Details: Enter " + lastName + " as Last Name");
        }
    }

    @When("Hiring: Onboarding: Hire New: Details: Enter {string} as Email")
    public void hiringUserEntersEmail(String Email) throws InterruptedException {
        if (!Email.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.EmailTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.EmailTextBox, Email), "Hiring: Onboarding: Hire New: Details: Enter " + Email + " as Email");
        }
    }

    @When("Hiring: Onboarding: Hire New: Details: Enter {string} as Phone")
    public void hiringUserEntersPhone(String Phone) throws InterruptedException {
        if (!Phone.equals("")) {
            try {
                this.state.getDriver().findElement(HiringElements.PhoneTextBox).sendKeys(Phone);
            } catch (Exception e) {

            }
            int count = 0;
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.PhoneTextBox));
            while (this.state.getDriver().findElement(HiringElements.PhoneTextBox).getText() != Phone && count < 5) {
                customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.PhoneTextBox, Phone), "Hiring: Onboarding: Hire New: Details: Enter " + Phone + " as Phone");
                count++;
            }
        }
    }

    @When("Hiring: Onboarding: Hire New: Details: Select {string} from Office Location State dropdown")
    public void hiringUserSelectStateFromDropdown(String OfficeState) throws InterruptedException {
        if (!OfficeState.equals("")) {
            do {
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.OfficeLocationStateDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.getOfficeLocationStateDropdownXpath(OfficeState)), "Hiring: Onboarding: Hire New: Details: Select " + OfficeState + " from Office Location State dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.OfficeLocationStateDropdownValue).getText().equalsIgnoreCase(OfficeState));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Details: Select {string} from Office Location Office dropdown")
    public void hiringOnboardingHireNewDetailsSelectFromOfficeLocationOfficeDropdown(String Office) throws InterruptedException {
        if (!Office.equals("")) {
            do {
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.OfficeLocationOfficeDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.getOfficeLocationOfficeDropdownXpath(Office)), "Hiring: Onboarding: Hire New: Details: Select " + Office + " from Office Location Office dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.OfficeLocationOfficeDropdownValue).getAttribute("value").equalsIgnoreCase(Office));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Details: Click on Save and Continue Button")
    public void hiringOnboardingHireNewDetailsClickOnSaveAndContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Details_SaveAndContinueButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Details_SaveAndContinueButton), "Hiring: Onboarding: Hire New: Details: Click on Save and Continue Button");
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Select {string} from Department Dropdown")
    public void hiringOnboardingHireNewOrganizationSelectFromDepartmentDropdown(String Department) throws InterruptedException {
        if (!Department.equals("")) {
            do {
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_DepartmentDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_DepartmentDropdownValueXpath(Department)), "Hiring: Onboarding: Hire New: Organization: Select " + Department + " from Department Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Organization_DepartmentDropdownValue).getText().equalsIgnoreCase(Department));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Select {string} from Position Dropdown")
    public void hiringOnboardingHireNewOrganizationSelectFromPositionDropdown(String Position) throws InterruptedException {
        if (!Position.equals("")) {
            do {
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_PositionDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_PositionDropdownValueXpath(Position)), "Hiring: Onboarding: Hire New: Organization: Select " + Position + " from Position Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Organization_PositionDropdownValue).getText().equalsIgnoreCase(Position));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Select {string} from IsManager Checkbox")
    public void hiringOnboardingHireNewOrganizationSelectFromIsManagerCheckbox(String IsManager) throws
            InterruptedException {
        if (!IsManager.equals("")) {
            customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_IsManagerCheckbox), "Hiring: Onboarding: Hire New: Organization: Select " + IsManager + " from IsManager Checkbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Select {string} from May act as both setter and closer Checkbox")
    public void hiringOnboardingHireNewOrganizationSelectFromMayActAsBothSetterAndCloserCheckbox(String MayActAsBothSetterAndCloser) throws InterruptedException {
        if (!MayActAsBothSetterAndCloser.equals("")) {
            customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_MayActAsBothSetterAndCloserCheckbox), "Hiring: Onboarding: Hire New: Organization: Select " + MayActAsBothSetterAndCloser + " from MayActAsBothSetterAndCloser Checkbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Select {string} from Manager Dropdown")
    public void hiringOnboardingHireNewOrganizationSelectFromManagerDropdown(String Manager) throws InterruptedException {
        if (!Manager.equals("")) {
            do {
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_ManagerDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_ManagerDropdownValueXpath(Manager)), "Hiring: Onboarding: Hire New: Organization: Select " + Manager + " from Manager Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Organization_ManagerDropdownValue).getAttribute("value").equalsIgnoreCase(Manager));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Select {string} from Team Dropdown")
    public void hiringOnboardingHireNewOrganizationSelectFromTeamDropdown(String Team) throws InterruptedException {
        if (!Team.equals("")) {
            do {
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_TeamDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_TeamDropdownValueXpath(Team)), "Hiring: Onboarding: Hire New: Organization: Select " + Team + " from Team Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Organization_TeamDropdownValue).getAttribute("value").equalsIgnoreCase(Team));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Enter {string} in Recruiter Textbox")
    public void hiringOnboardingHireNewOrganizationEnterInRecruiterTextbox(String Recruiter) throws InterruptedException {
        if (!Recruiter.equals("")) {
            customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_RecruiterTextbox), "");
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Organization_RecruiterTextbox, Recruiter), "");
//            JavascriptExecutor executor = (JavascriptExecutor) this.state.getDriver();
//            executor.executeScript("arguments[0].click();", this.state.getDriver().findElement(HiringElements.getRecruiterXpath(Recruiter)));
//            Thread.sleep(1000);
//            Actions action = new Actions(this.state.getDriver());
//            WebElement element = this.state.getDriver().findElement(HiringElements.getRecruiterXpath(Recruiter));
//            action.moveToElement(this.state.getDriver().findElement(HiringElements.getRecruiterXpath(Recruiter))).moveToElement(element).click().perform();
            commonMethods.absoluteClick(HiringElements.getRecruiterXpath(Recruiter));
            Thread.sleep(1000);
        }
    }

    @Then("Hiring: Onboarding: Hire New: Organization: Click on Save and Continue Button")
    public void hiringOnboardingHireNewOrganizationClickOnSaveAndContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Organization_SaveAndContinueButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Organization_SaveAndContinueButton), "Hiring: Onboarding: Hire New: Organization: Click on Save and Continue Button");
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Closer Commission Textbox")
    public void hiringOnboardingHireNewCompensationEnterInCloserCommissionTextbox(String CloserCommission) throws InterruptedException {
        if (!CloserCommission.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_CloserCommissionTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_CloserCommissionTextbox, CloserCommission), "Hiring: Onboarding: Hire New: Organization: Click on Save and Continue Button");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Closer Redline Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromCloserRedlineTypeDropdown(String CloserRedlineType) throws InterruptedException {
        if (!CloserRedlineType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserRedlineTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserRedlineTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserRedlineTypeDropDownValueXpath(CloserRedlineType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserRedlineTypeDropDownValueXpath(CloserRedlineType)), "Hiring: Onboarding: Hire New: Compensation: Select " + CloserRedlineType + " from Closer Redline Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_CloserRedlineTypeDropDownValue).getText().equalsIgnoreCase(CloserRedlineType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Closer Redline Amount Textbox")
    public void hiringOnboardingHireNewCompensationEnterInCloserRedlineAmountTextbox(String CloserRedline) throws InterruptedException {
        if (!CloserRedline.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_CloserRedlineTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_CloserRedlineTextbox, CloserRedline), "Hiring: Onboarding: Hire New: Compensation: Enter " + CloserRedline + " in Closer Redline Amount Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Closer Redline Per Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromCloserRedlinePerTypeDropdown(String CloserRedlinePerType) throws InterruptedException {
        if (!CloserRedlinePerType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserRedlinePerTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserRedlinePerTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserRedlinePerTypeDropDownValueXpath(CloserRedlinePerType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserRedlinePerTypeDropDownValueXpath(CloserRedlinePerType)), "Hiring: Onboarding: Hire New: Compensation: Select " + CloserRedlinePerType + " from Closer Redline Per Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_CloserRedlinePerTypeDropDownValue).getAttribute("value").equalsIgnoreCase(CloserRedlinePerType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Closer Upfront Pay Textbox")
    public void hiringOnboardingHireNewCompensationEnterInCloserUpfrontPayTextbox(String CloserUpfrontPay) throws InterruptedException {
        if (!CloserUpfrontPay.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_CloserUpfrontPayTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_CloserUpfrontPayTextbox, CloserUpfrontPay), "Hiring: Onboarding: Hire New: Compensation: Enter " + CloserUpfrontPay + " in Closer Upfront Pay Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Closer Upfront Pay Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromCloserUpfrontPayTypeDropdown(String CloserUpfrontPayPerType) throws InterruptedException {
        if (!CloserUpfrontPayPerType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserUpfrontPayPerTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserUpfrontPayPerTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserUpfrontPayPerTypeValueXpath(CloserUpfrontPayPerType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserUpfrontPayPerTypeValueXpath(CloserUpfrontPayPerType)), "Hiring: Onboarding: Hire New: Compensation: Select " + CloserUpfrontPayPerType + " from Closer Upfront Pay Per Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_CloserUpfrontPayPerTypeDropDownValue).getText().equalsIgnoreCase(CloserUpfrontPayPerType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Closer Withheld Amount Textbox")
    public void hiringOnboardingHireNewCompensationEnterInCloserWithheldAmountTextbox(String CloserWithheldAmount) throws InterruptedException {
        if (!CloserWithheldAmount.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_CloserWithheldAmountTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_CloserWithheldAmountTextbox, CloserWithheldAmount), "Hiring: Onboarding: Hire New: Compensation: Enter " + CloserWithheldAmount + " in Closer Withheld Amount Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Closer Withheld Amount Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromCloserWithheldAmountTypeDropdown(String CloserWithheldAmountPerType) throws InterruptedException {
        if (!CloserWithheldAmountPerType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserWithheldAmountPerTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserWithheldAmountPerTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_CloserWithheldAmountPerTypeValueXpath(CloserWithheldAmountPerType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_CloserWithheldAmountPerTypeValueXpath(CloserWithheldAmountPerType)), "Hiring: Onboarding: Hire New: Compensation: Select " + CloserWithheldAmountPerType + " from Closer Withheld Amount Per Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_CloserWithheldAmountPerTypeDropDownValue).getText().equalsIgnoreCase(CloserWithheldAmountPerType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Setter Commission Textbox")
    public void hiringOnboardingHireNewCompensationEnterInSetterCommissionTextbox(String SetterCommission) throws InterruptedException {
        if (!SetterCommission.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_SetterCommissionTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_SetterCommissionTextbox, SetterCommission), "Hiring: Onboarding: Hire New: Compensation: Enter " + SetterCommission + " in Setter Commission Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Setter Redline Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromSetterRedlineTypeDropdown(String SetterRedlineType) throws InterruptedException {
        if (!SetterRedlineType.equals("")) {
            do {
//                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterRedlineTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterRedlineTypeDropDown), "");
//                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterRedlineTypeDropDownValueXpath(SetterRedlineType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterRedlineTypeDropDownValueXpath(SetterRedlineType)), "Hiring: Onboarding: Hire New: Compensation: Select " + SetterRedlineType + " from Setter Redline Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_SetterRedlineTypeDropDownValue).getText().equalsIgnoreCase(SetterRedlineType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Setter Redline Textbox")
    public void hiringOnboardingHireNewCompensationEnterInSetterRedlineTextbox(String SetterRedline) throws InterruptedException {
        if (!SetterRedline.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_SetterRedlineTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_SetterRedlineTextbox, SetterRedline), "Hiring: Onboarding: Hire New: Compensation: Enter " + SetterRedline + " in Setter Redline Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Setter Redline Per Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromSetterRedlinePerTypeDropdown(String SetterRedlinePerType) throws InterruptedException {
        if (!SetterRedlinePerType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterRedlinePerTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterRedlinePerTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterRedlinePerTypeDropDownValueXpath(SetterRedlinePerType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterRedlinePerTypeDropDownValueXpath(SetterRedlinePerType)), "Hiring: Onboarding: Hire New: Compensation: Select " + SetterRedlinePerType + " from Setter Redline Per Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_SetterRedlinePerTypeDropDownValue).getText().equalsIgnoreCase(SetterRedlinePerType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Setter Upfront Pay Textbox")
    public void hiringOnboardingHireNewCompensationEnterInSetterUpfrontPayTextbox(String SetterUpfrontPay) throws InterruptedException {
        if (!SetterUpfrontPay.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_SetterUpfrontPayTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_SetterUpfrontPayTextbox, SetterUpfrontPay), "Hiring: Onboarding: Hire New: Compensation: Enter " + SetterUpfrontPay + " in Setter Upfront Pay Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Setter Upfront Pay Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromSetterUpfrontPayTypeDropdown(String SetterUpfrontPayPerType) throws InterruptedException {
        if (!SetterUpfrontPayPerType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterUpfrontPayPerTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterUpfrontPayPerTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterUpfrontPayPerTypeDropDownValueXpath(SetterUpfrontPayPerType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterUpfrontPayPerTypeDropDownValueXpath(SetterUpfrontPayPerType)), "Hiring: Onboarding: Hire New: Compensation: Select " + SetterUpfrontPayPerType + " from Setter Upfront Pay Per Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_SetterUpfrontPayPerTypeDropDownValue).getText().equalsIgnoreCase(SetterUpfrontPayPerType));
        }
    }


    @Then("Hiring: Onboarding: Hire New: Compensation: Select {string} from Setter Withheld Type Dropdown")
    public void hiringOnboardingHireNewCompensationSelectFromSetterWithheldTypeDropdown(String SetterWithheldType) throws InterruptedException {
        if (!SetterWithheldType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterWithheldTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterWithheldTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SetterWithheldPayPerTypeDropDownValueXpath(SetterWithheldType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SetterWithheldPayPerTypeDropDownValueXpath(SetterWithheldType)), "Hiring: Onboarding: Hire New: Compensation: Select " + SetterWithheldType + " from Setter Withheld Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_SetterWithheldTypeDropDownValue).getText().equalsIgnoreCase(SetterWithheldType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Setter Withheld Amount Textbox")
    public void hiringOnboardingHireNewCompensationEnterInSetterWithheldAmountTextbox(String SetterWithheldAmount) throws InterruptedException {
        if (!SetterWithheldAmount.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_SetterWithheldAmountTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_SetterWithheldAmountTextbox, SetterWithheldAmount), "Hiring: Onboarding: Hire New: Compensation: Enter " + SetterWithheldAmount + " in Setter Withheld Amount Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Self Gen Commission Type Dropdown")
    public void hiringOnboardingHireNewCompensationEnterInSelfGenCommissionTypeDropdown(String SelfGenCommissionType) throws InterruptedException {
        if (!SelfGenCommissionType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SelfGenCommissionTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SelfGenCommissionTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Commission_SelfGenCommissionTypeDropDownValueXpath(SelfGenCommissionType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SelfGenCommissionTypeDropDownValueXpath(SelfGenCommissionType)), "Hiring: Onboarding: Hire New: Compensation: Enter " + SelfGenCommissionType + " in Self Gen Commission Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Commission_SelfGenCommissionTypeDropDownValue).getText().equalsIgnoreCase(SelfGenCommissionType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Enter {string} in Self Gen Commission Textbox")
    public void hiringOnboardingHireNewCompensationEnterInSelfGenCommissionTextbox(String SelfGenCommission) throws InterruptedException {
        if (!SelfGenCommission.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_SelfGenCommissionTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Commission_SelfGenCommissionTextbox, SelfGenCommission), "Hiring: Onboarding: Hire New: Compensation: Enter " + SelfGenCommission + " in Self Gen Commission Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Compensation: Click on Save and Continue Button")
    public void hiringOnboardingHireNewCompensationClickOnSaveAndContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Commission_SaveAndContinueButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Commission_SaveAndContinueButton), "Hiring: Onboarding: Hire New: Compensation: Click on Save and Continue Button");
        Thread.sleep(1000);
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Select {string} from Direct Overrides Type Dropdown")
    public void hiringOnboardingHireNewOverridesSelectFromDirectOverridesTypeDropdown(String DirectOverridesType) throws InterruptedException {
        if (!DirectOverridesType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Overrides_DirectOverridesTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_DirectOverridesTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Overrides_DirectOverridesTypeDropDownValueXpath(DirectOverridesType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_DirectOverridesTypeDropDownValueXpath(DirectOverridesType)), "Hiring: Onboarding: Hire New: Overrides: Select " + DirectOverridesType + " from Direct Overrides Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Overrides_DirectOverridesTypeDropDownValue).getText().equalsIgnoreCase(DirectOverridesType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Enter {string} in Direct Overrides Textbox")
    public void hiringOnboardingHireNewOverridesEnterInDirectOverridesTextbox(String DirectOverrides) throws InterruptedException {
        if (!DirectOverrides.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Overrides_DirectOverridesTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Overrides_DirectOverridesTextbox, DirectOverrides), "Hiring: Onboarding: Hire New: Overrides: Enter " + DirectOverrides + " in Direct Overrides Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Select {string} from Indirect Overrides Type Dropdown")
    public void hiringOnboardingHireNewOverridesSelectFromIndirectOverridesTypeDropdown(String IndirectOverridesType) throws InterruptedException {
        if (!IndirectOverridesType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Overrides_IndirectOverridesTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_IndirectOverridesTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Overrides_IndirectOverridesTypeDropDownValueXpath(IndirectOverridesType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_IndirectOverridesTypeDropDownValueXpath(IndirectOverridesType)), "Hiring: Onboarding: Hire New: Overrides: Select " + IndirectOverridesType + " from Indirect Overrides Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Overrides_IndirectOverridesTypeDropDownValue).getText().equalsIgnoreCase(IndirectOverridesType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Enter {string} in Indirect Overrides Textbox")
    public void hiringOnboardingHireNewOverridesEnterInIndirectOverridesTextbox(String IndirectOverrides) throws InterruptedException {
        if (!IndirectOverrides.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Overrides_IndirectOverridesTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Overrides_IndirectOverridesTextbox, IndirectOverrides), "Hiring: Onboarding: Hire New: Overrides: Enter " + IndirectOverrides + " in Indirect Overrides Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Select {string} from Office Overrides Type Dropdown")
    public void hiringOnboardingHireNewOverridesSelectFromOfficeOverridesTypeDropdown(String OfficeOverridesType) throws InterruptedException {
        if (!OfficeOverridesType.equals("")) {
            do {
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Overrides_OfficeOverridesTypeDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_OfficeOverridesTypeDropDown), "");
                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Overrides_OfficeOverridesTypeDropDownValueXpath(OfficeOverridesType)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_OfficeOverridesTypeDropDownValueXpath(OfficeOverridesType)), "Hiring: Onboarding: Hire New: Overrides: Select " + OfficeOverridesType + " from Office Overrides Type Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Overrides_OfficeOverridesTypeDropDownValue).getText().equalsIgnoreCase(OfficeOverridesType));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Enter {string} in Office Overrides Textbox")
    public void hiringOnboardingHireNewOverridesEnterInOfficeOverridesTextbox(String OfficeOverrides) throws InterruptedException {
        if (!OfficeOverrides.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Overrides_OfficeOverridesTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Overrides_OfficeOverridesTextbox, OfficeOverrides), "Hiring: Onboarding: Hire New: Overrides: Enter " + OfficeOverrides + " in Office Overrides Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Overrides: Click on Save and Continue Button")
    public void hiringOnboardingHireNewOverridesClickOnSaveAndContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Overrides_SaveAndContinueButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Overrides_SaveAndContinueButton), "Hiring: Onboarding: Hire New: Overrides: Click on Save and Continue Button");
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Select {string} from Probation Period Dropdown")
    public void hiringOnboardingHireNewAgreementSelectFromProbationPeriodDropdown(String ProbationPeriod) throws InterruptedException {
        if (!ProbationPeriod.equals("")) {
            do {
//                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Agreement_ProbationPeriodDropDown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Agreement_ProbationPeriodDropDown), "");
//                wait.until(ExpectedConditions.presenceOfElementLocated(HiringElements.NewHire_Agreement_ProbationPeriodDropDownValueXpath(ProbationPeriod)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Agreement_ProbationPeriodDropDownValueXpath(ProbationPeriod)), "Hiring: Onboarding: Hire New: Agreement: Select " + ProbationPeriod + " from Probation Period Dropdown");
            } while (!this.state.getDriver().findElement(HiringElements.NewHire_Agreement_ProbationPeriodDropDownValue).getText().equalsIgnoreCase(ProbationPeriod));
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Select {string} from Offer includes bonus Checkbox")
    public void hiringOnboardingHireNewAgreementSelectFromOfferIncludesBonusCheckbox(String OfferIncludesBonus) throws InterruptedException {
        if (!OfferIncludesBonus.equals("")) {
            customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Agreement_OfferIncludesBonusCheckbox), "Hiring: Onboarding: Hire New: Agreement: Select " + OfferIncludesBonus + " from Offer includes bonus Checkbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Enter {string} in Date To Be Paid Textbox")
    public void hiringOnboardingHireNewAgreementEnterDateToBePaidTextbox(String DateToBePaid) throws InterruptedException {
        if (!DateToBePaid.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Agreement_OfferDateToBePaidTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(HiringElements.NewHire_Agreement_OfferDateToBePaidTextbox, DateToBePaid), "Hiring: Onboarding: Hire New: Agreement: Enter " + DateToBePaid + " in Date To Be Paid Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Enter {string} in Resign Bonus Textbox")
    public void hiringOnboardingHireNewAgreementEnterResignBonusTextbox(String ResignBonus) throws InterruptedException {
        if (!ResignBonus.equals("")) {
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Agreement_ResignBonusTextbox, ResignBonus), "Hiring: Onboarding: Hire New: Agreement: Enter " + ResignBonus + " in Resign Bonus Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Enter {string} in Period of Agreement Start Date Textbox")
    public void hiringOnboardingHireNewAgreementEnterInPeriodOfAgreementStartDateTextbox(String PeriodOfAgreementStartDate) throws InterruptedException {
        if (!PeriodOfAgreementStartDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Agreement_PeriodOfAgreementStartDateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(HiringElements.NewHire_Agreement_PeriodOfAgreementStartDateTextbox, PeriodOfAgreementStartDate), "Hiring: Onboarding: Hire New: Agreement: Enter " + PeriodOfAgreementStartDate + " in Period of Agreement Start Date Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Enter {string} in Period of Agreement End Date Textbox")
    public void hiringOnboardingHireNewAgreementEnterInPeriodOfAgreementEndDateTextbox(String PeriodOfAgreementEndDate) throws InterruptedException {
        if (!PeriodOfAgreementEndDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Agreement_PeriodOfAgreementEndDateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(HiringElements.NewHire_Agreement_PeriodOfAgreementEndDateTextbox, PeriodOfAgreementEndDate), "Hiring: Onboarding: Hire New: Agreement: Enter " + PeriodOfAgreementEndDate + " in Period of Agreement End Date Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Enter {string} in Offer Expiry Date Textbox")
    public void hiringOnboardingHireNewAgreementEnterInOfferExpiryDateTextbox(String OfferExpiryDate) throws InterruptedException {
        if (!OfferExpiryDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Agreement_OfferExpiryDateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(HiringElements.NewHire_Agreement_OfferExpiryDateTextbox, OfferExpiryDate), "Hiring: Onboarding: Hire New: Agreement: Enter " + OfferExpiryDate + " in Offer Expiry Date Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Click on Save and Continue Button")
    public void hiringOnboardingHireNewAgreementClickOnSaveAndContinueButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Agreement_SaveAndContinueButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Agreement_SaveAndContinueButton), "Hiring: Onboarding: Hire New: Agreement: Click on Save and Continue Button");
    }

    @Then("Hiring: Onboarding: Hire New: Finish: Select {string} from Acknowledge Checkbox")
    public void hiringOnboardingHireNewFinishSelectFromAcknowledgeCheckbox(String Acknowledge) throws InterruptedException {
        if (!Acknowledge.equals("")) {
            Thread.sleep(2000);
            customLogging.customAssertTrue(commonMethods.absoluteClick(HiringElements.NewHire_Finish_AcknowledgeTextbox), "Hiring: Onboarding: Hire New: Finish: Select " + Acknowledge + " from Acknowledge Checkbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Enter {string} in Name Textbox")
    public void hiringOnboardingHireNewAgreementEnterInNameTextbox(String Name) throws InterruptedException {
        if (!Name.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Finish_NameTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(HiringElements.NewHire_Finish_NameTextbox, Name), "Hiring: Onboarding: Hire New: Agreement: Enter " + Name + " in Name Textbox");
        }
    }

    @Then("Hiring: Onboarding: Hire New: Agreement: Click on Hire Directly")
    public void hiringOnboardingHireNewAgreementClickOnHireDirectly() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HiringElements.NewHire_Finish_HireDirectlyButton));
            this.state.getDriver().findElement(HiringElements.NewHire_Finish_HireDirectlyButton).click();
            Thread.sleep(1000);
            WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Employee Hired')]"));
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            customLogging.customAssertTrue(true, "Employee Hired successfully");
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Employee NOT Hired successfully");
        }
    }
}

