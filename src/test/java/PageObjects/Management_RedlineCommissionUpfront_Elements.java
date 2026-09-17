package PageObjects;

import org.openqa.selenium.By;

public class Management_RedlineCommissionUpfront_Elements {
    public static By RCU_EditButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_edit']/span");
    public static By RCU_CloserCommissionEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_comission_with_effective_datepicker_Closer']/input");
    public static By RCU_CloserCommissionPercentageTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_comission_with_effective_date_input_Closer']");
    public static By RCU_CloserRedLineEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Closer']/input");
    public static By RCU_CloserRedLineCalculatedDropdownCancelButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Closer']/span[2]");
    public static By RCU_CloserRedLineCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Closer']/div[3]");
    public static By RCU_CloserRedlineAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_input_Closer']");
    public static By RCU_CloserUpfrontEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_effective_date_Closer']/input");
    public static By RCU_CloserUpfrontCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Closer']/div[3]");
    public static By RCU_CloserUpfrontCalculatedDropdownCancelButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Closer']/span[2]");
    public static By RCU_CloserUpfrontAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_Closer']");
    public static By RCU_CloserWithheldEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_closer_withheld_effective_date']/div/span/input");
    public static By RCU_CloserWithheldCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_closer_withheld_amount_type']/div[1]/div[2]/div[3]");
    public static By RCU_CloserWithheldCalculatedDropdownCancelButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_closer_withheld_amount_type']/div[1]/div[2]/span[2]");
    public static By RCU_CloserWithheldCommissionAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_closer_withheld_amount']/div[1]/div[1]/div/div/input");
    public static By RCU_SetterCommissionEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_comission_with_effective_datepicker_Setter']/input");
    public static By RCU_SetterCommissionPercentageTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_comission_with_effective_date_input_Setter']");
    public static By RCU_SetterRedLineEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Setter']/input");
    public static By RCU_SetterRedLineCalculatedDropdownCancelButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Setter']/span[2]");
    public static By RCU_SetterRedLineCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Setter']/div[3]");
    public static By RCU_SetterRedlineAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_input_Setter']");
    public static By RCU_SetterUpfrontEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_effective_date_Setter']/input");
    public static By RCU_SetterUpfrontCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Setter']/div[3]");
    public static By RCU_SetterUpfrontCalculatedDropdownCancelButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Setter']/span[2]");
    public static By RCU_SetterUpfrontAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_Setter']");
    public static By RCU_SetterWithheldEffectiveDateTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_effective_date_Setter']/input");
    public static By RCU_SetterWithheldCalculatedDropdown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_type_Setter']/div[3]");
    public static By RCU_SetterWithheldCalculatedDropdownCancelButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_closer_withheld_amount_type']/div[1]/div[2]/span[2]");
    public static By RCU_SetterWithheldCommissionAmountTextBox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_Setter']");
    public static By RCU_SelfGenEffectiveDateTextBox = By.name("commission_selfgen_effective_date");
    public static By RCU_SaveButton = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_save']");

    public static By getSetterWithheldCalculatedDropdownXpathByText(String SetterWithheldCalculatedDropdownValue) {
        return By.xpath("//li/span/div/div[text() = '" + SetterWithheldCalculatedDropdownValue + "']");
    }

    public static By getXpathByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

}
