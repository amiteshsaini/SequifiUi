package PageObjects;

import org.openqa.selenium.By;

public class SettingsElements {

    public static By Settings = By.xpath("//span[text()='Settings']");
    public static By EditProfile = By.xpath("//span[text()='Edit Profile']");
    public static By PositionsTab = By.xpath("//*[text()='Positions']");
    public static By SearchTextBox = By.xpath("//*[@type='search']");
    public static By CommissionStructureButton = By.xpath("//div[text()='Edit']");
    public static By UpfrontSubTab = By.xpath("//*[@class = 'stepper-number' and text()='2']");
    public static By UpfrontEnableDisableCheckbox = By.xpath("//*[@class = 'form-check-input ms-6 cursor-pointer']");
    public static By AmountTextBox = By.name("upfront_ammount");
    public static By CalculatedDropdown = By.xpath("//*[@id='kt_modal_create_app_form']/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[3]");
    public static By UpfrontSystemDropdown = By.xpath("//*[@id='kt_modal_create_app_form']/div[1]/div[2]/div/div[3]/div/div[1]/label/div/div[2]");
    public static By UpfrontSubTabSubmitButton = By.xpath("//*[text()='Submit']");
    public static By OverridesSubTab = By.xpath("//*[text()='4']");
    public static By DirectOverridesEnableDisableCheckbox = By.xpath("(//*[@class = 'form-check-input cursor-pointer'])[1]");
    public static By DirectOverridesAmountTextBox = By.xpath("//*[@id='Overrides_Direct_Overrides_amount_Input']");
    public static By DirectOverridesCalculatedDropdown = By.xpath("//*[@id='Overrides_Direct_Overrides_Select_Unit_Dropdown']/div[3]");
    public static By DirectOverridesSubTabSubmitButton = By.xpath("//*[text()=' Submit']");


}
