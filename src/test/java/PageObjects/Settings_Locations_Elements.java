package PageObjects;

import org.openqa.selenium.By;

public class Settings_Locations_Elements {

    public static By Settings_LocationsTab = By.xpath("//*[@id='admin_setting_location']");
    public static By Settings_Locations_AddNewButton = By.xpath("//*[@id='admin_settings_location_Add_New_Location_Button']/span");
    public static By Settings_Locations_StateDropdown = By.xpath("//*[@id='state_dropdown']/div[3]");

    public static By Settings_Locations_StateDropdownValueXpath(String State) {
        return By.xpath("//div[text()= '" + State + "']");
    }

    public static By Settings_Locations_RedlineEffectiveDateTextBox = By.name("effective_date");
    public static By Settings_Locations_StateCodeTextBox = By.xpath("//*[@id='General_Code_text_input']");
    public static By Settings_Locations_OfficeCheckBox = By.xpath("//*[@class = 'p-checkbox-box']");
    public static By Settings_Locations_OfficeNameTextBox = By.xpath("//*[@id='Office_Name_Input']");
    public static By Settings_Locations_OfficeAddressTextBox = By.xpath("//*[@id='Auto_Office_Address_Input']/input");
    public static By Settings_Locations_OfficeAddressAutoFillPopup = By.xpath("//*[@id='Auto_Office_Address_Input_list']/li");
    public static By Settings_Locations_InstallationPartnerTextBox = By.xpath("//*[@id='Installation_Partner_Text_Input']");
    public static By Settings_Locations_RedlineStandardTextBox = By.name("redline_standard");
    public static By Settings_Locations_AddLocationSaveButton = By.xpath("//span[text()='Add Location']");
    public static By Settings_Locations_EditLocationEditButton = By.xpath("//*[@id='Edit_redline_icon_btn']");
    public static By Settings_Locations_EditLocationRedline_AddRedlineLink = By.xpath("//*[@id='Add_New_Redline_Row']/span");
    public static By Settings_Locations_EditLocationRedline_EffectiveDateTextBox = By.xpath("//*[@id='Past_Effective_date_Input']/input");
    public static By Settings_Locations_EditLocationRedline_StandardTextBox = By.xpath("//*[@id='Standard_Redline_input']");
    public static By Settings_Locations_EditLocationRedline_GreenTick = By.xpath("//*[@id='Confirm_Past_Redline_Changes_Check_Icon']");
    public static By Settings_Locations_EditLocationRedline_SaveButton = By.xpath("//*[@id='Save_Edit_Location_Redline_Modal']/span");
    public static By Settings_Locations_EditLocationRedline_UpdateLocationButton = By.xpath("//*[@id='Add_Update_Button']/span");
}
