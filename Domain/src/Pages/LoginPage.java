package Pages;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
    }
	
    @FindBy(xpath = "//a[contains(@class, 'sign-in')]")
    private WebElement Lnk_signIn;  
   
    @FindBy(xpath = "//input[@name = 'username']")
    private WebElement userNameTxt;
    
    @FindBy(xpath = "//input[@name = 'password']")
    private WebElement passwordTxt;    

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtn;
    
     
      public Object dologin(String UserName, String Password)
    {	//Code for Login into the application
    	  
    	  WebDriverWait wait = new WebDriverWait(driver, 10);
    	  Lnk_signIn = wait.until(ExpectedConditions.elementToBeClickable(Lnk_signIn));
    	  Lnk_signIn.click();
    	  userNameTxt.sendKeys(UserName);
    	  passwordTxt.sendKeys(Password);
    	  submitBtn.click(); 
    	boolean loginSuccess = true;
    	if(loginSuccess==true)
    		return PageFactory.initElements(driver, AccountSettingsPage.class);
    	else
    		return PageFactory.initElements(driver, LoginPage.class);    		
    		
    }
   
   
}
