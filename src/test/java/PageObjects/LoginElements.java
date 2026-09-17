package PageObjects;

import org.openqa.selenium.By;

public class LoginElements {
    public static By UserNameTextBox = By.xpath("//input[@placeholder='Enter Username']");
    public static By PasswordTextBox = By.xpath("//input[@placeholder='Enter Password']");
    public static By SubmitButton = By.xpath("//button[@type='submit']");
    public static By SubscriptionPopupLaterButton = By.xpath("//*[@id='onesignal-slidedown-cancel-button']");
    public static By ResetAppButton = By.xpath("//*[text()='Reset App']");
    public static By ResetAppConfirmationPopupYesButton = By.xpath("//*[@id='pr_id_1']/div[3]/button[2]/span");
    public static By AccountMenuButton = By.xpath("((//*[text()='Hi,'])/../../..)/div[3]/div/div/span");
    public static By LogoutButton = By.xpath("//*[text()='Logout']");


}
