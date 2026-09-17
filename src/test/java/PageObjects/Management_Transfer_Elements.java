package PageObjects;

import org.openqa.selenium.By;

public class Management_Transfer_Elements {
    public static By Transfer_TransferButton = By.xpath("(//span[text()='Transfer'])/..");
    public static By Transfer_TransferConfirmationYesButton = By.xpath("(//span[text()='Yes'])/..");
    public static By Transfer_OfficeStateDropdown = By.xpath("//*[@id='standard_employee_employement_package_transfer_office_state']/div[3]");
    public static By Transfer_OfficeNameDropdown = By.xpath("//*[@id='standard_employee_employement_package_transfer_office_name']/div[3]");
    public static By Transfer_IsManagerCheckbox = By.xpath("(//*[text() = 'Is Manager ?'])/div/span/div");
    public static By Transfer_MayActAsBothSetterAndCloserCheckbox = By.xpath("(//*[text() = 'May act as both setter and closer'])/div/span/div");
    public static By Transfer_SelectNewManagerDropdown = By.xpath("//*[@id='standard_employee_employement_package_transfer_manager']/div[3]");
    public static By Transfer_CloserRedlineChangeDropdown = By.xpath("//*[@id='standard_employee_employement_package_transfer_closer_redline_change']/div[3]");
    public static By Transfer_CloserRedlineChangeDropdownCancelButton = By.xpath("((//*[text()='Closer Redline Change (if any)'])/../..)/div[2]/span[2]");
    public static By Transfer_CloserRedlineChangeAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_transfer_closer_redline_change_input']");
    public static By Transfer_CloserRedlineChangeTypeDropdownCancelButton = By.xpath("((//*[text()='Closer Redline Change (if any)'])/../../../../..)/div[2]/div/div/div/div[2]/span[2]");
    public static By Transfer_CloserRedlineChangeTypeDropdown = By.xpath("//*[@id='standard_employee_employement_package_transfer_closer_redline_change_input_type']/div[3]");
    public static By Transfer_SetterRedlineChangeDropdown = By.xpath("((//*[text()='Setter Redline Change (if any)'])/../..)/div[2]/div[3]");
    public static By Transfer_SetterRedlineChangeDropdownCancelButton = By.xpath("((//*[text()='Setter Redline Change (if any)'])/../..)/div[2]/span[2]");
    public static By Transfer_SetterRedlineChangeAmountTextBox = By.xpath("((//*[text()='Setter Redline Change (if any)'])/../../../../..)/div[2]/div/div/div/div[1]/div/div/input");
    public static By Transfer_SetterRedlineChangeTypeDropdownCancelButton = By.xpath("((//*[text()='Setter Redline Change (if any)'])/../../../../..)/div[2]/div/div/div/div[2]/span[2]");
    public static By Transfer_SetterRedlineChangeTypeDropdown = By.xpath("((//*[text()='Setter Redline Change (if any)'])/../../../../..)/div[2]/div/div/div/div[2]/div[3]");
    public static By Transfer_MapToManagerDropdown = By.xpath("((//*[contains(text(),'map employees')])/../..)/div[2]/div[3]");
    public static By Transfer_TransferEffectiveDate = By.xpath("//*[@id='standard_employee_employement_package_transfer_transfer_effective_date']/input");
    public static By Transfer_TransferSaveButton = By.xpath("(//*[text()='Transfer'])[2]");

    public static By getXpathByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

    public static By getManagerXpathByText(String text) {
        String[] textString = text.split(" ");
        return By.xpath("//div[contains(text(),'" + textString[0] + "')][contains(text(),'" + textString[1] + "')]");
    }
}
