package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSettingsPage {
	WebDriver driver;
	
	public AccountSettingsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath = "//button[starts-with(@class, 'header-member')]")
    private WebElement memberHeader;
	
    @FindBy(linkText = "Preferences")
    private WebElement lnk_Preferences;
	
	@FindBy(xpath = "//a[@id='tab-emailPreferences']")
    private WebElement emailPreferences_Btn;
	
	@FindBy(xpath = "//form[@id='form0']/fieldset/div[1]/div/ul/li[3]/div/div/ins")
	private WebElement homeAlert_Chkbox;
	
	@FindBy (xpath = "//input[@value = 'Save']")
	private WebElement save_Btn;
	
	public void setPreferences()
	{
		//Code to set the preference of the user
		memberHeader.click();
		lnk_Preferences.click();
		emailPreferences_Btn.click();
		homeAlert_Chkbox.click();
		save_Btn.click();
}
}
 