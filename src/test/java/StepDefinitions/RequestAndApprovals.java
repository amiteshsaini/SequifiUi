package StepDefinitions;

import PageObjects.RequestAndApprovals_Elements;
import Sequifi.qa.cucumber.state.TestState;
import Sequifi.qa.cucumber.stepdefinitions.AbstractStepDefinitions;
import Sequifi.qa.reporting.logging.CustomLogging;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RequestAndApprovals extends AbstractStepDefinitions {
    CommonMethods commonMethods = new CommonMethods(state);
    CustomLogging customLogging = new CustomLogging(state);

    Duration timeoutInSeconds = Duration.ofSeconds(15);
    WebDriverWait wait = new WebDriverWait(this.state.getDriver(), timeoutInSeconds);

    public RequestAndApprovals(TestState state) {
        super(state);
    }

    @When("Requests&Approvals: Requests & Approvals Menu: Click")
    public void requestsApprovalsRequestsApprovalsMenuClick() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestsAndApprovalsMenu));
        customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestsAndApprovalsMenu), "Requests&Approvals: Requests & Approvals Menu: Click");
        Thread.sleep(2000);
    }


    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Click on Request Button for {string}")
    public void requestsApprovalsRequestsApprovalsRequestTabClickOnRequestButton(String Type) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            Actions action = new Actions(this.state.getDriver());
            WebElement element = this.state.getDriver().findElement(RequestAndApprovals_Elements.SearchTextBox);
            action.moveToElement(this.state.getDriver().findElement(RequestAndApprovals_Elements.SearchTextBox)).moveToElement(element).perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestButton));
            customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestButton), "Requests&Approvals: Requests & Approvals: Request Tab: Click on Request Button for " + Type);
            Thread.sleep(2000);
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Request Button for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Request Button for " + Type + "  is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Type - {string} - Select Type of Request Dropdown")
    public void requestsApprovalsRequestsApprovalsRequestTabTypeSelectTypeOfRequestDropdown(String Type) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeDropdown));
            customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestTypeDropdown), "");
            customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.getXpathByTextFortypeDropdown(Type)), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Select Type of Request Dropdown");
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Type of Request Dropdown for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Type of Request Dropdown for " + Type + "  is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Type - {string} - Select {string} for Date")
    public void requestsApprovalsRequestsApprovalsRequestTabTypeSelectForCostDate(String Type, String Date) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeReimbursementCostDate));
                customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(RequestAndApprovals_Elements.RequestTypeReimbursementCostDate, Date), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Select " + Date + " for Cost Date");
            } else if (Type.equalsIgnoreCase("Bonus")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeBonusDate));
                customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(RequestAndApprovals_Elements.RequestTypeBonusDate, Date), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Select " + Date + " for Cost Date");
            } else if (Type.equalsIgnoreCase("Incentive")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeIncentiveDate));
                customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(RequestAndApprovals_Elements.RequestTypeIncentiveDate, Date), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Select " + Date + " for Cost Date");
            } else if (Type.equalsIgnoreCase("Fine/fee")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeFineFeeDate));
                customLogging.customAssertTrue(commonMethods.absoluteSelectDateFromCalendar(RequestAndApprovals_Elements.RequestTypeFineFeeDate, Date), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Select " + Date + " for Cost Date");
            } else {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - No Date Fields");
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                if (Type.equalsIgnoreCase("Reimbursement")) {
                    this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeReimbursementCostDate);
                    customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Date field for " + Type + " is visible");
                } else if (Type.equalsIgnoreCase("Bonus")) {
                    this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeBonusDate);
                    customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Date field for " + Type + " is visible");
                } else if (Type.equalsIgnoreCase("Incentive")) {
                    this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeIncentiveDate);
                    customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Date field for " + Type + " is visible");
                } else if (Type.equalsIgnoreCase("Fine/fee")) {
                    this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeFineFeeDate);
                    customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Date field for " + Type + " is visible");
                }
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Date field for  " + Type + "  is not visible");
            }
        }


    }

    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Type - {string} - Enter {string} for Amount text box")
    public void requestsApprovalsRequestsApprovalsRequestTabTypeEnterForAmountTextBox(String Type, String Amount) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            Thread.sleep(2000);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeAmount));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(RequestAndApprovals_Elements.RequestTypeAmount, Amount), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Enter " + Amount + " for Amount text box");
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeAmount);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Amount Textbox for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Amount Textbox for " + Type + "  is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Type - {string} - Select {string} from Cost Head Dropdown")
    public void requestsApprovalsRequestsApprovalsRequestTabTypeSelectFromCostHeadDropdown(String Type, String CostHead) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeCostHeadDropdown));
                customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestTypeCostHeadDropdown), "");
                customLogging.customAssertTrue(commonMethods.absoluteClick(By.xpath("//*[text()='" + CostHead + "']")), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Select " + CostHead + " from Cost Head Dropdown");
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeCostHeadDropdown);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Cost Head Dropdown for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Cost Head Dropdown for " + Type + "  is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Type - {string} - Enter {string} in Description text box")
    public void requestsApprovalsRequestsApprovalsRequestTabTypeEnterInDescriptionTextBox(String Type, String Description) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeDescriptionTextBox));
            customLogging.customAssertTrue(commonMethods.absoluteSendKeys(RequestAndApprovals_Elements.RequestTypeDescriptionTextBox, Description), "Requests&Approvals: Requests & Approvals: Request Tab: Type - " + Type + " - Enter " + Description + " for Description text box");
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeDescriptionTextBox);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Description text box for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Description text box for " + Type + "  is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request Tab: Type - {string} - Click Submit Button")
    public void requestsApprovalsRequestsApprovalsRequestTabTypeClickSubmitButton(String Type) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeSubmitButton));
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeSubmitButton).click();
                WebElement element = this.state.getDriver().findElement(By.xpath("//*[contains(text(),'Request added')]"));
                ((JavascriptExecutor) this.state.getDriver()).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
                customLogging.customAssertTrue(true, "Request added successfully");
            } catch (Exception e) {
                customLogging.customAssertTrue(false, "Request NOT added successfully");
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeSubmitButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Request Tab: Submit Button for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request Tab: Submit Button for " + Type + "  is not visible");
            }
        }
        Thread.sleep(5000);
    }

    @Then("Requests&Approvals: Requests & Approvals: Request: Validate {string} Request is displayed in My Requests section with Status as {string} and {string}")
    public void requestsApprovalsRequestsApprovalsRequestValidateRequestIsDisplayedInMyRequestsSectionWithStatusAsPending(String Type, String status, String Amount) {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.getXpathByTextForMyRequestStatus(Type, Amount)));
            customLogging.customAssertTrue(this.state.getDriver().findElement(RequestAndApprovals_Elements.getXpathByTextForMyRequestStatus(Type, Amount)).getText().equalsIgnoreCase(status), "Requests & Approvals: Request: Validate " + Type + " Request is displayed in My Requests section with Status as " + status);
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.getXpathByTextForMyRequestStatus(Type, Amount));
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: My Request Tab: Entry for " + Type + " with Pending Status is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: My Request Tab: Entry for " + Type + " with Pending Status is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Click Request Id link for {string} to enter {string}")
    public void requestsApprovalsRequestsApprovalsClickRequestIdLinkFor(String Type, String Reply) throws InterruptedException {
        if ((!Type.equals("") && !Type.equals("Should not be visible")) && !(Reply.equals(""))) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.getXpathByTextForRequest(Type)));
                customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.getXpathByTextForRequest(Type)), "Requests&Approvals: Requests & Approvals: Click Request Id link for " + Type);
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.getXpathByTextForRequest(Type));
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: My Request Tab: Request Id link for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: My Request Tab: Request Id link for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request: Click Add Reply button for {string} to enter {string}")
    public void requestsApprovalsRequestsApprovalsRequestClickAddReplyButton(String Type, String Reply) throws InterruptedException {
        if ((!Type.equals("") && !Type.equals("Should not be visible")) && !(Reply.equals(""))) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeAddReplyButton));
                customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestTypeAddReplyButton), "Requests&Approvals: Requests & Approvals: Request: Click Add Reply button for " + Type);
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeAddReplyButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: My Request Tab: Add Reply button for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: My Request Tab: Add Reply button for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request: Enter {string} in Reply textbox for {string}")
    public void requestsApprovalsRequestsApprovalsRequestEnterInReplyTextbox(String Reply, String Type) throws InterruptedException {
        if ((!Type.equals("") && !Type.equals("Should not be visible")) && !(Reply.equals(""))) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeAddReplyTextBox));
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeAddReplyTextBox).sendKeys(Reply);
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Request: Click Reply textbox for " + Type);
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeAddReplyTextBox);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: My Request Tab: Reply textbox for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: My Request Tab: Reply textbox for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request: Click Post Reply button for {string} to enter {string}")
    public void requestsApprovalsRequestsApprovalsRequestClickPostReplyButton(String Type, String Reply) throws InterruptedException {
        if ((!Type.equals("") && !Type.equals("Should not be visible")) && !(Reply.equals(""))) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypePostReplyButton));
                customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestTypePostReplyButton), "Requests&Approvals: Requests & Approvals: Request: Click Post Reply button for " + Type);
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypePostReplyButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: My Request Tab: Post Reply button for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: My Request Tab: Post Reply button for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Request: Validate {string} is displayed in comments section for {string}")
    public void requestsApprovalsRequestsApprovalsRequestValidateIsDisplayedInCommentsSection(String Reply, String Type) {
        if ((!Type.equals("") && !Type.equals("Should not be visible")) && !(Reply.equals(""))) {
            if (Type.equalsIgnoreCase("Reimbursement")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestTypeCommentsText));
                customLogging.customAssertTrue(this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeCommentsText).getText().equalsIgnoreCase(Reply), "Requests&Approvals: Requests & Approvals: My Request Tab: comments section for " + Type + " is visible");
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestTypeCommentsText);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: My Request Tab: comments section for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: My Request Tab: comments section for " + Type + " is not visible");
            }
        }
    }


    @Then("Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for {string} Request")
    public void requestsApprovalsRequestsApprovalsApprovalsTabClickOnApprovalsTabForRequest(String Type) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestApprovals_ApprovalsTab));
            customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestApprovals_ApprovalsTab), "Requests&Approvals: Requests & Approvals: Request: Click Approvals Tab for " + Type);
            Thread.sleep(2000);
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestApprovals_ApprovalsTab);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Approvals Tab for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Approvals Tab: Click Request id for {string} and {string} Request")
    public void requestsApprovalsRequestsApprovalsApprovalsTabClickRequestIdForAndRequest(String Type, String Amount) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            Thread.sleep(2000);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.getRequestApprovals_RequestIdLinkXpath(Type, Amount)));
            customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.getRequestApprovals_RequestIdLinkXpath(Type, Amount)), "Requests&Approvals: Requests & Approvals: Request: Click Approvals Tab for " + Type);
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.getRequestApprovals_RequestIdLinkXpath(Type, Amount));
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Request id for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click on Request id for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Approvals Tab: Click {string} for {string} Request")
    public void requestsApprovalsRequestsApprovalsApprovalsTabClickForRequest(String Status, String Type) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            if (Status.equalsIgnoreCase("Approved")) {
//                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestApprovals_ApproveButton));
                customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestApprovals_ApproveButton), "Requests&Approvals: Requests & Approvals: Request: Click Approve Button for " + Type);
            } else if (Status.equalsIgnoreCase("Declined")) {
                wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestApprovals_DeclineButton));
                customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestApprovals_DeclineButton), "Requests&Approvals: Requests & Approvals: Request: Click Decline Button for " + Type);
            }
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestApprovals_ApproveButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click " + Status + " for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click " + Status + " for " + Type + " is not visible");
            }
        }
        Thread.sleep(10000);
    }

    @Then("Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for {string} Request")
    public void requestsApprovalsRequestsApprovalsApprovalsTabClickBackLinkForRequest(String Type) throws InterruptedException {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestApprovals_BackButton));
            customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestApprovals_BackButton), "Requests&Approvals: Requests & Approvals: Request: Click Back Button for " + Type);
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.RequestApprovals_BackButton);
                customLogging.customAssertTrue(false, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for " + Type + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, "Requests&Approvals: Requests & Approvals: Approvals Tab: Click Back Link for " + Type + " is not visible");
            }
        }
    }

    @Then("Requests&Approvals: Requests & Approvals: Approvals Tab: Click History Button")
    public void requestsApprovalsRequestsApprovalsApprovalsTabClickHistoryButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.RequestApprovals_HistoryButton));
        customLogging.customAssertTrue(commonMethods.absoluteClick(RequestAndApprovals_Elements.RequestApprovals_HistoryButton), "Requests&Approvals: Requests & Approvals: Request: Click History Button");
    }

    @Then("Requests&Approvals: Requests & Approvals: Approvals History: Validate {string} Request is displayed in My Requests section with Status as {string} and {string}")
    public void requestsApprovalsRequestsApprovalsApprovalsHistoryValidateRequestIsDisplayedInMyRequestsSectionWithStatusAsAnd(String Type, String Status, String Amount) {
        if (!Type.equals("") && !Type.equals("Should not be visible")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(RequestAndApprovals_Elements.getRequestApprovals_HistoryStatusXpath(Type, Amount)));
            customLogging.customAssertTrue(this.state.getDriver().findElement(RequestAndApprovals_Elements.getRequestApprovals_HistoryStatusXpath(Type, Amount)).getText().equalsIgnoreCase(Status), "Requests&Approvals: Requests & Approvals: " + Type + " Request is displayed in My Requests section with Status as " + Status + " and " + Amount);
        } else if (Type.equals("Should not be visible")) {
            try {
                this.state.getDriver().findElement(RequestAndApprovals_Elements.getRequestApprovals_HistoryStatusXpath(Type, Amount));
                customLogging.customAssertTrue(false, Type + " Request is displayed in My Requests section with Status as " + Status + " and " + Amount + " is visible");
            } catch (Exception e) {
                customLogging.customAssertTrue(true, Type + " Request is displayed in My Requests section with Status as " + Status + " and " + Amount + " is not visible");
            }
        }
    }
}
