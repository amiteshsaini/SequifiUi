package StepDefinitions;

import PageObjects.Reports_Sales_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Reports_Sales extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public Reports_Sales(TestState state) {
        super(state);
    }

    @Then("Reports: Reports Menu: Click")
    public void reportsClick() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Menu_Button));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Menu_Button), "Reports: Reports Menu: Click");
        Thread.sleep(2000);
    }

    @Then("Reports: Sales Tab: Click")
    public void reportsSalesTabClick() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_Tab));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_Tab), "Reports: Sales Tab: Click");
        Thread.sleep(2000);
    }

    @Then("Reports: Sales Tab: Click on Add Sale button")
    public void reportsSalesTabClickOnAddSaleButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_AddSale_Button));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_AddSale_Button), "Reports: Sales Tab: Click on Add Sale button");
        Thread.sleep(2000);
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in PID Textbox")
    public void reportsSalesTabAddSaleEnterInPIDTextbox(String PID) throws InterruptedException {
        String PidSuffix = RandomStringUtils.randomAlphanumeric(5);
        String Pid = PID + "_" + PidSuffix;
        state.setContext("Pid", Pid);
        if (!Pid.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_PidTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_PidTextbox, Pid), "Reports: Sales Tab: Enter " + Pid + " in PID Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Prospect Id Textbox")
    public void reportsSalesTabAddSaleEnterInProspectIdTextbox(String ProspectId) throws InterruptedException {
        if (!ProspectId.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ProspectIdTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_ProspectIdTextbox, ProspectId), "Reports: Sales Tab: Enter " + ProspectId + " in Prospect Id Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Homeowner Id Textbox")
    public void reportsSalesTabAddSaleEnterInHomeownerIdTextbox(String HomeownerId) throws InterruptedException {
        if (!HomeownerId.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_HomeownerIdTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_HomeownerIdTextbox, HomeownerId), "Reports: Sales Tab: Enter " + HomeownerId + " in Homeowner Id Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Proposal Id Textbox")
    public void reportsSalesTabAddSaleEnterInProposalIdTextbox(String ProposalId) throws InterruptedException {
        if (!ProposalId.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ProposalIdTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_ProposalIdTextbox, ProposalId), "Reports: Sales Tab: Enter " + ProposalId + " in Proposal Id Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Product Textbox")
    public void reportsSalesTabAddSaleEnterInProductTextbox(String Product) throws InterruptedException {
        if (!Product.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ProductTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_ProductTextbox, Product), "Reports: Sales Tab: Enter " + Product + " in Product Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Gross Value Textbox")
    public void reportsSalesTabAddSaleEnterInGrossValue(String GrossValue) throws InterruptedException {
        if (!GrossValue.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_GrossValueTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_GrossValueTextbox, GrossValue), "Reports: Sales Tab: Enter " + GrossValue + " in Gross Value Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Installer TextBox")
    public void reportsSalesTabAddSaleEnterInInstallerTextBox(String Installer) throws InterruptedException {
        if (!Installer.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_InstallerTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_InstallerTextbox, Installer), "Reports: Sales Tab: Enter " + Installer + " in Installer Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in EPC TextBox")
    public void reportsSalesTabAddSaleEnterInEPCTextBox(String EPC) throws InterruptedException {
        if (!EPC.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_EPCTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_EPCTextbox, EPC), "Reports: Sales Tab: Enter " + EPC + " in EPC Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Net EPC TextBox")
    public void reportsSalesTabAddSaleEnterInNetEPCTextBox(String NetEPC) throws InterruptedException {
        if (!NetEPC.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_NetEPCTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_NetEPCTextbox, NetEPC), "Reports: Sales Tab: Enter " + NetEPC + " in NetEPC Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in KW TextBox")
    public void reportsSalesTabAddSaleEnterInKWTextBox(String KW) throws InterruptedException {
        if (!KW.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_KWTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_KWTextbox, KW), "Reports: Sales Tab: Enter " + KW + " in KW Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Dealer Fee% TextBox")
    public void reportsSalesTabAddSaleEnterInDealerFeeTextBox(String DealerFeePercentage) throws InterruptedException {
        if (!DealerFeePercentage.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_DealerFeePercentageTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_DealerFeePercentageTextbox, DealerFeePercentage), "Reports: Sales Tab: Enter " + DealerFeePercentage + " in DealerFee% Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Dealer Fee$ TextBox")
    public void reportsSalesTabAddSaleEnterInDealerFee$TextBox(String DealerFeeAmount) throws InterruptedException {
        if (!DealerFeeAmount.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_DealerFeeAmountTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_DealerFeeAmountTextbox, DealerFeeAmount), "Reports: Sales Tab: Enter " + DealerFeeAmount + " in DealerFee$ Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in SOW $ TextBox")
    public void reportsSalesTabAddSaleEnterInSOW$TextBox(String SOWAmount) throws InterruptedException {
        if (!SOWAmount.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_SOWAmountTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_SOWAmountTextbox, SOWAmount), "Reports: Sales Tab: Enter " + SOWAmount + " in SOW $ Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer Name Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerNameTextbox(String CustomerName) throws InterruptedException {
        if (!CustomerName.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerNameTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerNameTextbox, CustomerName), "Reports: Sales Tab: Enter " + CustomerName + " in Customer Name Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer Address Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerAddressTextbox(String CustomerAddress) throws InterruptedException {
        if (!CustomerAddress.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerAddressTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerAddressTextbox, CustomerAddress), "Reports: Sales Tab: Enter " + CustomerAddress + " in Customer Address Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer Address2 Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerAddress2Textbox(String CustomerAddress2) throws InterruptedException {
        if (!CustomerAddress2.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerAddress2Textbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerAddress2Textbox, CustomerAddress2), "Reports: Sales Tab: Enter " + CustomerAddress2 + " in Customer Address2 Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer City Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerCityTextbox(String CustomerCity) throws InterruptedException {
        if (!CustomerCity.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerCityTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerCityTextbox, CustomerCity), "Reports: Sales Tab: Enter " + CustomerCity + " in Customer City Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Select {string} from Customer State Dropdown")
    public void reportsSalesTabAddSaleEnterInCustomerStateTextbox(String CustomerState) throws InterruptedException {
        if (!CustomerState.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CustomerStateDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CustomerStateDropdown), "");
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CustomerState(CustomerState)));
//            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerState(CustomerState)).click();
            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CustomerState(CustomerState)), "Reports: Sales Tab: Add Sale - Select " + CustomerState + " from Customer State Dropdown");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Select {string} of {string} from General Code Dropdown")
    public void reportsSalesTabAddSaleSelectFromGeneralCodeDropdown(String GeneralCode, String CustomerState) throws InterruptedException {
        if (!GeneralCode.equals("") && !CustomerState.equals("")) {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_GeneralCodeDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_GeneralCodeDropdown), "");
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_GeneralCode(CustomerState, GeneralCode)));
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_GeneralCode(CustomerState, GeneralCode)).click();
//            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_GeneralCode(CustomerState,GeneralCode)), "Reports: Sales Tab: Add Sale - Select " + GeneralCode + " from General Code Dropdown");
        }
    }


    @Then("Reports: Sales Tab: Add Sale - Select State and General Code")
    public void reportsSalesTabAddSaleSelectStateAndGeneralCode() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CustomerStateDropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CustomerStateDropdown), "");
        int stateListSize = this.state.getDriver().findElements(Reports_Sales_Elements.Reports_Sales_CustomerStateDropdownList).size();
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_RandomSpace), "");
        for (int i = 0; i < stateListSize; i++) {
            try {
                Thread.sleep(1000);
                customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CustomerStateDropdown), "");
                Thread.sleep(1000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CustomerStateByIndex(i)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CustomerStateByIndex(i)), "Reports: Sales Tab: Add Sale - Select State from Customer State Dropdown");
                Thread.sleep(1000);
                customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_GeneralCodeDropdown), "");
                Thread.sleep(2000);
                try {
                    if (this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_GeneralCodeNotAvailable).isDisplayed()) {
                        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_RandomSpace), "");
                        throw new RuntimeException();
                    } else {
                        this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_GeneralCode).click();
                        break;
                    }
                } catch (Exception e) {
                    this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_GeneralCode).click();
                    break;
                }
            } catch (Exception ignored) {

            }
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer Zip Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerZipTextbox(String CustomerZip) throws InterruptedException {
        if (!CustomerZip.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerZipTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerZipTextbox, CustomerZip), "Reports: Sales Tab: Enter " + CustomerZip + " in Customer Zip Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer Email Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerEmailTextbox(String CustomerEmail) throws InterruptedException {
        if (!CustomerEmail.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerEmailTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerEmailTextbox, CustomerEmail), "Reports: Sales Tab: Enter " + CustomerEmail + " in Customer Email Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Customer Phone Textbox")
    public void reportsSalesTabAddSaleEnterInCustomerPhoneTextbox(String CustomerPhone) throws InterruptedException {
        if (!CustomerPhone.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextbox));
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextbox).sendKeys(CustomerPhone);
            String ExpectedPhone = "(" + (CustomerPhone.split("-"))[0] + ") " + CustomerPhone.split("-")[1] + "-" + CustomerPhone.split("-")[2];
            int count = 0;
            while (!this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextbox).getAttribute("value").toString().equalsIgnoreCase(ExpectedPhone) && count < 10) {
                this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextbox).sendKeys(CustomerPhone);
                count++;
            }
            if (!this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextbox).getAttribute("value").toString().equalsIgnoreCase(ExpectedPhone)) {
                customLogging.customAssertTrue(false, "Reports: Sales Tab: Add Sale - Enter " + CustomerPhone + " in Customer Phone Textbox unsuccessful");
            }
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Approval Date TextBox")
    public void reportsSalesTabAddSaleEnterInApprovalDateTextBox(String ApprovalDate) throws InterruptedException {
        if (!ApprovalDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_ApprovedDateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Reports_Sales_Elements.Reports_Sales_ApprovedDateTextbox, ApprovalDate), "Reports: Sales Tab: Add Sale - Enter " + ApprovalDate + " in Approval Date TextBox");
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_ApprovedDateTextbox).sendKeys(Keys.TAB);
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in M1 Date TextBox")
    public void reportsSalesTabAddSaleEnterInMOneDateTextBox(String MOneDate) throws InterruptedException {
        if (!MOneDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_M1DateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Reports_Sales_Elements.Reports_Sales_M1DateTextbox, MOneDate), "Reports: Sales Tab: Add Sale - Enter " + MOneDate + " in M1 Date TextBox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in M2 Date TextBox")
    public void reportsSalesTabAddSaleEnterInMTwoDateTextBox(String MTwoDate) throws InterruptedException {
        if (!MTwoDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_M2DateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Reports_Sales_Elements.Reports_Sales_M2DateTextbox, MTwoDate), "Reports: Sales Tab: Add Sale - Enter " + MTwoDate + " in M2 Date TextBox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Cancel Date TextBox")
    public void reportsSalesTabAddSaleEnterInCancelDateTextBox(String CancelDate) throws InterruptedException {
        if (!CancelDate.equals("")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CancelDateTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Reports_Sales_Elements.Reports_Sales_CancelDateTextbox, CancelDate), "Reports: Sales Tab: Add Sale - Enter " + CancelDate + " in Cancel Date TextBox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Enter {string} in Adders TextBox")
    public void reportsSalesTabAddSaleEnterInAddersTextBox(String Adders) throws InterruptedException {
        if (!Adders.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_AddersTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_AddersTextbox, Adders), "Reports: Sales Tab: Enter " + Adders + " in Adders Textbox");
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Select {string} from Closer1 Name Dropdown")
    public void reportsSalesTabAddSaleEnterInCloser1NameTextBox(String CloserName) throws InterruptedException {
        if (!CloserName.equals("")) {
            Actions action = new Actions(this.state.getDriver());
            WebElement element = this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_SaveSalesButton);
            action.moveToElement(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_SaveSalesButton)).moveToElement(element).perform();
            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CloserNameDropdown), "");
            Thread.sleep(2000);
            commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CloserName(CloserName));
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Select Closer1 Name")
    public void reportsSalesTabAddSaleSelectFirstInCloser1NameTextBox() throws InterruptedException {
        Actions action = new Actions(this.state.getDriver());
        WebElement element = this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_SaveSalesButton);
        action.moveToElement(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_SaveSalesButton)).moveToElement(element).perform();
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CloserNameDropdown), "");
        int listSize = this.state.getDriver().findElements(Reports_Sales_Elements.Reports_Sales_CloserNameDropdownList).size();
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_RandomSpace), "");
        for (int i = 1; i <= listSize; i++) {
            try {
                Thread.sleep(1000);
                customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CloserNameDropdown), "");
                Thread.sleep(1000);
                commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CloserName(i));
                Thread.sleep(2000);
                String className = this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_AddSaleButtom).getAttribute("class");
                try {
                    if (className.contains("disabled")) {
                        throw new RuntimeException();
                    }
                    break;
                } catch (Exception e) {
                }
            } catch (Exception ignored) {
            }
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Select {string} from Setter1 Name Dropdown")
    public void reportsSalesTabAddSaleEnterInSetter1NameTextBox(String SetterName) throws InterruptedException {
        if (!SetterName.equals("")) {
            wait.until(ExpectedConditions.presenceOfElementLocated(Reports_Sales_Elements.Reports_Sales_SetterNameDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_SetterNameDropdown), "");
            commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_SetterName(SetterName));
        }
    }

    @Then("Reports: Sales Tab: Add Sale - Select Setter1 Name")
    public void reportsSalesTabAddSaleSelectFirstInSetter1NameTextBox() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(Reports_Sales_Elements.Reports_Sales_SetterNameDropdown));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_SetterNameDropdown), "");
        commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_FirstSetterName);
    }

    @Then("Reports: Sales Tab: Add Sale - Click on Save Sale button")
    public void reportsSalesTabAddSaleClickOnSaveSaleButton() throws InterruptedException {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_SaveSalesButton));
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_SaveSalesButton).click();
            WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Sale Added')]"));
            ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
            customLogging.customAssertTrue(true, "Sale has been saved successfully");
        } catch (Exception e) {
            customLogging.customAssertTrue(false, "Sale is NOT saved successfully");
        }
        Thread.sleep(10000);
    }

    @Then("Reports: Sales Tab: Sale - Select Custom from Select range Dropdown and enter {string} as FromDate and today as ToDate")
    public void reportsSalesTabSaleSelectCustomFromSelectRangeDropdownAndEnterAsFromDateAndTodayAsToDate(String RangeStartDate) throws InterruptedException {
        try {
            Actions action = new Actions(this.state.getDriver());
            WebElement element = this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_Title);
            action.moveToElement(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_Title)).moveToElement(element).perform();
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_DateRangeDropdwon).click();
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_DateRangeLastYear).click();
        } catch (Exception e) {
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_DateRangeDropdwon));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_DateRangeDropdwon), "");
        Thread.sleep(2000);
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_DateRangeCustom), "Reports: Sales Tab: Sale - Select Custom from Select range Dropdown");
        Thread.sleep(2000);
        customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(Reports_Sales_Elements.Reports_Sales_DateRangeCustom_StartDate, RangeStartDate), "Reports: Sales Tab: Sale - Select Custom from Select range Dropdown and enter " + RangeStartDate + " as FromDate");
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_DateRangeCustom_EndDateCalendarIcon), "");
        Thread.sleep(1000);
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_DateRangeCustom_EndDateCalendar_TodayLink), "Reports: Sales Tab: Sale - Select Custom from Select range Dropdown and enter today as ToDate");
    }


    @Then("Reports: Sales Tab: Sale - Enter PID in Customer Info Search TextBox")
    public void reportsSalesTabSaleEnterInCustomerInfoSearchTextBox() throws InterruptedException {
        String Pid = "";
        if (state.isContains("Pid")) {
            Pid = (String) state.getContext("Pid");
        }
        if (!Pid.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerInfoSearchTextbox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(Reports_Sales_Elements.Reports_Sales_CustomerInfoSearchTextbox, Pid), "Reports: Sales Tab: Sale - Enter " + Pid + " in Customer Info Search TextBox");
        }
    }

    @Then("Reports: Sales Tab: Sale - Sale Summary Click Pid Link")
    public void reportsSalesTabSaleSaleSummaryClickLink() throws InterruptedException {
        String Pid = "";
        if (state.isContains("Pid")) {
            Pid = (String) state.getContext("Pid");
        }
        if (!Pid.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerSearchPidLink(Pid)));
            customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_CustomerSearchPidLink(Pid)), "Reports: Sales Tab: Sale - Click " + Pid + " Link");
            Thread.sleep(2000);
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate PID text field")
    public void reportsSalesTabSaleSummaryValidateInPIDTextField() {
        String Pid = "";
        if (state.isContains("Pid")) {
            Pid = (String) state.getContext("Pid");
        }
        if (!Pid.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_PIDTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_PIDTextField).getText().equalsIgnoreCase(Pid), "Reports: Sales Tab: Sale Summary - " + Pid + " in PID text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Prospect ID text field")
    public void reportsSalesTabSaleSummaryValidateInProspectIDTextField(String ProspectId) {
        if (!ProspectId.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ProspectIdTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_ProspectIdTextField).getText().equalsIgnoreCase(ProspectId), "Reports: Sales Tab: Sale Summary - " + ProspectId + " in Prospect Id text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Homeowner ID text field")
    public void reportsSalesTabSaleSummaryValidateInHomeownerIDTextField(String HomeownerId) {
        if (!HomeownerId.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_HomeownerIdTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_HomeownerIdTextField).getText().equalsIgnoreCase(HomeownerId), "Reports: Sales Tab: Sale Summary - " + HomeownerId + " in Homeowner Id text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Proposal ID text field")
    public void reportsSalesTabSaleSummaryValidateInProposalIDTextField(String ProposalId) {
        if (!ProposalId.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ProposalIdTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_ProposalIdTextField).getText().equalsIgnoreCase(ProposalId), "Reports: Sales Tab: Sale Summary - " + ProposalId + " in Proposal Id text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Product text field")
    public void reportsSalesTabSaleSummaryValidateInProductTextField(String Product) {
        if (!Product.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ProductTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_ProductTextField).getText().equalsIgnoreCase(Product), "Reports: Sales Tab: Sale Summary - " + Product + " in Product text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Gross Value text field")
    public void reportsSalesTabSaleSummaryValidateInGrossValueTextField(String GrossValue) {
        if (!GrossValue.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_GrossValueTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_GrossValueTextField).getText().contains(GrossValue), "Reports: Sales Tab: Sale Summary - " + GrossValue + " in Gross Value text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Installer text field")
    public void reportsSalesTabSaleSummaryValidateInInstallerTextField(String Installer) {
        if (!Installer.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_InstallerTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_InstallerTextField).getText().equalsIgnoreCase(Installer), "Reports: Sales Tab: Sale Summary - " + Installer + " in Installer text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in EPC text field")
    public void reportsSalesTabSaleSummaryValidateInEPCTextField(String EPC) {
        if (!EPC.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_EPCTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_EPCTextField).getText().equalsIgnoreCase(EPC), "Reports: Sales Tab: Sale Summary - " + EPC + " in EPC text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Net EPC text field")
    public void reportsSalesTabSaleSummaryValidateInNetEPCTextField(String NetEPC) {
        if (!NetEPC.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_NetEPCTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_NetEPCTextField).getText().equalsIgnoreCase(NetEPC), "Reports: Sales Tab: Sale Summary - " + NetEPC + " in Net EPC text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in KW text field")
    public void reportsSalesTabSaleSummaryValidateInKWTextField(String KW) {
        if (!KW.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_KWTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_KWTextField).getText().equalsIgnoreCase(KW), "Reports: Sales Tab: Sale Summary - " + KW + " in KW text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Dealer Fee% text field")
    public void reportsSalesTabSaleSummaryValidateInDealerFeeTextField(String DealerFeePercentage) {
        if (!DealerFeePercentage.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_DealerFeePercentageTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_DealerFeePercentageTextField).getText().contains(DealerFeePercentage), "Reports: Sales Tab: Sale Summary - " + DealerFeePercentage + " in Dealer Fee Percentage text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Dealer Fee$ text field")
    public void reportsSalesTabSaleSummaryValidateInDealerFee$TextField(String DealerFeeAmount) {
        if (!DealerFeeAmount.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_DealerFeeAmountTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_DealerFeeAmountTextField).getText().replace(",", "").contains(DealerFeeAmount), "Reports: Sales Tab: Sale Summary - " + DealerFeeAmount + " in Dealer Fee Amount text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in SOW $ text field")
    public void reportsSalesTabSaleSummaryValidateInSOW$TextField(String SOWAmount) {
        if (!SOWAmount.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_SOWAmountTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_SOWAmountTextField).getText().replace(",", "").contains(SOWAmount), "Reports: Sales Tab: Sale Summary - " + SOWAmount + " in SOW Amount text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer Name text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerNameTextField(String CustomerName) {
        if (!CustomerName.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerNameTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerNameTextField).getText().equalsIgnoreCase(CustomerName), "Reports: Sales Tab: Sale Summary - " + CustomerName + " in Customer Name text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer Address text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerAddressTextField(String CustomerAddress) {
        if (!CustomerAddress.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerAddressTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerAddressTextField).getText().equalsIgnoreCase(CustomerAddress), "Reports: Sales Tab: Sale Summary - " + CustomerAddress + " in Customer Address text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer Address2 text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerAddress2TextField(String CustomerAddress2) {
        if (!CustomerAddress2.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerAddress2TextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerAddress2TextField).getText().equalsIgnoreCase(CustomerAddress2), "Reports: Sales Tab: Sale Summary - " + CustomerAddress2 + " in Customer Address2 text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer City text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerCityTextField(String CustomerCity) {
        if (!CustomerCity.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerCityTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerCityTextField).getText().equalsIgnoreCase(CustomerCity), "Reports: Sales Tab: Sale Summary - " + CustomerCity + " in Customer City text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} from Customer State text field")
    public void reportsSalesTabSaleSummaryValidateFromCustomerStateTextField(String CustomerState) {
        if (!CustomerState.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerStateTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerStateTextField).getText().equalsIgnoreCase(CustomerState), "Reports: Sales Tab: Sale Summary - " + CustomerState + " in Customer State text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} of {string} from General Code text field")
    public void reportsSalesTabSaleSummaryValidateOfFromGeneralCodeTextField(String GeneralCode, String CustomerState) {
        if (!GeneralCode.equals("") && !CustomerState.equals("")) {
            String GCode = CustomerState + " | " + GeneralCode;
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_GeneralCodeTextField(GeneralCode)));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_GeneralCodeTextField(GeneralCode)).getText().contains(GeneralCode), "Reports: Sales Tab: Sale Summary - " + GeneralCode + " of " + CustomerState + " from General Code text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer Zip text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerZipTextField(String CustomerZip) {
        if (!CustomerZip.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerZipTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerZipTextField).getText().equalsIgnoreCase(CustomerZip), "Reports: Sales Tab: Sale Summary - " + CustomerZip + " in Customer Zip text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer Email text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerEmailTextField(String CustomerEmail) {
        if (!CustomerEmail.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerEmailTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerEmailTextField).getText().equalsIgnoreCase(CustomerEmail), "Reports: Sales Tab: Sale Summary - " + CustomerEmail + " in Customer Email text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Customer Phone text field")
    public void reportsSalesTabSaleSummaryValidateInCustomerPhoneTextField(String CustomerPhone) {
        if (!CustomerPhone.equals("")) {
            String[] CustomerPhoneArray = CustomerPhone.split("-");
            String ExpectedCustomerPhone = "(" + CustomerPhoneArray[0] + ") " + CustomerPhoneArray[1] + "-" + CustomerPhoneArray[2];
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CustomerPhoneTextField).getText().equalsIgnoreCase(ExpectedCustomerPhone), "Reports: Sales Tab: Sale Summary - " + CustomerPhone + " in Customer Phone text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Approval Date text field")
    public void reportsSalesTabSaleSummaryValidateInApprovalDateTextField(String ApprovalDate) {
        if (!ApprovalDate.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_ApprovalDateField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_ApprovalDateField).getText().equalsIgnoreCase(ApprovalDate), "Reports: Sales Tab: Sale Summary - " + ApprovalDate + " in Approval Date text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in M1 Date text field")
    public void reportsSalesTabSaleSummaryValidateInM1DateTextField(String M1Date) {
        if (!M1Date.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_M1DateField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_M1DateField).getText().equalsIgnoreCase(M1Date), "Reports: Sales Tab: Sale Summary - " + M1Date + " in M1 Date text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in M2 Date text field")
    public void reportsSalesTabSaleSummaryValidateInM2DateTextField(String M2Date) {
        if (!M2Date.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_M2DateField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_M2DateField).getText().equalsIgnoreCase(M2Date), "Reports: Sales Tab: Sale Summary - " + M2Date + " in M2 Date text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Cancel Date text field")
    public void reportsSalesTabSaleSummaryValidateInCancelDateTextField(String CancelDate) {
        if (!CancelDate.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_CancelDateField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_CancelDateField).getText().equalsIgnoreCase(CancelDate), "Reports: Sales Tab: Sale Summary - " + CancelDate + " in Cancel Date text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Validate {string} in Adders text field")
    public void reportsSalesTabSaleSummaryValidateInAddersTextField(String Adders) {
        if (!Adders.equals("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_AddersTextField));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_AddersTextField).getText().equalsIgnoreCase(Adders), "Reports: Sales Tab: Sale Summary - " + Adders + " in Adders text field");
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Click on Account Summary Button")
    public void reportsSalesTabSaleSummaryClickOnAccountSummaryButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_AccountSummaryButton));
//        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_AccountSummaryButton), "Reports: Sales Tab: Sale Summary - Click on Account Summary Button");
        try {
            this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_AccountSummaryButton).click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) this.state.getDriver();
            executor.executeScript("arguments[0].click();", this.state.getDriver().findElement(Reports_Sales_Elements.Reports_Sales_AccountSummaryButton));
        }
        Thread.sleep(2000);
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Commissions displayed is {string}")
    public void reportsSalesTabSaleSummaryAccountSummaryCommissionsNumberOfCommissionsDisplayedIs(String CommissionCounts) {
        if ((!CommissionCounts.equalsIgnoreCase("")) && (!CommissionCounts.equalsIgnoreCase("0"))) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CommissionTable));
            int ExpectedCommissionCounts = Integer.parseInt(CommissionCounts);
            int ActualCommissionCounts = this.state.getDriver().findElements(Reports_Sales_Elements.Reports_Sales_CommissionTable).size() - 1;
            customLogging.customAssertEquals(ActualCommissionCounts, ExpectedCommissionCounts, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Commissions displayed is " + ActualCommissionCounts);
        } else if ((!CommissionCounts.equalsIgnoreCase("")) && (CommissionCounts.equalsIgnoreCase("0"))) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CommissionTable));
                customLogging.customAssertTrue(false, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Commissions displayed is NOT zero ");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Commissions displayed is zero ");
            }
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Commissions - {string} {string} Amount for Date {string} is {string}")
    public void reportsSalesTabSaleSummaryAccountSummaryCommissionsCloserM1AmountForM1DateIs(String Name, String PaymentType, String Date, String Amount) {
        if (!Amount.equalsIgnoreCase("0.00") && !Amount.equalsIgnoreCase("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.getReports_Sales_CommissionDueAmountXpath(Name, Date, PaymentType)));
            customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.getReports_Sales_CommissionDueAmountXpath(Name, Date, PaymentType)).getText().contains(Amount), "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - " + Name + " " + PaymentType + " Amount for Date " + Date + " is " + Amount);
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Click on Overrides Tab")
    public void reportsSalesTabSaleSummaryAccountSummaryClickOnOverridesTab() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_AccountSummary_OverridesTab));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_AccountSummary_OverridesTab), "Reports: Sales Tab: Sale Summary - Account Summary - Click on Overrides Tab");
        Thread.sleep(2000);
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Overrides - Number of Overrides displayed is {string}")
    public void reportsSalesTabSaleSummaryAccountSummaryOverridesNumberOfOverridesDisplayedIs(String OverrideCounts) {
        if ((!OverrideCounts.equalsIgnoreCase("")) && (!OverrideCounts.equalsIgnoreCase("0"))) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_OverridesTable));
            int ExpectedOverrideCounts = Integer.parseInt(OverrideCounts);
            int ActualOverrideCounts = this.state.getDriver().findElements(Reports_Sales_Elements.Reports_Sales_OverridesTable).size() - 1;
            customLogging.customAssertEquals(ActualOverrideCounts, ExpectedOverrideCounts, "Reports: Sales Tab: Sale Summary - Account Summary - Overrides - Number of Overrides displayed is " + ActualOverrideCounts);
        } else if ((!OverrideCounts.equalsIgnoreCase("")) && (OverrideCounts.equalsIgnoreCase("0"))) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_OverridesTable));
                customLogging.customAssertTrue(false, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Overrides displayed is NOT zero ");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Overrides displayed is zero ");
            }
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Overrides - {string} has Overrides Type as {string} and Due Amount of {string}")
    public void reportsSalesTabSaleSummaryAccountSummaryOverridesHasOverridesTypeAsAndDueAmountOf(String Description, String Type, String OverrideAmount) {
        if (!OverrideAmount.equalsIgnoreCase("0.00") && !OverrideAmount.equalsIgnoreCase("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.getReports_Sales_OverrideAmountXpath(Description, Type)));
            if (OverrideAmount.contains("-")) {
                customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.getReports_Sales_OverrideAmountXpath(Description, Type)).getText().equalsIgnoreCase("$ (" + OverrideAmount.replace("-", "") + ")"), "Reports: Sales Tab: Sale Summary - Account Summary - Overrides - " + Description + " has Overrides Type as " + Type + " and Due Amount of " + OverrideAmount);
            } else {
                customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.getReports_Sales_OverrideAmountXpath(Description, Type)).getText().equalsIgnoreCase("$ " + OverrideAmount), "Reports: Sales Tab: Sale Summary - Account Summary - Overrides - " + Description + " has Overrides Type as " + Type + " and Due Amount of " + OverrideAmount);
            }
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Click on Company Tab")
    public void reportsSalesTabSaleSummaryAccountSummaryClickOnCompanyTab() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.Reports_Sales_AccountSummary_CompanyTab));
        customLogging.customAssertTrue(commonMethods.absoluteClick(Reports_Sales_Elements.Reports_Sales_AccountSummary_CompanyTab), "Reports: Sales Tab: Sale Summary - Account Summary - Click on Company Tab");
        Thread.sleep(2000);
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Company - Number of Company Margins displayed is {string}")
    public void reportsSalesTabSaleSummaryAccountSummaryCompanyNumberOfCompanyMarginsDisplayedIs(String CompanyMarginCounts) throws InterruptedException {
        Thread.sleep(2000);
        if ((!CompanyMarginCounts.equalsIgnoreCase("")) && (!CompanyMarginCounts.equalsIgnoreCase("0"))) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CompanyTable));
            int ExpectedCompanyMarginCounts = Integer.parseInt(CompanyMarginCounts);
            int ActualCompanyMarginCounts = this.state.getDriver().findElements(Reports_Sales_Elements.Reports_Sales_CompanyTable).size() - 1;
            customLogging.customAssertEquals(ActualCompanyMarginCounts, ExpectedCompanyMarginCounts, "Reports: Sales Tab: Sale Summary - Account Summary - Company - Number of Company Margins displayed is " + ActualCompanyMarginCounts);
        } else if ((!CompanyMarginCounts.equalsIgnoreCase("")) && (CompanyMarginCounts.equalsIgnoreCase("0"))) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(Reports_Sales_Elements.Reports_Sales_CompanyTableNoData));
                customLogging.customAssertTrue(true, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Company Margins displayed is zero ");
            } catch (Exception e) {
                customLogging.customAssertTrue(false, "Reports: Sales Tab: Sale Summary - Account Summary - Commissions - Number of Company Margins displayed is NOT zero ");
            }
        }
    }

    @Then("Reports: Sales Tab: Sale Summary - Account Summary - Company - {string} Due Amount for {string} on Date {string} is {string}")
    public void reportsSalesTabSaleSummaryAccountSummaryCompanyCloserDueAmountForM2DateIs(String Name, String Type, String Date, String CompanyMargin) {
        if (!CompanyMargin.equalsIgnoreCase("0.00") && !CompanyMargin.equalsIgnoreCase("")) {
            wait.until(ExpectedConditions.elementToBeClickable(Reports_Sales_Elements.getReports_Sales_CompanyMarginAmountXpath(Name, Type, Date)));
            if (CompanyMargin.contains("-")) {
                customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.getReports_Sales_CompanyMarginAmountXpath(Name, Type, Date)).getText().equalsIgnoreCase("$ (" + CompanyMargin.replace("-", "") + ")"), "Reports: Sales Tab: Sale Summary - Account Summary - Company - " + Name + " Due Amount for Date " + Date + " is " + CompanyMargin);
            } else {
                customLogging.customAssertTrue(this.state.getDriver().findElement(Reports_Sales_Elements.getReports_Sales_CompanyMarginAmountXpath(Name, Type, Date)).getText().contains(CompanyMargin), "Reports: Sales Tab: Sale Summary - Account Summary - Company - " + Name + " Due Amount for Date " + Date + " is " + CompanyMargin);
            }
        }
    }


}
