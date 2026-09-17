package PageObjects;

import org.openqa.selenium.By;

public class Management_Overrides_Elements {

    public static By OverridesEffectiveDateTextBox = By.name("override_effective_date");
    public static By OverridesSubSectionButton = By.xpath("//*[@id='standard_employee_employement_package_override_edit']/span");
    public static By DirectOverrideAmountTextBox = By.name("direct_overrides_amount");
    public static By DirectOverrideCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_override_direct_override_type']/div[3]");
    public static By DirectOverrideCalculatedDropdownCancelButton = By.xpath("//*[@class = 'p-dropdown-clear-icon p-clickable pi pi-times']");
    public static By StackSplitTextBox = By.name("office_stack_overrides_amount");
    public static By OverrideSectionSaveButton = By.xpath("//*[@id='standard_employee_employement_package_override_save']/span");
    public static By ViewManualOverrideLink = By.xpath("//span[text()='View Manual Overrides']");
    public static By ManualOverrideAddNewButton = By.xpath("//span[text()='Add New']");
    public static By OverrideEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_override_effective_date']/input");
    public static By ManualOverrideEffectiveDateTextBox = By.name("effective_date");
    public static By ManualOverrideOverrideFromTextBox = By.xpath("(//*[text()='Override from'])/../div[2]/input");
    public static By ManualOverrideOverrideFromCloseButton = By.xpath("//*[text()='Close']");
    public static By ManualOverrideCalculatedDropdownCancelButton = By.xpath("((//*[text()= 'Effective date'])/../../../../..)/div[2]/div[2]/div/div/span[2]");
    public static By ManualOverrideCalculatedDropdown = By.xpath("((//*[text()= 'Effective date'])/../../../../..)/div[2]/div[2]/div/div/div[3]");
    public static By ManualOverrideAmountTextBox = By.xpath("//*[@placeholder='Enter Amount']");
    public static By OverrideSectionAddOverrideButton = By.xpath("//*[text()='Add Override']");
    public static By OverrideSectionViewChangesButton = By.xpath("(//span[text()='View Changes'])[5]");

    public static By getXpathByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

}
