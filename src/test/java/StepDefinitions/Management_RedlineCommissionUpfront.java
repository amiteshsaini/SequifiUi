package StepDefinitions;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Management_RedlineCommissionUpfront extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Management_RedlineCommissionUpfront(TestState state) {
        super(state);
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - Click on Edit button")
    public void managementClickOnRedlineCommissionUpfrontSubSectionEditButtonOnEmploymentPackageTab() throws InterruptedException {
        Thread.sleep(5000);
        customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_EditButton), "Management: Employment Package Tab: Redline/Commission/Upfront SubSection - Click on Edit button successful");
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserCommission - Update Effective Date to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserCommissionUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserCommissionEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_CloserCommissionEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserCommission - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserCommissionEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserCommission Effective is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserCommission Effective is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserCommission - Update Percentage from {string} to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserCommissionUpdatePercentageFromTo(String CloserCommissionPercentage, String CloserCommissionPercentage_Updated) throws InterruptedException {
        if (!CloserCommissionPercentage_Updated.equals("") && !CloserCommissionPercentage_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserCommissionPercentageTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_CloserCommissionPercentageTextBox, CloserCommissionPercentage_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserCommission - Update Percentage from " + CloserCommissionPercentage + " to " + CloserCommissionPercentage_Updated + " successful");
        } else if (CloserCommissionPercentage_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserCommissionPercentageTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserCommission Percentage is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserCommission Percentage is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline - Update Effective Date to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserRedlineUpdateEffectiveDateTo(String CloserRedlineEffectiveDate) throws InterruptedException {
        if (!CloserRedlineEffectiveDate.equals("") && !CloserRedlineEffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineEffectiveDateTextBox, CloserRedlineEffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline - Update Effective Date successful");
        } else if (CloserRedlineEffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserRedline Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserRedline Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline - Select {string} from Closer Redline Type Dropdown")
    public void managementRedlineCommissionCloserRedlineUpdateCloserRedlineTypeDropdown(String CloserRedlineType) throws InterruptedException {
        if (!CloserRedlineType.equals("") && !CloserRedlineType.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineCalculatedDropdownCancelButton));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineCalculatedDropdownCancelButton), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineCalculatedDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[@class='p-dropdown-item' and @aria-label = '" + CloserRedlineType + "']")), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline SubSection - Select " + CloserRedlineType + " from Closer Redline Type Dropdown successful");
        } else if (CloserRedlineType.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedLineCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Closer Redline Type Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Closer Redline Type Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline - Update Amount from {string} to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserRedlineUpdateAmountFromTo(String CloserRedline, String CloserRedline_Updated) throws InterruptedException {
        if (!CloserRedline_Updated.equals("") && !CloserRedline_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedlineAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedlineAmountTextBox, CloserRedline_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline - Update Redline from " + CloserRedline + " to " + CloserRedline_Updated + " successful");
        } else if (CloserRedline_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserRedlineAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Closer Redline Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Closer Redline Amount is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserUpfront - Update Effective Date to {string}")
    public void managementRedlineCommissionUpfrontUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserUpfront Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserUpfront Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserUpfront - Select {string} from Calculated Dropdown")
    public void managementRedlineCommissionUpfrontUpdateCalculatedDropdown(String CalculatedDropdownValue) throws InterruptedException {
        if (!CalculatedDropdownValue.equals("") && !CalculatedDropdownValue.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontCalculatedDropdown));
            try {
                if (commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontCalculatedDropdownCancelButton)) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontCalculatedDropdown), "");
                    customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[@class='p-dropdown-item' and @aria-label = '" + CalculatedDropdownValue + "']")), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserUpfront SubSection - Select " + CalculatedDropdownValue + " from Calculated Dropdown successful");
                }
            } catch (Exception e) {

            }
        } else if (CalculatedDropdownValue.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserUpfront Calculated Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserUpfront Calculated Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserUpfront - Update Amount from {string} to {string}")
    public void managementRedlineCommissionUpfrontCloserUpfrontUpdateAmount(String CloserUpfrontAmount, String CloserUpfrontAmount_Updated) throws InterruptedException {
        if (!CloserUpfrontAmount_Updated.equals("") && !CloserUpfrontAmount_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontAmountTextBox, CloserUpfrontAmount_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserUpfront - Update Amount from " + CloserUpfrontAmount + " to " + CloserUpfrontAmount_Updated + " successful");
        } else if (CloserUpfrontAmount_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserUpfrontAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserUpfront Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserUpfront Amount is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserWithheld - Update Effective Date to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserWithheldUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserCommission - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserWithheld Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserWithheld Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserWithheld - Select {string} from Calculated Dropdown")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserWithheldSelectFromCalculatedDropdown(String CloserWithheldCalculatedDropdownValue) throws InterruptedException {
        if (!CloserWithheldCalculatedDropdownValue.equals("") && !CloserWithheldCalculatedDropdownValue.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCalculatedDropdown));
            try {
                if (commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCalculatedDropdownCancelButton)) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCalculatedDropdown), "");
                    customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[@class='p-dropdown-item' and @aria-label = '" + CloserWithheldCalculatedDropdownValue + "']")), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserWithheld SubSection - Select " + CloserWithheldCalculatedDropdownValue + " from Calculated Dropdown successful");
                }
            } catch (Exception e) {

            }
        } else if (CloserWithheldCalculatedDropdownValue.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserUpfront Calculated Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserUpfront Calculated Dropdown is not be visible");
            }
        }
    }


    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserWithheld - Update Amount from {string} to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionCloserWithheldUpdateAmountFromTo(String CloserWithheldAmount, String CloserWithheldAmount_Updated) throws InterruptedException {
        if (!CloserWithheldAmount_Updated.equals("") && !CloserWithheldAmount_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCommissionAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCommissionAmountTextBox, CloserWithheldAmount_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - CloserRedline - Update Redline from " + CloserWithheldAmount + " to " + CloserWithheldAmount_Updated + " successful");
        } else if (CloserWithheldAmount_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_CloserWithheldCommissionAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: CloserWithheld Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: CloserWithheld Amount is not be visible");
            }
        }
    }


    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterCommission - Update Effective Date to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterCommissionUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterCommissionEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_SetterCommissionEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterCommission - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterCommissionEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterCommission Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterCommission Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterCommission - Update Percentage from {string} to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterCommissionUpdatePercentageFromTo(String SetterCommissionPercentage, String SetterCommissionPercentage_Updated) throws InterruptedException {
        if (!SetterCommissionPercentage_Updated.equals("") && !SetterCommissionPercentage_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterCommissionPercentageTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_SetterCommissionPercentageTextBox, SetterCommissionPercentage_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterCommission - Update Percentage from " + SetterCommissionPercentage + " to " + SetterCommissionPercentage_Updated + " successful");
        } else if (SetterCommissionPercentage_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterCommissionPercentageTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterCommission Percentage is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterCommission Percentage is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterRedline - Update Effective Date to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterRedlineUpdateEffectiveDateTo(String SetterRedlineEffectiveDate) throws InterruptedException {
        if (!SetterRedlineEffectiveDate.equals("") && !SetterRedlineEffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineEffectiveDateTextBox, SetterRedlineEffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterRedline - Update Effective Date to " + SetterRedlineEffectiveDate + " successful");
        } else if (SetterRedlineEffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterRedline Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterRedline Effective Date is not be visible");
            }
        }
    }


    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterRedline - Select {string} from Setter Redline Type Dropdown")
    public void managementRedlineCommissionCloserRedlineUpdateSetterRedlineTypeDropdown(String SetterRedlineType) throws InterruptedException {
        if (!SetterRedlineType.equals("") && !SetterRedlineType.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineCalculatedDropdown));
            if (commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineCalculatedDropdownCancelButton)) {
                customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineCalculatedDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[@class='p-dropdown-item' and @aria-label = '" + SetterRedlineType + "']")), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterRedline SubSection - Select " + SetterRedlineType + " from SetterRedlineType Dropdown successful");
            }
        } else if (SetterRedlineType.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedLineCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Setter Redline Type Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Setter Redline Type Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterRedline - Update Amount from {string} to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterRedlineUpdateAmountFromTo(String SetterRedline, String SetterRedline_Updated) throws InterruptedException {
        if (!SetterRedline_Updated.equals("") && !SetterRedline_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedlineAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedlineAmountTextBox, SetterRedline_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterRedline - Update Redline from " + SetterRedline + " to " + SetterRedline_Updated + " successful");
        } else if (SetterRedline_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterRedlineAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: Setter Redline Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: Setter Redline Amount is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterUpfront - Update Effective Date to {string}")
    public void managementRedlineCommissionSetterUpfrontUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterUpfront SubSection - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterUpfront Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterUpfront Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterUpfront - Select {string} from Calculated Dropdown")
    public void managementRedlineCommissionSetterUpfrontUpdateCalculatedDropdown(String CalculatedDropdownValue) throws InterruptedException {
        if (!CalculatedDropdownValue.equals("") && !CalculatedDropdownValue.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontCalculatedDropdown));
            try {
                if (commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontCalculatedDropdownCancelButton)) {
                    customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontCalculatedDropdown), "");
                    customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[@class='p-dropdown-item' and @aria-label = '" + CalculatedDropdownValue + "']")), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterUpfront SubSection - Select " + CalculatedDropdownValue + " from Calculated Dropdown successful");
                }
            } catch (Exception e) {
            }
        } else if (CalculatedDropdownValue.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterUpfront Calculated Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterUpfront Calculated Dropdown is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterUpfront - Update Amount from {string} to {string}")
    public void managementRedlineCommissionSetterUpfrontUpdateAmount(String SetterUpfrontAmount, String SetterUpfrontAmount_Updated) throws InterruptedException {
        if (!SetterUpfrontAmount_Updated.equals("") && !SetterUpfrontAmount_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontAmountTextBox, SetterUpfrontAmount_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterUpfront SubSection - Update Amount from " + SetterUpfrontAmount + " to " + SetterUpfrontAmount_Updated + " successful");
        } else if (SetterUpfrontAmount_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterUpfrontAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterUpfront Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterUpfront Amount is not be visible");
            }
        }
    }


    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterWithheld - Update Effective Date to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterWithheldUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterWithheld - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterWithheld Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterWithheld Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterWithheld - Select {string} from Calculated Dropdown")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterWithheldSelectFromCalculatedDropdown(String SetterWithheldCalculatedDropdownValue) throws InterruptedException {
        if (!SetterWithheldCalculatedDropdownValue.equals("") && !SetterWithheldCalculatedDropdownValue.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCalculatedDropdown));
            try {
//                if (commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCalculatedDropdownCancelButton)) {
                customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCalculatedDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.getSetterWithheldCalculatedDropdownXpathByText(SetterWithheldCalculatedDropdownValue)), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterWithheld SubSection - Select " + SetterWithheldCalculatedDropdownValue + " from Calculated Dropdown successful");
//                }
            } catch (Exception e) {

            }
        } else if (SetterWithheldCalculatedDropdownValue.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCalculatedDropdown);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterWithheld Calculated Dropdown is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterWithheld Calculated Dropdown is not be visible");
            }
        }
    }


    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterWithheld - Update Amount from {string} to {string}")
    public void managementEmploymentPackageTabRedlineCommissionUpfrontSubSectionSetterWithheldUpdateAmountFromTo(String SetterWithheldAmount, String SetterWithheldAmount_Updated) throws InterruptedException {
        if (!SetterWithheldAmount_Updated.equals("") && !SetterWithheldAmount_Updated.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCommissionAmountTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCommissionAmountTextBox, SetterWithheldAmount_Updated), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SetterWithheld - Update Amount from " + SetterWithheldAmount + " to " + SetterWithheldAmount_Updated + " successful");
        } else if (SetterWithheldAmount_Updated.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SetterWithheldCommissionAmountTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SetterWithheld Amount is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SetterWithheld Amount is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - SelfGen - Update Effective Date to {string}")
    public void managementRedlineCommissionSelfGenUpdateEffectiveDateTo(String EffectiveDate) throws InterruptedException {
        if (!EffectiveDate.equals("") && !EffectiveDate.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Management_RedlineCommissionUpfront_Elements.RCU_SelfGenEffectiveDateTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Management_RedlineCommissionUpfront_Elements.RCU_SelfGenEffectiveDateTextBox, EffectiveDate), "Management: Employment Package Tab: RedlineCommissionUpfront SubSection - Update Effective Date to " + EffectiveDate + " successful");
        } else if (EffectiveDate.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(Management_RedlineCommissionUpfront_Elements.RCU_SelfGenEffectiveDateTextBox);
                customLogging.customAssertTrue(false, "Management: Employment Package Tab: SelfGen Effective Date is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Management: Employment Package Tab: SelfGen Effective Date is not be visible");
            }
        }
    }

    @Then("Management: Employment Package Tab: RedlineCommissionUpfront SubSection - Click on Save button")
    public void managementClickOnSaveButtonOnRedlineCommissionSubSection() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Management_RedlineCommissionUpfront_Elements.RCU_SaveButton));
            if (commonMethods.absoluteClick(Management_RedlineCommissionUpfront_Elements.RCU_SaveButton)) {
                WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Employment Package Updated')]"));
                ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
                customLogging.customAssertTrue(true, "Employment Package has been Updated successfully");
            } else {
                customLogging.customAssertTrue(false, "Employee Package is NOT Updated successfully");
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Employee Package is NOT Updated successfully");
        }
    }

}

