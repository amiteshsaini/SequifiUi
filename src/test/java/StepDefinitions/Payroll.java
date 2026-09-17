package StepDefinitions;

import PageObjects.Management_Overrides_Elements;
import PageObjects.Payroll_Elements;
import PageObjects.Reports_Sales_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Payroll extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Payroll(TestState state) {
        super(state);
    }

    @Then("Payroll: Payroll Menu: Click")
    public void payrollClickOnPayrollMenu() throws InterruptedException {
        Thread.sleep(2000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.Payroll_Menu));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.Payroll_Menu), "Payroll: Payroll Menu: Click");
        Thread.sleep(2000);
    }

    @Then("Payroll: RunPayroll - Select {string} from Payroll Frequency dropdown")
    public void payrollRunPayrollSelectFromPayrollFrequencyDropdown(String PayrollFrequency) throws InterruptedException {
        if (!PayrollFrequency.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.PayrollFrequencyDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.PayrollFrequencyDropdown), "");
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.PayrollFrequency(PayrollFrequency)));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.PayrollFrequency(PayrollFrequency)), "Payroll: RunPayroll - Select " + PayrollFrequency + " from Payroll Frequency dropdown");
        }
    }

    @Then("Payroll: RunPayroll - Select {string} from Payroll Period dropdown")
    public void payrollRunPayrollSelectFromPayrollPeriodDropdown(String PayrollPeriod) throws InterruptedException {
        if (!PayrollPeriod.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.PayrollPeriodDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.PayrollPeriodDropdown), "");
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.getPayrollPeriodXpath(PayrollPeriod)));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.getPayrollPeriodXpath(PayrollPeriod)), "Payroll: RunPayroll - Select " + PayrollPeriod + " from Payroll Period dropdown");
        }
    }

    @Then("Payroll: RunPayroll - Click on commission amount for {string} {string} and validate entry of {string} with the Amount {string} and {string} is displayed")
    public void payrollRunPayrollClickOnCommissionAmountForAndValidateEntryOfWithTheAmountAndIsDisplayed(String EmployeeFirstName, String EmployeeLastName, String PID, String Amount, String Date) throws InterruptedException {
        if ((!EmployeeFirstName.equalsIgnoreCase("") && !EmployeeLastName.equalsIgnoreCase("") && !PID.equalsIgnoreCase("") && !Amount.equalsIgnoreCase("") && !Amount.equalsIgnoreCase("0.00") && !Date.equalsIgnoreCase(""))) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.getCommissionAmountXpath(EmployeeFirstName, EmployeeLastName)));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.getCommissionAmountXpath(EmployeeFirstName, EmployeeLastName)), "Payroll: RunPayroll - Click on commission amount for " + EmployeeFirstName + " " + EmployeeLastName);
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.getXpathForEntryWithPIDAmountAndDate(PID, Amount, Date)));
            customLogging.customAssertTrue(true, "Payroll: RunPayroll - Validate entry of " + PID + " with the Amount " + Amount + " and " + Date + " is displayed");
            wait.until(ExpectedConditions.visibilityOfElementLocated(Payroll_Elements.PayrollCommissionPopupCloseButton));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Payroll_Elements.PayrollCommissionPopupCloseButton), "Payroll: RunPayroll - Click on commission amount popup Close Icon");
        }
    }
}
