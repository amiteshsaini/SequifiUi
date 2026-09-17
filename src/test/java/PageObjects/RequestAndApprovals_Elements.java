package PageObjects;

import org.openqa.selenium.By;

public class RequestAndApprovals_Elements {

    public static By RequestsAndApprovalsMenu = By.xpath("//span[text()='Requests & Approvals']");
    public static By SearchTextBox = By.xpath("//*[@id='MyRequest_Search_Input']");
    public static By RequestButton = By.xpath("//span[text()='Request']");
    public static By RequestTypeDropdown = By.xpath("//*[@id='Add_Request_Modal_Type_Of_Request_Input']/div[3]");
    public static By RequestTypeReimbursementCostDate = By.name("cost_date");
    public static By RequestTypeBonusDate = By.name("request_date");
    public static By RequestTypeIncentiveDate = By.name("request_date");
    public static By RequestTypeFineFeeDate = By.name("request_date");
    public static By RequestTypeAmount = By.xpath("((//label[text()='Amount'])/..)/div/div/input");
    public static By RequestTypeCostHeadDropdown = By.xpath("//*[@id='Add_Request_Modal_Reimbursment_Cost_Head_Input']/div[3]");
    public static By RequestTypeDescriptionTextBox = By.xpath("//textarea[@name='description']");
    public static By RequestTypeSubmitButton = By.xpath("//span[text()='Submit']");
    public static By RequestTypeAddReplyButton = By.xpath("//*[text()='Add Reply']");
    public static By RequestTypeAddReplyTextBox = By.xpath("//*[@class='ql-editor ql-blank']");
    public static By RequestTypePostReplyButton = By.xpath("//*[text()='Post Reply']");
    public static By RequestTypeCommentsText = By.xpath("((//*[text()='Comments'])/../../..)/div[2]/div/div/div/div[3]/div/p");

    public static By getXpathByTextForMyRequestStatus(String Type, String Amount) {
        return By.xpath("((((//*[text()='" + Type + "'])/..)/td[4]/span[contains(text(),'" + Amount + ".00')])/../..)/td[6]");
    }

    public static By getXpathByTextForRequest(String text) {
        return By.xpath("((//*[text() = '" + text + "'])/..)/td[1]/a");
    }

    public static By getXpathByTextFortypeDropdown(String text) {
        return By.xpath("//*[@class='p-dropdown-items']/li[@aria-label='" + text + "']/span/div");
    }

    public static By RequestApprovals_ApprovalsTab = By.xpath("//*[text()='Approvals']");

    public static By getRequestApprovals_RequestIdLinkXpath(String Type, String Amount) {
        return By.xpath("((((//*[text()='" + Type + "'])/..)/td[5]/div/span[contains(text(),'" + Amount + ".00')])/../../..)/td[1]/a");
    }

    public static By RequestApprovals_ApproveButton = By.xpath("//*[text()='Approve']");
    public static By RequestApprovals_DeclineButton = By.xpath("//*[text()='DECLINE']");
    public static By RequestApprovals_BackButton = By.xpath("//*[@id='Particulaar_Request_Back_ICon']/span");
    public static By RequestApprovals_HistoryButton = By.xpath("//*[text()='History']");

    public static By getRequestApprovals_HistoryStatusXpath(String Type, String Amount) {
        return By.xpath("((((//*[text()='" + Type + "'])/..)/td[5]/div/span[contains(text(),'" + Amount + ".00')])/../../..)/td[7]");
    }

    public static By getXpathByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }


}
