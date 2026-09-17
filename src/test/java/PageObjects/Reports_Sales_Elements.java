package PageObjects;

import org.openqa.selenium.By;

public class Reports_Sales_Elements {
    public static By Reports_Menu_Button = By.xpath("//*[text()='Reports        ']");
    public static By Reports_Sales_Tab = By.xpath("//*[text()='Sales']");
    public static By Reports_AddSale_Button = By.xpath("//*[text()='Add Sale']");
    public static By Reports_Sales_PidTextbox = By.xpath("//*[@name='pid']");
    public static By Reports_Sales_ProspectIdTextbox = By.xpath("//*[@name='prospect_id']");
    public static By Reports_Sales_HomeownerIdTextbox = By.xpath("//*[@name='homeowner_id']");
    public static By Reports_Sales_ProposalIdTextbox = By.xpath("//*[@name='proposal_id']");
    public static By Reports_Sales_ProductTextbox = By.xpath("//*[@name='product']");
    public static By Reports_Sales_GrossValueTextbox = By.xpath("//*[@name='gross_account_value']");
    public static By Reports_Sales_InstallerTextbox = By.xpath("//*[@name='installer']");
    public static By Reports_Sales_KWTextbox = By.xpath("//*[@name='kw']");
    public static By Reports_Sales_EPCTextbox = By.xpath("//*[@id='Manage_Sales_Customer_Epc_Input']");
    public static By Reports_Sales_NetEPCTextbox = By.xpath("//*[@id='Manage_Sales_Net_Epc_Input']");
    public static By Reports_Sales_DealerFeePercentageTextbox = By.xpath("//*[@name='dealer_fee_percentage']");
    public static By Reports_Sales_DealerFeeAmountTextbox = By.xpath("//*[@name='dealer_fee_amount']");
    public static By Reports_Sales_SOWAmountTextbox = By.xpath("//*[@name='show']");
    public static By Reports_Sales_CustomerNameTextbox = By.xpath("//*[@name='customer_name']");
    public static By Reports_Sales_CustomerAddressTextbox = By.xpath("//*[@name='customer_address']");
    public static By Reports_Sales_CustomerAddress2Textbox = By.xpath("//*[@name='customer_address2']");
    public static By Reports_Sales_CustomerCityTextbox = By.xpath("//*[@name='customer_city']");
    public static By Reports_Sales_CustomerStateDropdown = By.xpath("//*[@id='Manage_Sales_Customer_State_Input']/div[3]");
    public static By Reports_Sales_CustomerStateDropdownList = By.xpath("//*[@id='kt_app_body']/div[4]/div[2]/ul/li");
    public static By Reports_Sales_CloserNameDropdownList = By.xpath("//*[@id='kt_app_body']/div[4]/div[2]/ul/li");

    public static By Reports_Sales_CustomerState(String state) {
        return By.xpath("//*[text()='" + state + "']");
    }

    public static By Reports_Sales_GeneralCodeDropdown = By.xpath("//*[@id='Manage_Sales_General_Code_Input']/div[3]");
    public static By Reports_Sales_CloserNameDropdown = By.xpath("//*[@id='Manage_Sales_Rep_id_Input']/div[3]");
    public static By Reports_Sales_M1DateTextbox = By.xpath("//*[contains(@name, 'm1')]");




    public static By Reports_Sales_CloserNameText = By.xpath("//*[@id='Manage_Sales_Closer1_Profile']");
    public static By Reports_Sales_CustomerZipTextbox = By.xpath("//*[@name='customer_zip']");
    public static By Reports_Sales_CustomerEmailTextbox = By.xpath("//*[@name='customer_email']");
    public static By Reports_Sales_CustomerPhoneTextbox = By.xpath("//*[@name='customer_phone']");
    public static By Reports_Sales_ApprovedDateTextbox = By.xpath("//*[@name='approved_date']");
    public static By Reports_Sales_M2DateTextbox = By.xpath("//*[contains(@name, 'm1')]");
    public static By Reports_Sales_FirstCloserName = By.xpath("//li[2]/span/div/div");
    public static By Reports_Sales_CancelDateTextbox = By.xpath("//*[@name='date_cancelled']");
    public static By Reports_Sales_AddersTextbox = By.xpath("//*[@name='adders_description']");
    public static By Reports_Sales_SetterNameDropdown = By.xpath("//*[@id='Manage_Sales_Setter_1_Input']/div[3]");

    public static By Reports_Sales_PIDTextField = By.xpath("((//*[text()='PID'])/../..)/div[1]/div[2]");
    public static By Reports_Sales_Title = By.xpath("//*[@id='kt_page_title']");

    public static By Reports_Sales = By.xpath("//*[@id='Reports_Header_Sales']");
    public static By Reports_Sales_DateRangeDropdwon = By.xpath("//*[@id='Report_DateRange_Input']/div[3]");
    public static By Reports_Sales_ProspectIdTextField = By.xpath("((//*[text()='Prospect ID'])/../..)/div[1]/div[2]");

    public static By Reports_Sales_SaveSalesButton = By.xpath("//*[text()= 'Save Sale']");
    public static By Reports_Sales_DateRangeCustom_EndDateCalendarIcon = By.xpath("//*[@id='Report_End_Date_Input']/button/span");
    public static By Reports_Sales_DateRangeCustom = By.xpath("//div[text()= 'Custom']");
    public static By Reports_Sales_DateRangeLastYear = By.xpath("//div[text()= 'Last Year']");
    public static By Reports_Sales_DateRangeCustom_StartDate = By.xpath("(//*[@name='startDate'])[1]");
    public static By Reports_Sales_DateRangeCustom_EndDateCalendar_TodayLink = By.xpath("//*[@id='Report_End_Date_Input_panel']/div[2]/button[1]/span");
    public static By Reports_Sales_AccountSummaryButton = By.xpath("//*[@id='Single_Sale_Page_Account_Summary_Btn']/span");
    public static By Reports_Sales_CustomerInfoSearchTextbox = By.xpath("//*[@name='search']");

    public static By Reports_Sales_CustomerSearchPidLink(String pid) {
        return By.xpath("//*[text()='" + pid + "']");
    }

    public static By Reports_Sales_HomeownerIdTextField = By.xpath("((//*[text()='Homeowner ID'])/../..)/div[1]/div[2]");
    public static By Reports_Sales_ProposalIdTextField = By.xpath("((//*[text()='Proposal ID'])/../..)/div[1]/div[2]");
    public static By Reports_Sales_ProductTextField = By.xpath("((//*[contains(text(),'Product')])/..)/div[2]/div[1]");
    public static By Reports_Sales_GrossValueTextField = By.xpath("(//*[contains(text(),'Gross Account value')])/../div[2]/div/span");
    public static By Reports_Sales_InstallerTextField = By.xpath("((//*[text()='Installer'])/../..)/div[1]/div[2]/div[1]");
    public static By Reports_Sales_DealerFeePercentageTextField = By.xpath("((//*[contains(text(),'Dealer Fee %')])/..)/div[2]/div[1]");
    public static By Reports_Sales_DealerFeeAmountTextField = By.xpath("((//*[contains(text(),'Dealer Fee $')])/..)/div[2]/div[1]");
    public static By Reports_Sales_EPCTextField = By.xpath("((//*[text()='EPC'])/..)/div[2]/div[1]");
    public static By Reports_Sales_NetEPCTextField = By.xpath("((//*[text()='Net EPC'])/..)/div[2]/div[1]");
    public static By Reports_Sales_KWTextField = By.xpath("((//*[text()='KW'])/..)/div[2]/div[1]");
    public static By Reports_Sales_SOWAmountTextField = By.xpath("((//*[text()='SOW $'])/..)/div[2]/div[1]");
    public static By Reports_Sales_CustomerNameTextField = By.xpath("((//*[text()='Customer Name'])/..)/div[2]");
    public static By Reports_Sales_CustomerAddressTextField = By.xpath("((//*[text()='Customer Address'])/..)/div[2]");
    public static By Reports_Sales_CustomerAddress2TextField = By.xpath("((//*[text()='Customer Address2'])/..)/div[2]");
    public static By Reports_Sales_CustomerCityTextField = By.xpath("((//*[text()='Customer City'])/..)/div[2]");
    public static By Reports_Sales_CustomerStateTextField = By.xpath("((//*[text()='Customer State'])/..)/div[2]");
    public static By Reports_Sales_FirstSetterName = By.xpath("//li[2]/span/div/div");
    public static By Reports_Sales_AddSaleButtom = By.xpath("//*[@id='Manage_Sales_Save_sale_Btn']");
    public static By Reports_Sales_GeneralCode = By.xpath("//*[@id='kt_app_body']/div[4]/div[2]/ul/li[1]/span/div/div");
    public static By Reports_Sales_GeneralCodeNotAvailable = By.xpath("//li[text()= 'No available options']");



    public static By Reports_Sales_CloserName(String CloserName) {
        return By.xpath("//li/span/div/div[text()='" + CloserName + "']");
    }

    public static By Reports_Sales_SetterName(String setterName) {
        return By.xpath("//li/span/div/div[text()='" + setterName + "']");
    }

    public static By Reports_Sales_GeneralCodeTextField(String GeneralCode) {
        return By.xpath("//*[text()='" + GeneralCode + "']");
    }

    public static By Reports_Sales_CustomerZipTextField = By.xpath("((//*[contains(text(),'Customer Zip')])/../..)/div[2]/div[2]");
    public static By Reports_Sales_CustomerEmailTextField = By.xpath("((//*[contains(text(),'Customer Email')])/../..)/div[2]/div[2]");
    public static By Reports_Sales_CustomerPhoneTextField = By.xpath("((//*[text()='Customer Phone'])/..)/div[2]/div[1]");
    public static By Reports_Sales_ApprovalDateField = By.xpath("((//*[contains(text(),'Approved Date')])/..)/div[2]/div[1]");
    public static By Reports_Sales_M1DateField = By.xpath("((//*[text()='M1 Date'])/..)/div[2]/div[1]");
    public static By Reports_Sales_M2DateField = By.xpath("((//*[text()='M2 Date'])/..)/div[2]/div[1]");
    public static By Reports_Sales_CancelDateField = By.xpath("((//*[contains(text(),'Cancel Date')])/..)/div[2]/div[1]");
    public static By Reports_Sales_AddersTextField = By.xpath("((//*[text()='Adders description'])/../..)/div[2]/div");
    public static By Reports_Sales_AccountSummary_OverridesTab = By.xpath("//*[@id='Account_Summary_Overrides_Tab']");
    public static By Reports_Sales_CommissionTable = By.xpath("(//tbody)[1]/tr");

    public static By getReports_Sales_CommissionDueAmountXpath(String Name, String Date, String PaymentType) {
        return By.xpath("((((((//*[text()='" + Name + "'])/..)/td[text()='" + Date + "'])/..)/td[text()='" + PaymentType + " PAYMENT'])/..)/td[6]/span");
    }

    public static By Reports_Sales_AccountSummary_CompanyTab = By.xpath("//*[@id='Account_Summary_Company_Tab']");
    public static By Reports_Sales_OverridesTable = By.xpath("(//tbody)[1]/tr");
    public static By Reports_Sales_CompanyTable = By.xpath("(//tbody)[1]/tr");
    public static By Reports_Sales_CompanyTableNoData = By.xpath("//div[text()= 'No data found']");
    public static By Reports_Sales_RandomSpace = By.xpath("//*[@id='kt_app_content_container']/div/div/div[2]/div[2]/div[1]/div/div[7]/div[1]");
    public static By Reports_Sales_RandomSpace2 = By.xpath("//*[@id='kt_app_content_container']/div/div/div[4]/div[1]/div[2]/div/div[1]");

    public static By Reports_Sales_CustomerStateByIndex(int i) {
        return By.xpath("//*[@id='kt_app_body']/div[4]/div[2]/ul/li[" + i + "]/span/div/div");
    }

    public static By Reports_Sales_CloserName(int i) {
        return By.xpath("//li[" + i + "]/span/div/div");
    }



    public static By Reports_Sales_GeneralCode(String CustomerState, String GeneralCode) {
        return By.xpath("//*[text()='" + CustomerState + " | " + GeneralCode + "']");
    }

    public static By getReports_Sales_OverrideAmountXpath(String Description, String Type) {
        return By.xpath("((//*[text()='" + Description + " | " + Type + "'])/..)/td[6]/span");
    }

    public static By getReports_Sales_CompanyMarginAmountXpath(String Name, String Type, String Date) {
        return By.xpath("((((((//*[text()='" + Name + "'])/..)/td[text()='" + Date + "'])/..)/td[text()='" + Type + "'])/..)/td[6]/span");
    }
}
