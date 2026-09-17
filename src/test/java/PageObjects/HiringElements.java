package PageObjects;

import org.openqa.selenium.By;

public class HiringElements {
    public static By HiringMenu = By.xpath("//span[text()='Hiring']");
    public static By OnboardingTab = By.xpath("//*[text()='Onboarding']");
    public static By HireNewButton = By.xpath("//*[text()='Hire New']");
    public static By FirstNameTextBox = By.name("first_name");
    public static By LastNameTextBox = By.name("last_name");
    public static By EmailTextBox = By.name("email");
    public static By PhoneTextBox = By.name("mobile_no");
    public static By OfficeLocationStateDropdown = By.xpath("(((//*[text()= 'Office Location'])[1])/../..)/div/div/div[3]");
    public static By OfficeLocationStateDropdownValue = By.xpath("((((//*[text()= 'Office Location'])[1])/../..)/div/div/div[3])/../span");
    public static By OfficeLocationOfficeDropdown = By.xpath("(((//*[text()= 'Office Location'])[1])/../../../..)/div/div[2]/div/div/div[3]");
    public static By OfficeLocationOfficeDropdownValue = By.xpath("((((//*[text()= 'Office Location'])[1])/../../../..)/div/div[2]/div/div/div[3])/../span");
    public static By NewHire_Details_SaveAndContinueButton = By.xpath("//*[text()= 'Save and Continue']");
    public static By NewHire_Organization_DepartmentDropdown = By.xpath("//*[@id='standard_employee_employement_package_organization_department']/div[3]");
    public static By NewHire_Organization_DepartmentDropdownValue = By.xpath("//*[@id='standard_employee_employement_package_organization_department']/span/div/div");
    public static By NewHire_Organization_PositionDropdown = By.xpath("//*[@id='standard_employee_employement_package_organization_position']/div[3]");
    public static By NewHire_Organization_PositionText = By.xpath("//*[@id='standard_employee_employement_package_organization_position']/span/div/div");
    public static By NewHire_Organization_PositionDropdownValue = By.xpath("//*[@id='standard_employee_employement_package_organization_position']/span/div/div");
    public static By NewHire_Organization_IsManagerCheckbox = By.xpath("//*[@id='standard_employee_employement_package_organization_department_checkbox']/div");
    public static By NewHire_Organization_MayActAsBothSetterAndCloserCheckbox = By.xpath("//*[@id='standard_employee_employement_package_organization_position_checkbox']/div");
    public static By NewHire_Organization_ManagerDropdown = By.xpath("//*[@id='standard_employee_employement_package_organization_manager']/div[3]");
    public static By NewHire_Organization_ManagerDropdownValue = By.xpath("(//*[@id='standard_employee_employement_package_organization_manager']/div[3])/../span");
    public static By NewHire_Organization_TeamDropdown = By.xpath("//*[@id='standard_employee_employement_package_organization_team']/div[3]");
    public static By NewHire_Organization_TeamDropdownValue = By.xpath("(//*[@id='standard_employee_employement_package_organization_team']/div[3])/../span");
    public static By NewHire_Organization_RecruiterTextbox = By.xpath("//*[@id='test']/input");
    public static By NewHire_Organization_RecruiterTextboxPopup = By.xpath("//*[@id='standard_employee_employement_package_organization_recruiter_search']");
    public static By NewHire_Organization_RecruiterAutofill = By.xpath("//*[@id='standard_employee_employement_package_organization_recruiter_item_click_1']");
    public static By NewHire_Commission_SelfGenCommissionTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_self_gen_commission_amount_type_dropdown_undefined']/div[3]");
    public static By NewHire_Commission_SelfGenCommissionTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_self_gen_commission_amount_type_dropdown_undefined']/div[3])/../span");
    public static By NewHire_Organization_SaveAndContinueButton = By.xpath("//*[text()= 'Save and Continue']");
    public static By NewHire_Commission_CloserCommissionTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_comission_with_effective_date_input_Closer']");
    public static By NewHire_Commission_CloserRedlineTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_type_Closer']/div[3]");
    public static By NewHire_Commission_CloserRedlineTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_type_Closer']/div[3])/../span");

    public static By NewHire_Organization_DepartmentDropdownValueXpath(String state) {
        return By.xpath("//*[text()='" + state + "']");
    }
    public static By NewHire_Commission_CloserRedlineTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_input_Closer']");

    public static By NewHire_Organization_ManagerDropdownValueXpath(String state) {
        return By.xpath("//*[text()='" + state + "']");
    }

    public static By NewHire_Organization_TeamDropdownValueXpath(String state) {
        return By.xpath("//*[text()='" + state + "']");
    }

    public static By NewHire_Commission_CloserRedlinePerTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Closer']/div[3]");
    public static By NewHire_Commission_CloserRedlinePerTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Closer']/div[3])/../span");
    public static By NewHire_Commission_CloserUpfrontPayTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_Closer']");
    public static By NewHire_Commission_CloserUpfrontPayPerTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Closer']/div[3]");
    public static By NewHire_Commission_CloserUpfrontPayPerTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Closer']/div[3])/../span");
    public static By NewHire_Commission_CloserWithheldAmountTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_Closer']");
    public static By NewHire_Commission_CloserWithheldAmountPerTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_type_Closer']/div[3]");
    public static By NewHire_Commission_CloserWithheldAmountPerTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_type_Closer']/div[3])/../span");
    public static By NewHire_Commission_SetterCommissionTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_comission_with_effective_date_input_Setter']");
    public static By NewHire_Commission_SetterRedlineTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_type_Setter']/div[3]");
    public static By NewHire_Commission_SetterRedlineTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_type_Setter']/div[3])/../span");
    public static By NewHire_Commission_SetterRedlineTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_input_Setter']");
    public static By NewHire_Commission_SetterRedlinePerTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Setter']/div[3]");
    public static By NewHire_Commission_SetterRedlinePerTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_redline_per_amount_type_dropdown_Setter']/div[3])/../span");
    public static By NewHire_Commission_SetterUpfrontPayTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_Setter']");
    public static By NewHire_Commission_SetterUpfrontPayPerTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Setter']/div[3]");
    public static By NewHire_Commission_SetterUpfrontPayPerTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_upfront_pay_type_Setter']/div[3])/../span");
    public static By NewHire_Commission_SetterWithheldAmountTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_Setter']");
    public static By NewHire_Commission_SetterWithheldTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_type_Setter']/div[3]");
    public static By NewHire_Commission_SetterWithheldTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_redline_commission_upfront_withheld_amount_type_Setter']/div[3])/../span");

    public static By getRecruiterXpath(String Recruiter) {
        String[] textString = Recruiter.split(" ");
        return By.xpath("//li[contains(text(),'" + textString[0] + "')][contains(text(),'" + textString[1] + "')]");
    }
    public static By NewHire_Agreement_ProbationPeriodDropDown = By.xpath("//*[@id='Agreement_Probation_Period_Input']/div[3]");

    public static By NewHire_Commission_SelfGenCommissionTextbox = By.xpath("//*[@id='standard_employee_employement_package_redline_commission_upfront_self_generation_commission_effective_date_input']");
    public static By NewHire_Commission_SaveAndContinueButton = By.xpath("//*[text()= 'Save and Continue']");
    public static By NewHire_Overrides_DirectOverridesTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_override_direct_override_type']/div[3]");
    public static By NewHire_Overrides_DirectOverridesTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_override_direct_override_type']/div[3])/../span");
    public static By NewHire_Overrides_DirectOverridesTextbox = By.xpath("//*[@id='standard_employee_employement_package_override_direct_override']");
    public static By NewHire_Overrides_IndirectOverridesTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_override_indirect_override_type']/div[3]");
    public static By NewHire_Overrides_IndirectOverridesTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_override_indirect_override_type']/div[3])/../span");
    public static By NewHire_Overrides_IndirectOverridesTextbox = By.xpath("//*[@id='standard_employee_employement_package_override_indirect_override']");
    public static By NewHire_Overrides_OfficeOverridesTypeDropDown = By.xpath("//*[@id='standard_employee_employement_package_override_office_override_type']/div[3]");
    public static By NewHire_Overrides_OfficeOverridesTypeDropDownValue = By.xpath("(//*[@id='standard_employee_employement_package_override_office_override_type']/div[3])/../span");
    public static By NewHire_Overrides_OfficeOverridesTextbox = By.xpath("//*[@id='standard_employee_employement_package_override_office_override']");
    public static By NewHire_Overrides_SaveAndContinueButton = By.xpath("//*[text()= 'Save and Continue']");
    public static By NewHire_Agreement_ProbationPeriodDropDownValue = By.xpath("//*[@id='Agreement_Probation_Period_Input']/span/div/div");
    public static By NewHire_Agreement_OfferIncludesBonusCheckbox = By.xpath("//*[@id='Agreement_Offer_includes_bonus_checkbox']/input");
    public static By NewHire_Agreement_OfferDateToBePaidTextbox = By.xpath("//*[@id='Agreement_date_to_pay_Input']/input");
    public static By NewHire_Agreement_PeriodOfAgreementStartDateTextbox = By.name("period_of_agreement_start_date");
    public static By NewHire_Agreement_PeriodOfAgreementEndDateTextbox = By.name("end_date");
    public static By NewHire_Agreement_OfferExpiryDateTextbox = By.name("offer_expiry_date");
    public static By NewHire_Agreement_ResignBonusTextbox = By.xpath("//*[@id='Agreement_Hiring_Bonus_Resign_Bonus_Input']");

    public static By NewHire_Commission_SelfGenCommissionTypeDropDownValueXpath(String SelfGenCommissionType) {
        return By.xpath("//li/span/div/div[text()='" + SelfGenCommissionType + "']");
    }

    public static By NewHire_Agreement_SaveAndContinueButton = By.xpath("//*[text()= 'Save and Continue']");
    public static By NewHire_Finish_AcknowledgeTextbox = By.xpath("//*[@id='acknowledge_Checkbox']/input");
    public static By NewHire_Finish_NameTextbox = By.xpath("//*[@id='Final_Step_Name_Input']");
    public static By NewHire_Finish_HireDirectlyButton = By.xpath("//*[@id='Final_Hire_Directly_Btn']/span");

    public static By getOfficeLocationStateDropdownXpath(String state) {
        return By.xpath("//li/span/div/div[text()='" + state + "']");
    }

    public static By getOfficeLocationOfficeDropdownXpath(String state) {
        return By.xpath("//li/span/div/div[text()='" + state + "']");
    }

    public static By NewHire_Organization_PositionDropdownValueXpath(String Position) {
        return By.xpath("//div[text()='" + Position + "']");
    }

    public static By NewHire_Commission_CloserRedlineTypeDropDownValueXpath(String CloserRedlineType) {
        return By.xpath("//div[text()='" + CloserRedlineType + "']");
    }

    public static By NewHire_Commission_CloserRedlinePerTypeDropDownValueXpath(String CloserRedlinePerType) {
        return By.xpath("//div[text()='" + CloserRedlinePerType + "']");
    }

    public static By NewHire_Commission_CloserUpfrontPayPerTypeValueXpath(String CloserUpfrontPayPerType) {
        return By.xpath("//div[text()='" + CloserUpfrontPayPerType + "']");
    }

    public static By NewHire_Commission_CloserWithheldAmountPerTypeValueXpath(String CloserUpfrontPayPerType) {
        return By.xpath("//div[text()='" + CloserUpfrontPayPerType + "']");
    }

    public static By NewHire_Commission_SetterRedlineTypeDropDownValueXpath(String SetterRedlineType) {
        return By.xpath("//li/span/div/div[text()='" + SetterRedlineType + "']");
    }

    public static By NewHire_Commission_SetterRedlinePerTypeDropDownValueXpath(String SetterRedlinePerType) {
        return By.xpath("//div[text()='" + SetterRedlinePerType + "']");
    }

    public static By NewHire_Commission_SetterUpfrontPayPerTypeDropDownValueXpath(String SelfGenCommissionType) {
        return By.xpath("//li/span/div/div[text()='" + SelfGenCommissionType + "']");
    }

    public static By NewHire_Commission_SetterWithheldPayPerTypeDropDownValueXpath(String SetterWithheldType) {
        return By.xpath("//li/span/div/div[text()='" + SetterWithheldType + "']");
    }

    public static By NewHire_Overrides_DirectOverridesTypeDropDownValueXpath(String DirectOverridesType) {
        return By.xpath("//li/span/div/div[text()='" + DirectOverridesType + "']");
    }

    public static By NewHire_Overrides_IndirectOverridesTypeDropDownValueXpath(String IndirectOverrides) {
        return By.xpath("//li/span/div/div[text()='" + IndirectOverrides + "']");
    }

    public static By NewHire_Overrides_OfficeOverridesTypeDropDownValueXpath(String OfficeOverridesType) {
        return By.xpath("//li/span/div/div[text()='" + OfficeOverridesType + "']");
    }

    public static By NewHire_Agreement_ProbationPeriodDropDownValueXpath(String ProbationPeriod) {
        return By.xpath("//li/span/div/div[text()='" + ProbationPeriod + "']");
    }


}
