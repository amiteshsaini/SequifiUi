package PageObjects;

import org.openqa.selenium.By;

public class Management_Organization_Elements {

    public static By OrganizationSubSection_Edit_Button = By.xpath("//*[@id='standard_employee_employement_package_organization_edit']/span");
    public static By OrganizationSubSection_AddLocation_Button = By.xpath("//*[@id='Organisation_Add_Location']/span");
    public static By OrganizationSubSection_EffectiveDateTextbox = By.xpath("//*[@name='additional_locations_effective_date']");
    public static By OrganizationSubSection_AdditionalOfficeLocation_State_Dropdown = By.xpath("(//*[@id='standard_employee_employement_package_organization_manager_1']/div[3])[1]");
    public static By OrganizationSubSection_AdditionalOfficeLocation_Office_Dropdown = By.xpath("(//*[@id='standard_employee_employement_package_organization_manager_1']/div[3])[2]");
    public static By OrganizationSubSection_Save_Button = By.xpath("//*[@id='standard_employee_employement_package_organization_save']");

    public static By getXpathByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

}
